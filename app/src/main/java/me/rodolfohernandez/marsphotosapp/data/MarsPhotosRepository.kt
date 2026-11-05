package me.rodolfohernandez.marsphotosapp.data

import me.rodolfohernandez.marsphotosapp.network.MarsApi
import me.rodolfohernandez.marsphotosapp.network.MarsPhoto

interface MarsPhotosRepository{
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository() : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotos()
    }
}
