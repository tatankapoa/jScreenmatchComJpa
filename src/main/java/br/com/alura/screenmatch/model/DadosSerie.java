package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
 						 @JsonAlias("Genre") String genero,
 						 @JsonAlias("Actors") String autores,
 						 @JsonAlias("Poster") String urlPoster,
 						 @JsonAlias("Plot") String sinopse){
}
