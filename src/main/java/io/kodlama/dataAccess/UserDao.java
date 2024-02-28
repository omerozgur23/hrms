package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
