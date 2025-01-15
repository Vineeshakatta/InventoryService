package com.example.microservices.inventory_service1.service;

import org.springframework.stereotype.Service;

import com.example.microservices.inventory_service1.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;
	
	public boolean isInStock(String skuCode, Integer quantity) {
		// find an inventory for a given skucode where quantity>0
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
	}

}
