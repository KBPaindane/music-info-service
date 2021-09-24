package com.tutorial.musicinfoservice.resources;

import com.tutorial.musicinfoservice.models.Music;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MusicResource {

    @RequestMapping("/{movieId}")
    public Music getMovieinfo(@PathVariable("movieId")String movieId){
        return new Music(movieId,"Rap");
    }
}
