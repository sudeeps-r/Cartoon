package com.demo.hilt.data.remote

import com.demo.hilt.data.entities.Character
import com.demo.hilt.data.entities.CharacterList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Response

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters(): Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}