package com.mycodestuffs.recipeapp.repositories;

import com.mycodestuffs.recipeapp.domain.Category;
import com.mycodestuffs.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
