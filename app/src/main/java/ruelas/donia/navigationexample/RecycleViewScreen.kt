package ruelas.donia.navigationexample

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RecyclerViewScreen () {
    LazyRow {
        item { Text(text = "Juan perez") }
        item { Text(text = "Critthian Lopez") }
        item { Text(text = "Tercer item") }
        item { Text(text = "Cuarto item") }
        item { Text(text = "Quinto item") }
        item { Text(text = "Sexto item") }
        item { Text(text = "Septimo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
        item { Text(text = "Octavo item") }
    }
}
@Composable
fun RecyclerViewScreenIterator () {
    LazyColumn {
        items(700) { elemento ->
            Text(text = "Este es el item $elemento")
        }
    }
}


@Composable
fun RecyclerViewScreenWithList () {
    val myListBestFriend = listOf("Aparicio","Juan","María", "Pepe", "Ronald", "Estela")
    LazyColumn {
        items(myListBestFriend){
            Text(text = "Hola $it")
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun ListaMejoresAmigos(){
    val misAmigos = listOf(
        Persona("Juan Perez Quispe", "999999991", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Aparicio Juli Perez", "966666666", "Masculino"),
        Persona("Juana Perez Quispe", "9877777777", "Femenino")
    )
    LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        items(misAmigos){
            ElementoItem(persona = it)
        }
    }


}

@Composable
fun ElementoItem(persona: Persona){
    Card (border = BorderStroke(2.dp, Color.Red), modifier = Modifier.width(200.dp)) {
        Column{
            Image(painter = painterResource(id = R.drawable.im_bill_gates), contentDescription = "Icono de persona.", modifier = Modifier.width(100.dp))

            Text(text = persona.nombre)
            Row {
                Text(text = persona.telefono)
                Text(text = persona.genero)
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }

}