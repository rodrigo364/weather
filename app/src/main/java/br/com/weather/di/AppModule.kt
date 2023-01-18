package br.com.weather.di

import br.com.weather.BuildConfig.*
import br.com.weather.data.network.service.RealtimeWeatherService
import br.com.weather.data.repository.RealTimeWeatherRepositoryImp
import br.com.weather.domain.repository.RealTimeWeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun makeApiKeyInterceptor(): Interceptor {
        return Interceptor {
            var request = it.request()
            val url = request.url.newBuilder()
                .build()

            request = request.newBuilder()
                .header("X-RapidAPI-Key", XRAPID_API_KEY)
                .url(url).build()
            it.proceed(request)
        }
    }

    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            level = if(DEBUG) HttpLoggingInterceptor.Level.BODY
            else HttpLoggingInterceptor.Level.NONE
        }

        return OkHttpClient
            .Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(makeApiKeyInterceptor())
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun provideConverterFactory(): GsonConverterFactory =
        GsonConverterFactory.create()

    @Provides
    @Singleton
    fun providesRealtimeWeatherService(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): RealtimeWeatherService = Retrofit
        .Builder()
        .run {
            baseUrl(BASE_URL)

                .client(okHttpClient)
            addConverterFactory(gsonConverterFactory)
            build()
        }.create(RealtimeWeatherService::class.java)


    @Provides
    @Singleton
    fun provideRealTimeWeatherRepository(api: RealtimeWeatherService): RealTimeWeatherRepository {
        return RealTimeWeatherRepositoryImp(api)
    }

}