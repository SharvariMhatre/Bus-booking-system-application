package com.example.busbook.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProfileDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(profile: ProfileEntity)

    @Query("SELECT * FROM profiles WHERE uid = :uid LIMIT 1")
    fun observe(uid: String): LiveData<ProfileEntity?>

    @Query("SELECT * FROM profiles WHERE uid = :uid LIMIT 1")
    suspend fun get(uid: String): ProfileEntity?
}
