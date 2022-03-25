package com.student.entity;

import javax.persistence.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ProductInfo")
@Entity
public class ProductInfo {
    private String id;
    private String msrp;
    private String cost;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    @DynamoDBAttribute
    public String getMsrp() {
        return msrp;
    }

    @DynamoDBAttribute
    public String getCost() {
        return cost;
    }

    // standard setters/constructors
}