package pjatk.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pjatk.movie.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(name = "Movie.findAll")
    List<Movie> findAllMovies();

    @Query(name = "Movie.findByTitle")
    List<Movie> findByTitle(String title);

    @Query(name = "Movie.findByReleaseYear")
    List<Movie> findByReleaseYear(int releaseYear);


}
