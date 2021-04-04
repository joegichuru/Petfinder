package com.joe.petfinder.domain.animal.values

data class HealthDetails(  val isSpayedOrNeutered: Boolean,
                           val isDeclawed: Boolean,
                           val hasSpecialNeeds: Boolean,
                           val shotsAreCurrent: Boolean)
