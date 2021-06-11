package com.example.gm_challenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Result(
    val artistId: Int?, // 1798556
    val artistName: String?, // Maroon 5
    val artistViewUrl: String?, // https://music.apple.com/us/artist/maroon-5/1798556?uo=4
    val artworkUrl100: String?, // https://is4-ssl.mzstatic.com/image/thumb/Music125/v4/84/a2/ba/84a2ba66-445b-3c8a-4e85-81c9f49b3a03/source/100x100bb.jpg
    val artworkUrl30: String?, // https://is4-ssl.mzstatic.com/image/thumb/Music125/v4/84/a2/ba/84a2ba66-445b-3c8a-4e85-81c9f49b3a03/source/30x30bb.jpg
    val artworkUrl60: String?, // https://is4-ssl.mzstatic.com/image/thumb/Music125/v4/84/a2/ba/84a2ba66-445b-3c8a-4e85-81c9f49b3a03/source/60x60bb.jpg
    val collectionArtistId: Int?, // 36270
    val collectionArtistName: String?, // Various Artists
    val collectionArtistViewUrl: String?, // https://music.apple.com/us/artist/shamelessdab/1438942450?uo=4
    val collectionCensoredName: String?, // What Lovers Do (feat. SZA) - Single
    val collectionExplicitness: String?, // notExplicit
    val collectionId: Int?, // 1444618662
    val collectionName: String?, // What Lovers Do (feat. SZA) - Single
    val collectionPrice: Double?, // 1.29
    val collectionViewUrl: String?, // https://music.apple.com/us/album/what-lovers-do-feat-sza/1444618662?i=1444618664&uo=4
    val contentAdvisoryRating: String?, // Explicit
    val country: String?, // USA
    val currency: String?, // USD
    val discCount: Int?, // 1
    val discNumber: Int?, // 1
    val isStreamable: Boolean?, // true
    val kind: String?, // song
    val previewUrl: String?, // https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview125/v4/c1/8b/8b/c18b8b9b-8132-e825-7e7a-bd11067f5242/mzaf_368312339105804796.plus.aac.p.m4a
    val primaryGenreName: String?, // Pop
    val releaseDate: String?, // 2017-08-30T12:00:00Z
    val trackCensoredName: String?, // What Lovers Do (feat. SZA)
    val trackCount: Int?, // 1
    val trackExplicitness: String?, // notExplicit
    val trackId: Int?, // 1444618664
    val trackName: String?, // What Lovers Do (feat. SZA)
    val trackNumber: Int?, // 1
    val trackPrice: Double?, // 1.29
    val trackTimeMillis: Int?, // 199849
    val trackViewUrl: String?, // https://music.apple.com/us/album/what-lovers-do-feat-sza/1444618662?i=1444618664&uo=4
    val wrapperType: String? // track
) : Parcelable