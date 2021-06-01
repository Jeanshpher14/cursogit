package com.manager.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manager.app.dao.ComprasEntity;

@Repository
public interface IComprasRepository extends MongoRepository<ComprasEntity, String> {

	public List<ComprasEntity> findByFechaBetween (Date from, Date to);
}
