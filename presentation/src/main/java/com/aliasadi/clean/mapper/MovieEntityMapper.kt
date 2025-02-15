package com.aliasadi.clean.mapper

import com.aliasadi.clean.entities.MovieListItem
import com.aliasadi.domain.entities.MovieEntity

/**
 * @author by Ali Asadi on 26/08/2022
 */
object MovieEntityMapper {

    fun toPresentation(movieEntity: MovieEntity) = MovieListItem.Movie(
        id = movieEntity.id,
        imageUrl = movieEntity.image
    )

}