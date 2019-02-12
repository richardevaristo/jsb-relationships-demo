package com.richardevaristo.springJpaTest.OneToOne.dao;

import com.richardevaristo.springJpaTest.OneToOne.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    Profile findProfileById(int id);
    Profile findProfileByUserId(int id);
    Boolean existsByUserId(int id);
}
