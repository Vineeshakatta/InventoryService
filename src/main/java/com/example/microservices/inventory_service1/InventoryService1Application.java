package com.example.microservices.inventory_service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(InventoryService1Application.class, args);
	}
//	loading data with either commandlinerunner or flywaydb, check src/main/resources/db/migration
//	@Bean
//    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//    	return args -> {
//    		Inventory inventory1 = new Inventory();
//    		inventory1.setSkuCode("iphone_15");
//    		inventory1.setQuantity(100);
//    		
//    		Inventory inventory2 = new Inventory();
//    		inventory2.setSkuCode("pixel_8");
//    		inventory2.setQuantity(100);
//    		
//    		Inventory inventory3 = new Inventory();
//    		inventory3.setSkuCode("galaxy_24");
//    		inventory3.setQuantity(100);
//    		
//    		Inventory inventory4 = new Inventory();
//    		inventory4.setSkuCode("oneplus_12");
//    		inventory4.setQuantity(100);
//    		
//    		inventoryRepository.save(inventory1);
//    		inventoryRepository.save(inventory2);
//    		inventoryRepository.save(inventory3);
//    		inventoryRepository.save(inventory4);
//    		
//    	};
//    }

}
