package com.example.examen.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow("Initial State")
    val uiState: StateFlow<String> = _uiState

    private val _itemList = MutableStateFlow(listOf("Item 1", "Item 2", "Item 3"))
    val itemList: StateFlow<List<String>> = _itemList.asStateFlow()

    fun onFabClicked() {
        _itemList.value = _itemList.value + "New Item"
    }

    fun onSettingsClicked() {
        _uiState.value = "Settings Opened"
    }
}
