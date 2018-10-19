package com.shenjy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 【 ES实体类 】
 *
 * @author shenjy 2017/12/15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "accounts", type = "person")
public class Account {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String motto;

    @Field
    private Integer age;
}