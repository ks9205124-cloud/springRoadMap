package com.shaurya.spring.ch14springbootdatapresistence.Repository;

import com.shaurya.spring.ch14springbootdatapresistence.Model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Integer> {

    @Query("SELECT a FROM Account a WHERE a.name = :name")
    List<Account> findByName(@Param("name") String name);

    @Modifying
    @Query("UPDATE Account a SET a.amount = :amount WHERE a.id = :id")
    void changeAmount(@Param("id") int id, @Param("amount") double amount);
}
