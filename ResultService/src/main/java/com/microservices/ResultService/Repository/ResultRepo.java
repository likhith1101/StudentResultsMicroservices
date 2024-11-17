package com.microservices.ResultService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.ResultService.Entity.Result;

public interface ResultRepo extends JpaRepository<Result,Long>{

}
