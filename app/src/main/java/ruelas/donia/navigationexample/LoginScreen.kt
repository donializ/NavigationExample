package ruelas.donia.navigationexample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(navigateToMainMenu: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "LOGIN SCREEN")
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToMainMenu() }) {
            Text(text = "Go to main menu")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen{}
}