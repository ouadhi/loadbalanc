package com.opendev.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BourseGetwayRestService {
	
	@Autowired
	private RestTemplate restTemplate  ;  
	
	@RequestMapping(value="/names")
	public  Collection<Societe> liSocietes() {
		ParameterizedTypeReference<Resource<Societe>>  responseType  =  
				new ParameterizedTypeReference<Resource<Societe>>() {
				};
		return (Collection<Societe>) restTemplate.exchange("http://societe-service/societes",HttpMethod.GET, null, responseType).
				getBody().getContent() ; 
	}

}


class Societe  {
	private  Long  id  ;  
	private String nomSociete  ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) { 
		this.id = id;
	}
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	} 
	
	
}