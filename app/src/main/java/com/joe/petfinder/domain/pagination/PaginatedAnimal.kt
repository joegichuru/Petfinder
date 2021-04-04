package com.joe.petfinder.domain.pagination

import com.joe.petfinder.domain.animal.Animal
import com.joe.petfinder.domain.animal.details.AnimalDetail

data class PaginatedAnimal(val animals: List<AnimalDetail>, val pagination: Pagination)