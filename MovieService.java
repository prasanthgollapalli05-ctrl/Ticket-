package com.tickethub.service;
import com.tickethub.model.Movie;
import com.tickethub.repository.MovieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repo;
    public MovieService(MovieRepository repo){this.repo=repo;}
    public List<Movie> all(){return repo.findAll();}
    public Movie save(Movie movie){return repo.save(movie);}
}