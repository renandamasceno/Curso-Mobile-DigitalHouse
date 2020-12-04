package com.renan.aula39.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.renan.aula39.cartao.dao.CartaoDao
import com.renan.aula39.cartao.entity.CartaoEntity

@Database(
    entities = [CartaoEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun cartaoDao(): CartaoDao

    companion object{
        fun getDatabase(context:Context): AppDatabase {
            val instancia = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
            "pagBem"
            ).build()

            return instancia
        }
    }
}