package com.criat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criat.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

	Store getByStoreId(int storeId);
	

}
