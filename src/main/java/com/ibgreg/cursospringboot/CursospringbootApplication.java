package com.ibgreg.cursospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibgreg.cursospringboot.services.S3Service;

@SpringBootApplication
public class CursospringbootApplication implements CommandLineRunner{

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(CursospringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\testes3\\user2.jpg");
	}

}