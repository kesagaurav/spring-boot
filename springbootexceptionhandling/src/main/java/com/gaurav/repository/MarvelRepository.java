package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Marvel;

@Repository
public interface MarvelRepository extends JpaRepository<Marvel, Integer> {

}
