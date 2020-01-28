package com.opendev;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.opendev.dao.SocieteRepository;
import com.opendev.entities.Societe;
@EnableEurekaClient
@SpringBootApplication
public class SociteBourceServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SociteBourceServiceApplication.class, args);
		SocieteRepository  repository = ctx.getBean(SocieteRepository.class)  ;  
		
		Stream.of("a" , "b" ,"c").forEach(s->repository.save(new Societe(s)));
		
		repository.findAll().forEach(s->System.out.println(s.getNomSociete()));
	}

}
