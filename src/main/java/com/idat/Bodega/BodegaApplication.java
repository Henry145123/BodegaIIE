package com.idat.Bodega;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.idat.idataula.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BodegaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodegaApplication.class, args);
	}

}
