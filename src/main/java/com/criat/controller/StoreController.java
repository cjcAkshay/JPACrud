package com.criat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criat.dto.ResponsDto;
import com.criat.exceptionHandler.StoreIdNotFoundException;
import com.criat.model.Store;
import com.criat.service.StoreService;
import com.criat.serviceImpl.storeServiceImpl;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	StoreService storeSer;
	
	/*
	 * @GetMapping("/allData") public List<Store> getAllStoreDetails() { return
	 * storeSer.getAllStoreDetails(); }
	 */
	
	@GetMapping("/allData")
	public ResponseEntity<ResponsDto> getAllStoreDetails()
	{
		ResponsDto response=storeSer.getAllStoreDetails();
		
		return new ResponseEntity<ResponsDto>(response,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public Store add(@RequestBody Store store)
	{
		return storeSer.add(store);
	}
	
	@GetMapping("/{storeId}")
	public Store getByStoreId(@PathVariable int storeId) throws StoreIdNotFoundException
	{
		//return storeSer.getByStoreId(storeId);
		
		Store store = storeSer.getByStoreId(storeId);
		if(store !=null)
		{
			return store;
		}
		else 
		{
		   throw new StoreIdNotFoundException("Store Id not found");	
		}
	}
	
	@PutMapping("/update")
	public Store updateByStoreId(@RequestBody Store store)
	{
		return storeSer.updateByStoreId(store);
		
	}
	
	/*
	 * @DeleteMapping("/{storeId}") public void deleteById(@PathVariable int
	 * storeId) { storeSer.deleteByStoreId(storeId); }
	 */
	
	
	  @DeleteMapping("/{storeId}")
	  public ResponseEntity<ResponsDto> deleteById(@PathVariable int storeId)
	  { 
		  ResponsDto response = storeSer.deleteByStoreId(storeId);
		  
		 return new ResponseEntity<ResponsDto> (response, HttpStatus.OK ) ;
	}
	 
	
	
	
	
}
