package br.com.core.network.di

import br.com.core.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


//    @Singleton
//    @Provides
//    fun provideConverterFactory(): GsonConverterFactory =
//        GsonConverterFactory.create()

//    @Provides
//    @Singleton
//    fun providesRetrofit(
//        baseUrl: String,
//        okHttpClient: OkHttpClient,
//        gsonConverterFactory: GsonConverterFactory
//    ): Retrofit = Retrofit.Builder()
//        .baseUrl(baseUrl)
//        .client(okHttpClient)
//        .addConverterFactory(gsonConverterFactory)
//        .build()
}