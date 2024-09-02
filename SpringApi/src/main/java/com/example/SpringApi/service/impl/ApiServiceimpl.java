package com.example.SpringApi.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.SpringApi.domain.apiResponse;
import com.example.SpringApi.service.springapi.ApiService;

@Service
public class ApiServiceimpl implements ApiService {

    @Override
    public apiResponse getCurrentJokes() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", apiResponse.class);
    }
    
    @Override
    public apiResponse getPastjoke(String jokeNum) {
        RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject("https://official-joke-api.appspot.com/types/+ jokeNum +", apiResponse.class);
    }

}
