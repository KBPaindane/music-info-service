package com.tutorial.musiccatalogservice.resource;

import com.tutorial.musiccatalogservice.models.CatalogItem;
import com.tutorial.musiccatalogservice.models.Music;
import com.tutorial.musiccatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        RestTemplate restTemplate = new RestTemplate();

        List<Rating> ratings = Arrays.asList(
            new Rating("Onfire",5),
            new Rating("PromQueen",4)
        );

       return ratings.stream().map(rating -> {
          Music music = restTemplate.getForObject("localhost:8081/movies/2" + rating.getmusicId(), Music.class);
           new CatalogItem("Lil wayne","rap",4)
       })
               .collect(Collectors.toList());

//        return Collections.singletonList(
//                new CatalogItem("Lilwayne","OnFire",4)
//        );
    }

}
