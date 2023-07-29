package ru.zerocool.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun shopElemRemove(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopElemById(shopItemId: Int): ShopItem
    fun getShopList(): List<ShopItem>
}