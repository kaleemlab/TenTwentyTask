package com.example.tentwenty.ui.book

import com.gnova.domain.models.Trailer


sealed class BookViewState {

    data class Presenting( val results: List<Trailer>) : BookViewState()

    object Error : BookViewState()

    object Loading : BookViewState()
}