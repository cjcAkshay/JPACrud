package com.criat.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criat.dto.ResponsDto;
import com.criat.model.Store;
import com.criat.repository.StoreRepository;
import com.criat.service.StoreService;

@Service
public class storeServiceImpl implements StoreService {

	@Autowired
	StoreRepository storeRepo;
	
	@Override
	public ResponsDto getAllStoreDetails() {
		ResponsDto response=new ResponsDto();
		
		List<Store> list=storeRepo.findAll();
		
		response.setResponseData(list);
		response.setResponseMsg("We got all data");
		response.setResult("Success");
		return response;
	}

	@Override
	public Store add(Store store) {
		return storeRepo.save(store);
	}

	@Override
	public Store getByStoreId(int storeId) {
		return storeRepo.getByStoreId(storeId);
	}

	@Override
	public Store updateByStoreId(Store store) {
		Store st = storeRepo.getByStoreId(store.getStoreId());
		if(st!=null)
		{
			st.setStoreName(store.getStoreName());
			st.setStoreAddress(store.getStoreAddress());
			
		return	storeRepo.save(st);
		}
		else
		{
			System.out.println("Data not found for storeId : "+ store.getStoreId());
		}
		
		return null;
	}

	@Override
	public ResponsDto deleteByStoreId(int storeId) {
        
		ResponsDto response = new ResponsDto();
		
		response.setResponseMsg("deleted required storeId");
		response.setResult("Success");
		
		
		return response;
		
	}

	
	
	
	
	
	
	
}
