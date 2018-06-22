package com.sivainc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sivainc.model.Product;
import com.sivainc.repository.ProductRepository;
 
@RestController("/products")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Product> getById(@PathVariable Integer id) {
		return productRepository.findById(id);
	}

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@PostMapping(value = "/")
	public Product save(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Integer id) {
		productRepository.deleteById(id);
	}

	@DeleteMapping(value = "/")
	public void deleteAll() {
		productRepository.deleteAll();
	}
}
