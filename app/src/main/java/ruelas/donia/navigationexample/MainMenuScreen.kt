package ruelas.donia.navigationexample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainMenuScreen (navigateToProfile:()-> Unit, navigateToMenuUno: ()->Unit) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "MAIN MENU SCREEN")
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToProfile() }) {
            Text(text = "Go to profile")
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToMenuUno() }) {
            Text(text = "Go to menu uno")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}