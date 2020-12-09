package com.springDevmind.Quiz4.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Project: Quiz4
 * Author: mihai
 * Date: 12/9/2020
 */

@Service
@Slf4j
public class SumService {

    public int sum(int first, int second){
        log.info("First number: " + String.valueOf(first));
        log.info("First number: " + String.valueOf(second));
        return (first + second);
    }
}
