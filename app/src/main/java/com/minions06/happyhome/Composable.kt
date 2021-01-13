package com.minions06.happyhome

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.AmbientContentAlpha
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.loadImageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HappyHomeTopBar(
    title: @Composable () -> Unit,
    onPressBack: (() -> Unit)? = null,
) {
    ConstraintLayout {
        val (background, contentRef) = createRefs()
        loadImageResource(id = R.drawable.main_topbar_light).resource.resource?.let {
            Image(
                bitmap = it,
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(background) {}
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp)
                    .constrainAs(contentRef) {
                        top.linkTo(background.top)
                        bottom.linkTo(background.bottom)
                    }
            ) {
                Providers(
                    AmbientContentAlpha provides ContentAlpha.high,
                    content = {
                        if (onPressBack != null) {
                            IconButton(onClick = onPressBack) {
                                Icon(Icons.Rounded.ArrowBackIos)
                            }
                        }
                    }
                )
                Box(
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    ProvideTextStyle(value = MaterialTheme.typography.h6) {
                        Providers(
                            AmbientContentAlpha provides ContentAlpha.high,
                            content = title
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewTopBar() {
    HappyHomeTopBar(
        title = { Text("Rentier") }
    )
}

@Composable
fun HomeCard(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .wrapContentSize()
            .clip(MaterialTheme.shapes.small)
            .clickable(onClick = onClick)
            .border(
                width = 2.dp,
                color = MaterialTheme.colors.error,
                shape = MaterialTheme.shapes.small
            )
    ) {
        loadImageResource(id = R.drawable.bg_summary_light).resource.resource?.let {
            Image(bitmap = it)
            Icon(
                imageVector = icon,
                modifier = Modifier
                    .scale(3f)
                    .align(Alignment.TopCenter)
                    .padding(top = 20.dp)
            )
            Text(
                text = title,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 20.dp)
            )
        }
    }
}


