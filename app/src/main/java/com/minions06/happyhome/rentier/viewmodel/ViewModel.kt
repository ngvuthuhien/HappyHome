package com.minions06.happyhome.rentier

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.ChatBubbleOutline
import androidx.compose.material.icons.rounded.MeetingRoom
import androidx.compose.material.icons.rounded.Payments
import androidx.compose.ui.graphics.vector.ImageVector
import com.minions06.happyhome.R

enum class RentierAction(val stringId: Int, val icon: ImageVector) {
    Rooms(stringId = R.string.rooms, icon = Icons.Rounded.MeetingRoom),
    Income(stringId = R.string.income, icon = Icons.Rounded.Payments),
    Chat(stringId = R.string.chat, icon = Icons.Rounded.ChatBubbleOutline),
    Account(stringId = R.string.account, icon = Icons.Outlined.AccountCircle),
}