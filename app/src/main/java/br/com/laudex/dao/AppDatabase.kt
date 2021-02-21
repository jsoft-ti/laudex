package br.com.laudex.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.laudex.entities.Laudo

@Database(entities = arrayOf(Laudo::class),version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun laudoDao():LaudoDao
}