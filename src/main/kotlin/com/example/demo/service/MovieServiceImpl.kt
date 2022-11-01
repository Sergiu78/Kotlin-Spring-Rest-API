package com.example.demo.service

import com.example.demo.dto.MovieDTO
import com.example.demo.repository.MovieRepository
import com.example.demo.untils.mapper.MovieMapper
import org.springframework.stereotype.Service

@Service
class MovieServiceImp(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
): MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        val movie = movieMapper.toEntity(movieDTO)
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }
}