package com.dzero.databasefacing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 数据表
 * @author DZero
 */
@Data
@Entity
@Document(collection = "table")
public class TableEntity implements Serializable {
    @Id
    @GeneratedValue
    private String id;

    private String dbId;

    private String tableName;
}
