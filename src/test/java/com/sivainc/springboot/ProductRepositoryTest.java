package com.sivainc.springboot;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sivainc.model.Product;
import com.sivainc.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

	@Autowired
	ProductRepository productRepository;

	@Before
	public void setUp() throws Exception {
		Product product = new Product();
		product.setId(1);
		product.setManufacturer("ABC Inc");
		product.setMfgDate(new Date());
		product.setProductPrice(new Float("10.5"));
		productRepository.save(product);
	}

	@Test
	public void getById() {
		Optional<Product> product = productRepository.findById(1);
		assertNotNull(product.isPresent());
	}

	@Test
	public void save() {
		Product product = new Product();
		product.setManufacturer("ABC Inc");
		product.setMfgDate(new Date());
		product.setProductPrice(new Float("10.5"));
		assertNull(product.getId());
		productRepository.save(product);
		assertNotNull(product.getId());
	}

	@After
	public void tearDown() throws Exception {
		Product product = new Product();
		product.setId(1);
		product = productRepository.findById(1).get();
		assertNull(product.getId());
		productRepository.delete(product);

	}

}
