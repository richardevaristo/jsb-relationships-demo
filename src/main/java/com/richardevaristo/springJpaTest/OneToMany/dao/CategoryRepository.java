package com.richardevaristo.springJpaTest.OneToMany.dao;

import com.richardevaristo.springJpaTest.OneToMany.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
