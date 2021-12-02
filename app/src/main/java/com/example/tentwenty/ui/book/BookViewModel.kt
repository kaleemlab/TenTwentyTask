package com.example.tentwenty.book

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tentwenty.ui.book.BookViewState
import com.example.tentwenty.ui.detail.DetailViewState
import com.gnova.data.repositories.MovieRepoImpl
import com.gnova.domain.models.Movie
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class BookViewModel @Inject constructor(private val movieRepoImpl: MovieRepoImpl) : ViewModel() {

    fun onViewInit(movie: Movie) {

    }

    val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    protected fun add(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

}