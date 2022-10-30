package com.example.demo.service

import com.example.demo.dto.MovieDTO
import com.example.demo.repository.MovieRepository
import com.example.demo.untils.mapper.MovieMapper

class MovieServiceImp(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
): MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        movieRepository.save(movieMapper.toEntity(movieDTO))
        return movieDTO
    }
}