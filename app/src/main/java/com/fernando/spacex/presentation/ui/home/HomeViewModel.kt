package com.fernando.spacex.presentation.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.core.domain.usecases.flight.GetFlightsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getFlightsUseCase: GetFlightsUseCase
) : ViewModel() {

    private val _flights = MutableLiveData<List<FlightEntity>>()
    val flights = _flights

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading = _isLoading

    init {
        loadFlights()
    }

    private fun loadFlights() = viewModelScope.launch(Main) {
        startLoading()
        getFlightsUseCase().fold({ flights ->
            _flights.value = flights
            stopLoading()
        }, ::onError)
    }


    private fun startLoading() {
        _isLoading.value = true
    }

    private fun stopLoading() {
        _isLoading.value = false
    }

    private fun onError(exception: Exception) {
        Timber.e(exception)
        stopLoading()
    }

}