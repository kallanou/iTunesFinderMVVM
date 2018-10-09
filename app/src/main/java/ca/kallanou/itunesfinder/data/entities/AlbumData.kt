package ca.kallanou.itunesfinder.data.entities

import java.util.*

data class AlbumData(val artistId: Int = 0,
                     val artworkUrl60: String = "",
                     val artworkUrl100: String = "",
                     val country: String = "",
                     val copyright: String = "",
                     val collectionViewUrl: String = "",
                     val contentAdvisoryRating: String = "",
                     val amgArtistId: Int = 0,
                     val releaseDate: Date? = null,
                     val collectionPrice: Double = 0.0,
                     val primaryGenreName: String = "",
                     val collectionName: String = "",
                     val artistViewUrl: String = "",
                     val collectionType: String = "",
                     val collectionExplicitness: String = "",
                     val trackCount: Int = 0,
                     val wrapperType: String = "",
                     val artistName: String = "",
                     val currency: String = "",
                     val collectionId: Int = 0,
                     val collectionCensoredName: String = "")