package com.example.my_spring_app.post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,String> {
}
