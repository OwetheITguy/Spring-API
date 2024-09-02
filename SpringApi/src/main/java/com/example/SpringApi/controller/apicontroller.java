package com.example.SpringApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringApi.domain.apiResponse;
import com.example.SpringApi.service.springapi.ApiService;

@RestController
public class apicontroller {

    @Autowired
    private ApiService ApiService;
    
    @GetMapping("/current")
    public apiResponse getJokes() {
        return ApiService.getCurrentJokes();
     }
    @GetMapping("/past/{jokeNum}")
    public apiResponse getPastJokePathVar(@PathVariable String jokeNum){
        return ApiService.getPastjoke(jokeNum);
     }

     @GetMapping("/pastOptional")
    public apiResponse getPastJokeRequestParam(@RequestParam("jokeNum") String jokeNum) {
        return ApiService.getPastjoke(jokeNum);
     }

    }

