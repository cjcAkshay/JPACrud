package com.criat.service;



import com.criat.dto.ResponsDto;
import com.criat.model.Store;



public interface StoreService {

	public ResponsDto getAllStoreDetails();
	
	public Store add(Store store);
	
	public Store getByStoreId(int storeId);
	
	public Store updateByStoreId(Store store);
	
	public ResponsDto deleteByStoreId(int storeId);
}
