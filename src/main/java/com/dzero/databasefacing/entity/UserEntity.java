package com.dzero.databasefacing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 用户
 * @author DZero
 */
@Data
@Entity
@Document(collection = "user")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue
    private String id;

    private String userNo;

    private String userName;

    private Integer sex;

    private String phoneNo;

    private String passWord;

    private String salt;

}



