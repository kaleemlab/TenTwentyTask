package com.example.tentwenty.di

import android.content.Context
import com.example.tentwenty.MainActivity
import com.example.tentwenty.di.modules.ApiModule
import com.example.tentwenty.di.modules.AppModule
import com.example.tentwenty.ui.detail.DetailFragment
import com.example.tentwenty.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: DetailFragment)

}