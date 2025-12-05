package com.example.DailyUpdates.dto;

import com.example.DailyUpdates.Models.Articles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class NewsResponse {
    int totalResults;
    List<Articles> articles;
}
