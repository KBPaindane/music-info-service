package com.tutorial.musiccatalogservice.resource;



import com.tutorial.musiccatalogservice.models.Music;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class MusicResource {

    @RequestMapping("/{musicId}")
    public Music getMovieinfo(@PathVariable("musicId")String musicId){
        return new Music(musicId,"Rap");
    }
}
