package com.tutorial.musiccatalogservice.resource;

import com.tutorial.musiccatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
    @RequestMapping("/{musicId}")
    public Rating getRating(@PathVariable("musicId") String musicId){
        return new Rating(musicId,4);
    }
}
