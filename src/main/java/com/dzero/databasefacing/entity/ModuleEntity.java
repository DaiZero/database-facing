package com.dzero.databasefacing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 模块
 *
 * @author DZero
 * @date 2020/3/18 23:29
 */
@Data
@Entity
@Document(collection = "module")
public class ModuleEntity implements Serializable {
    @Id
    @GeneratedValue
    private String id;

}
