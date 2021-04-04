package com.joe.petfinder.domain.pagination

data class Pagination(val currentPage: Int, val totalPages: Int) {
    companion object {
        const val DEFAULT_PAGE_SIZE = 20
        const val UNKNOWN_TOTAL = -1
    }

    val canLoadMore: Boolean
        get() = totalPages == UNKNOWN_TOTAL || currentPage < totalPages
}