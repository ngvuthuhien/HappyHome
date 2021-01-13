package com.minions06.happyhome.rentier.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.minions06.happyhome.HappyHomeTopBar
import com.minions06.happyhome.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RoomScreen() {
    Scaffold(
        topBar = {
            HappyHomeTopBar(
                title = { Text(stringResource(id = R.string.home)) }
            )
        },
        bodyContent = {
        }
        // TODO add button
    )
}