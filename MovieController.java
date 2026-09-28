package com.tickethub.controller;
import com.tickethub.model.Movie;
import com.tickethub.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins="*")
public class MovieController {
    private final MovieService service;
    public MovieController(MovieService service){this.service=service;}
    @GetMapping public List<Movie> all(){return service.all();}
    @PostMapping public Movie save(@RequestBody Movie movie){return service.save(movie);}
}