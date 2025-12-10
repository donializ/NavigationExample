package ruelas.donia.navigationexample.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import ruelas.donia.navigationexample.LoginScreen
import ruelas.donia.navigationexample.MainMenuScreen
import ruelas.donia.navigationexample.MenuUnoResultScreen
import ruelas.donia.navigationexample.MenuUnoScreen

/*define toda la navegación de tu app: pantallas,
 rutas y cómo pasar datos entre ellas.*/

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login89) {
        composable<Login89> {
            LoginScreen {
                navController.navigate(MainMenu)
            }
        }
        composable<MainMenu> {
            MainMenuScreen ({},{navController.navigate(MenuUno)})
        }

        composable<MenuUno> {
            MenuUnoScreen { navController.navigate(MenuUnoResult(name = it)) }
        }
        composable<MenuUnoResult> { backStackEntry->
            val previusMenu = backStackEntry.toRoute<MenuUnoResult>()
            MenuUnoResultScreen(previusMenu.name){
                navController.navigate(MainMenu){
                    popUpTo<MainMenu> { inclusive = true }
                }
            }
        }


    }
}

