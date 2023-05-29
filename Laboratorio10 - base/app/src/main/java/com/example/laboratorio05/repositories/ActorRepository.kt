package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel

class ActorRepository(private val ActorDao: ActorDao) {
        suspend fun getAllActors() = ActorDao.getAllActors()

        suspend fun addActors(actor: ActorModel) = ActorDao.insertActors(actor)
}