package ru.zerocool.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopElemById(shopItem: Int): ShopItem {
        return shopListRepository.getShopElemById(shopItem)
    }
}