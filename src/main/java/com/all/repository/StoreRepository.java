package com.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.all.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

}
