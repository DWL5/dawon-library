package com.dwl.dawon_library.di

import com.dwl.dawon_library.respository.Repository
import com.dwl.dawon_library.respository.RepositoryImpl
import com.dwl.dawon_library.source.RemoteDataSource
import com.dwl.dawon_library.source.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract fun bindRemoteDataSource(remoteDataSource: RemoteDataSourceImpl): RemoteDataSource

}

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindRepository(repository: RepositoryImpl): Repository

}