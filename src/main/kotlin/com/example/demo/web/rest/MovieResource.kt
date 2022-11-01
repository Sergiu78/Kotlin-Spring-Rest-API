package com.example.demo.web.rest

import com.example.demo.dto.MovieDTO
import com.example.demo.service.MovieService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieResource(
    private val movieService: MovieService
) {
    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): MovieDTO {
        return movieService.createMovie(movieDTO)
    }
}