package com.dzero.databasefacing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author DZero
 */
@Data
@Entity
@Document(collection = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private String id;
    private String userName;
    private String passWord;
}
