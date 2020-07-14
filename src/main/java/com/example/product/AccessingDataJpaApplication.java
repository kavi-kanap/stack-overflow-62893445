package com.example.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class AccessingDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AccessingDataJpaApplication.class);
		ProductRepository repo = context.getBean(ProductRepository.class);

		Product product = new Product(1l, "sfsd");
		ProductTranslation translationOne = new ProductTranslation(product, 2l);
		ProductTranslation translationTwo = new ProductTranslation(product, 1l);
		product.setProductTranslations(Arrays.asList(translationOne, translationTwo));

		repo.save(product);
		System.out.println("Product found :" + repo.findAll().size());
		repo.deleteById(product.getId());
		System.out.println("Product found after delete:" + repo.findAll().size());




	}
}