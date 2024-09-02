package com.example.SpringApi.service.springapi;

import com.example.SpringApi.domain.apiResponse;

public interface ApiService {
     apiResponse getCurrentJokes(); 
     
     apiResponse getPastjoke(String jokeNum);

     
       
    
}


