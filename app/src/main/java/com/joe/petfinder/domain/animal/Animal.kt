package com.joe.petfinder.domain.animal

import com.joe.petfinder.domain.animal.values.AdoptionStatus
import com.joe.petfinder.domain.animal.values.Media
import org.threeten.bp.LocalDateTime


data class Animal(val id:Long,
                  val name:String,
                  val type:String,
                  val media: Media,
                  val tags:List<String>,
                  val adoptionStatus: AdoptionStatus,
                  val publishedAt: LocalDateTime
                  )