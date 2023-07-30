package ru.zerocool.domain

interface ShopListRepository {
    fun addShopItem(id: ShopItem)
    fun shopElemRemove(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopElemById(shopItem: Int): ShopItem
    fun getShopList(): List<ShopItem>
}