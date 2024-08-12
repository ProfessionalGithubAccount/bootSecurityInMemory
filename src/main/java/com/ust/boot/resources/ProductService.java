package com.ust.boot.resources;

import java.util.List;

public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);
}
