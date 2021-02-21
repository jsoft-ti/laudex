package br.com.laudex.dao

import androidx.annotation.WorkerThread
import br.com.laudex.entities.Laudo

class LaudoRepository(private val laudoDao:LaudoDao) {

    @WorkerThread
    suspend fun insert(laudo: Laudo){
        laudoDao.insert(laudo)
    }
}