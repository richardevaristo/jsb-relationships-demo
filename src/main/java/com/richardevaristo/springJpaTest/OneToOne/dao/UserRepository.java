package com.richardevaristo.springJpaTest.OneToOne.dao;

import com.richardevaristo.springJpaTest.OneToOne.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(int id);
    User findUserByProfileId(int id);
}
