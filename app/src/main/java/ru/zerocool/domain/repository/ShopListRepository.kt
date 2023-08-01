package ru.zerocool.domain.repository

import androidx.lifecycle.LiveData
import ru.zerocool.domain.model.ShopItem

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun shopElemRemove(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopElemById(shopItemId: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
}