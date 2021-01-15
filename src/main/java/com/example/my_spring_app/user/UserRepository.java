package com.example.my_spring_app.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,String> {
    public List<User> findByLocationId(String locationId);
}
