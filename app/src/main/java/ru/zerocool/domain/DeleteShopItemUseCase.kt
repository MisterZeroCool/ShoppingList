package ru.zerocool.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun shopElemRemove(shopItem: ShopItem) {
        shopListRepository.shopElemRemove(shopItem)
    }
}