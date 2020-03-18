package com.dzero.databasefacing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author DZero
 * @date 2020/3/18 23:23
 */
@Data
@Entity
@Document(collection = "db_connection")
public class DbConnectionEntity implements Serializable {
    @Id
    @GeneratedValue
    private String id;
}
