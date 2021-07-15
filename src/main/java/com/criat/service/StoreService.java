package com.criat.service;

import java.util.List;

import com.criat.dto.ResponsDto;
import com.criat.model.Store;



public interface StoreService {

	public ResponsDto getAllStoreDetails();
	
	public Store add(Store store);
	
	public Store getByStoreId(int storeId);
	
	public Store updateByStoreId(Store store);
	
	public void deleteByStoreId(int storeId);
}
