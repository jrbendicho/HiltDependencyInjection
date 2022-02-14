package com.example.hiltdependencyinjection.dimodules;

import com.example.hiltdependencyinjection.domain.services.datasource.IDataSource;
import com.example.hiltdependencyinjection.domain.services.datasource.network.NetworkDataSource;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class) // Installs MainModule in the generate SingletonComponent.
final public class MainModule {

    @Provides
    static IDataSource injectDataSource(){
        return new NetworkDataSource();
    }
}