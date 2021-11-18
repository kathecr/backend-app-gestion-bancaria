package com.app.appbanco;

import com.app.appbanco.entity.Cliente;
import com.app.appbanco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AppBancoApplication {
	@Autowired
	static ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppBancoApplication.class, args);
		System.out.println("Hola testt");

	}
}
