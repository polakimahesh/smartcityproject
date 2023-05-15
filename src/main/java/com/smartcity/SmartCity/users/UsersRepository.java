package com.smartcity.SmartCity.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

     List<Users> findAllByOrderByIdAsc();
}
