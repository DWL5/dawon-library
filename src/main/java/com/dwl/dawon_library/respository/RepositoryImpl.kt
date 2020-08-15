package com.dwl.dawon_library.respository

import android.util.Log
import com.dwl.dawon_library.source.RemoteDataSource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSource) : Repository {
    override fun getDate(): String {
        Log.d("RepositoryImpl", "RepositoryImpl getDate() called.")
        return "Success"
    }

}