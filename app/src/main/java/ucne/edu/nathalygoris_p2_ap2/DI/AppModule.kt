package ucne.edu.nathalygoris_p2_ap2.DI


import dagger.Provides
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import ucne.edu.nathalygoris_p2_ap2.data.remote.dto.DepositoAPI
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton
import dagger.Module
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    const val BASE_URL = "https://sagapi-dev.azurewebsites.net/swagger/index.html"

    @Provides
    @Singleton
    fun providesMoshi(): Moshi =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

    @Provides
    @Singleton
    fun provideSistemaApi(): DepositoAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL) // Replace with your API base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(DepositoAPI::class.java)
    }
}