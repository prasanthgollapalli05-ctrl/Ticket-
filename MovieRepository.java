package com.tickethub.repository;
import com.tickethub.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MovieRepository extends JpaRepository<Movie,Long> {}