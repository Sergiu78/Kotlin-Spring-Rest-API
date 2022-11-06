package com.example.demo.web.rest

import com.example.demo.dto.MovieDTO
import com.example.demo.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class MovieResource(
    private val movieService: MovieService
) {
    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
    }

    @GetMapping
    fun getMovies(): ResponseEntity<List<MovieDTO>> =
        ResponseEntity.ok(movieService.getMovies())

    @GetMapping("/{id}")
    fun getMovie(@PathVariable id: Int) =
        ResponseEntity.ok(movieService.getMovie(id))

    @PutMapping
    fun updateMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> =
        ResponseEntity.ok(movieService.updateMovie(movieDTO))

}