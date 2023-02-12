package com.example.Sql_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name="library_card")
public class LibraryCard {

    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;

    @Enumerated(value = EnumType.STRING) // To store the values in DB in string format
    private CardStatus cardStatus;

    //child class will hav the foreign key of the parent class : through which it connects to the other table
    @OneToOne // mapping relation between two entities
    @JoinColumn // You are telling : add a foreign key column ---> define the column name of the parent class, byDefault it's the primary key of the parent class
    User user;
}
