package com.reactdemo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.reactdemo.model.Account;

public interface ReactiveAccountRepository extends ReactiveMongoRepository<Account, String> {

}
