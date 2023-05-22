package pjatk.movie.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQueries({
        @NamedQuery(name = "Movie.findAll",
                query = "SELECT m FROM Movie m"),
        @NamedQuery(name = "Movie.findByTitle",
                query = "SELECT m FROM Movie m WHERE m.title = :title"),
        @NamedQuery(name = "Movie.findByReleaseYear",
                query = "SELECT m FROM Movie m WHERE m.releaseYear = releaseYear")
})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private String category;
    private String description;
    private int releaseYear;

}
