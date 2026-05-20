package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DessertClickerViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(DessertClickerUiState())
    val uiState: StateFlow<DessertClickerUiState> = _uiState.asStateFlow()

    fun sellDessert() {
        _uiState.update { currentState ->
            currentState.copy(
                totalRevenue = currentState.totalRevenue + currentState.dessertPrice,
                totalDessertsSold = currentState.totalDessertsSold + 1
            )
        }
    }
}