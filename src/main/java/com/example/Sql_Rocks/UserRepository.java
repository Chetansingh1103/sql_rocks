package com.example.Sql_Rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    // first part in <> : with whom to connect (entity) , what is the datatype of the primary key

}
