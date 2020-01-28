package com.opendev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.opendev.entities.Societe;

@RepositoryRestResource
public interface SocieteRepository extends  JpaRepository<Societe	,Long> {

}
