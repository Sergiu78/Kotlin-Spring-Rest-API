package com.example.demo.untils.mapper

import com.example.demo.dto.MovieDTO
import com.example.demo.entity.Movie
import org.springframework.stereotype.Service

@Service
class MovieMapper: Mapper<MovieDTO, Movie> {
   override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
       entity.id,
       entity.name,
       entity.rating
   )
    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )
}