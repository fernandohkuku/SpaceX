package com.fernando.spacex.ui_ktx.content

import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.fernando.spacex.ui_ktx.navigation.getDestinationIdFromAction

fun Fragment.navigate(action: NavDirections) {
    if (!isAlreadyAtDestination(action.actionId)) {
        findNavController().navigate(action)
    }
}

fun Fragment.childNavigate(navHost:Int, action: NavDirections) {
   val navController = childFragmentManager.findFragmentById(navHost) as NavHostFragment
    navController.navController.navigate(action)
}

private fun Fragment.isAlreadyAtDestination(@IdRes actionId: Int): Boolean {
    val previousDestinationId = previousDestination()?.getDestinationIdFromAction(actionId)
    val currentDestinationId = currentDestination()?.id
    return previousDestinationId == currentDestinationId
}

fun Fragment.currentDestination() = findNavController().currentDestination

fun Fragment.previousDestination() = findNavController().previousBackStackEntry?.destination
