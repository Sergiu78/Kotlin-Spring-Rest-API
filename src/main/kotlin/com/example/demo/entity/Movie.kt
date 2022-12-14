package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Movie(id: Int, name: String, rating: Double) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = id
    var name = name
    var rating = rating
}
