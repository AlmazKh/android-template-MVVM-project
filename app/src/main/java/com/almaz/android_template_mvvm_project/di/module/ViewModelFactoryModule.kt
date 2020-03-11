package com.almaz.android_template_mvvm_project.di.module

import androidx.lifecycle.ViewModelProvider
import com.almaz.itis_booking.utils.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
