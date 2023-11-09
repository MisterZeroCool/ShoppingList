package ru.zerocool.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.zerocool.domain.model.ShopItem
@Entity(tableName = "shop_items")
data class ShopItemDbModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean,

)
