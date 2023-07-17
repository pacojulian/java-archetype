package com.example.archetype.out.repository;

import com.example.archetype.out.entity.R2BCUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface R2BCPersonRepository extends ReactiveCrudRepository<R2BCUser,Long> {

}
