package me.rodolfohernandez.marsphotosapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import me.rodolfohernandez.marsphotosapp.ui.screen.HomeScreen
import me.rodolfohernandez.marsphotosapp.ui.screen.MarsViewModel

@Composable
fun MarsPhotosApp() {
    val viewModel: MarsViewModel = viewModel(factory = MarsViewModel.Factory)
    Scaffold() { innerPadding ->
        HomeScreen(
            marsUiState = viewModel.marsUiState,
            retryAction = viewModel::retryAction,
            modifier = Modifier.padding(innerPadding),
        )
    }
}
