package com.example.examen.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.examen.data.Items

@Database(entities = arrayOf(Items::class), version = 1, exportSchema = false)
abstract class DatabaseApp : RoomDatabase(){

    abstract fun dataDao(): ItemsDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: DatabaseApp? = null

        fun getDatabase(context: Context): DatabaseApp {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseApp::class.java,
                    "Database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}