package com.gaurav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	@Query(" from Person where name=:n and city=:c")
	List<Person> findByNameAndCity(@Param("n") String name,@Param("c")String city);
	@Query(" from Person where name=:n and salarly=:s")
	List<Person> findByNameAndSalarly(@Param("n") String name,@Param("s") String salarly);
	List<Person> findByGenderAndContact(String contact,String gender);
	
	
	
}
