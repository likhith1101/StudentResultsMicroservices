package com.microservices.ResultService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.ResultService.Repository.ResultRepo;

@Service
public class ResultService {

    @Autowired
    private ResultRepo resultRepo;

}
