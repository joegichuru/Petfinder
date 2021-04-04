package com.joe.petfinder.domain.animal.details

import com.joe.petfinder.domain.animal.values.AdoptionStatus
import com.joe.petfinder.domain.animal.values.Details
import com.joe.petfinder.domain.animal.values.Media
import org.threeten.bp.LocalDateTime

data class AnimalDetail(val id:String, val name:String,
                        val type:String,
                        val media: Media,
                        val tags:List<String>,
                        val adoptionStatus: AdoptionStatus,
                        val publishedAt: LocalDateTime,
                        val details: Details
)

