package com.joe.petfinder.domain.animal.values

import com.joe.petfinder.domain.organization.Organization

data class Details(
    val description: String,
    val age: Age,
    val species: String,
    val breed: Breed,
    val colors: Colors,
    val gender: Gender,
    val size: Size,
    val coat: Coat,
    val healthDetails: HealthDetails,
    val habitatAdaptation: HabitatAdaptation,
    val organization: Organization
)
