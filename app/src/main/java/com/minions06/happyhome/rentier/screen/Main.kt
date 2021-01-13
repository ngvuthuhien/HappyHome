package com.minions06.happyhome.rentier

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.minions06.happyhome.HappyHomeTopBar
import com.minions06.happyhome.HomeCard
import com.minions06.happyhome.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RentierHomeScreen() {
    Scaffold(
        topBar = {
            HappyHomeTopBar(
                title = { Text(stringResource(id = R.string.home)) }
            )
        },
        bodyContent = {
            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                contentPadding = PaddingValues(15.dp),
            ) {
                RentierAction.values().asList().forEach {
                    item {
                        HomeCard(
                            title = stringResource(it.stringId),
                            icon = it.icon,
                            modifier = Modifier.padding(bottom = 15.dp)
                        )
                    }
                }
            }
        }
        // TODO add button
    )
}

@Preview
@Composable
private fun PreviewRentierHome() {
    RentierHomeScreen()
}