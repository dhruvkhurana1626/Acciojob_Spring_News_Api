package com.example.DailyUpdates.Service;

import com.example.DailyUpdates.dto.NewsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    private final String BASE_URL = "https://newsapi.org/v2/top-headlines";
    private final String API_KEY = "da39d5ec3ade4913b76be7b08ebb41e6";

    public NewsResponse getNews(String country) {
        String url = BASE_URL+"?country="+country+"&apiKey="+API_KEY;
        NewsResponse response = restTemplate.getForObject(url,NewsResponse.class);
        return response;
    }
}
