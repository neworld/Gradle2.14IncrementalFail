package lt.neworld.entities

import org.parceler.Parcel

/**
 * @author Andrius Semionovas
 * @since 2016-07-25
 */
@Parcel
data class User(
        val name: String? = null,
        val surname: String? = null,
        val age: Int? = null
)