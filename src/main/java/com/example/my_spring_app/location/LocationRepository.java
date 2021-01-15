package com.example.my_spring_app.location;

import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,String> {
}
