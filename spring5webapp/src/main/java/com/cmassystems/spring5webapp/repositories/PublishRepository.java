package com.cmassystems.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cmassystems.spring5webapp.domain.Publisher;

public interface PublishRepository extends CrudRepository<Publisher, Long  >{

}
