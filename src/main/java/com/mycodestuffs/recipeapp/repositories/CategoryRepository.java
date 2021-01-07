package com.mycodestuffs.recipeapp.repositories;

import com.mycodestuffs.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
