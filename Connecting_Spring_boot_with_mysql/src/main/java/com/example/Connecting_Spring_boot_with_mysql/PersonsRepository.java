package com.example.Connecting_Spring_boot_with_mysql;

import org.springframework.data.repository.CrudRepository;

public interface PersonsRepository extends CrudRepository<Persons, Integer> {
}

