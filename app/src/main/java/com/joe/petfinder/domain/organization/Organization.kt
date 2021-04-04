package com.joe.petfinder.domain.organization

import com.joe.petfinder.domain.organization.values.Contact

data class Organization(val id: Long, val contact: Contact, val distance: Float)