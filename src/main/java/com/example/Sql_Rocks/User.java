package com.example.Sql_Rocks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jdk.jfr.Name;

@Entity  // So that hibernate can identify whose attributes to pick for table creation
@Table(name = "user_info") // this is just for the giving table name, byDefault : tableName == classname
public class User {
    @Id // it is written on that attribute which has become the primary key
    private int id; // id is the primary key

    private String name;

    private int age;

    private String mobileNumber;

    // Always create the default constructor
    public User() {

    }

    // good practice is to create all args constructor
    public User(int id, String name, int age,String mobileNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }


    //creating getter and setters
    //Shortcut is use Alt + Insert
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
