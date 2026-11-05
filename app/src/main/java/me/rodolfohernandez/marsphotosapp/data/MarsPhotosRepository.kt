package me.rodolfohernandez.marsphotosapp.data

import me.rodolfohernandez.marsphotosapp.network.MarsApiService
import me.rodolfohernandez.marsphotosapp.network.MarsPhoto

interface MarsPhotosRepository{
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(private val marsApiService: MarsApiService) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return marsApiService.getPhotos()
    }
}
