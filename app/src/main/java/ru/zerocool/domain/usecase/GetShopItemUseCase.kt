package ru.zerocool.domain.usecase

import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopElemById(shopItem: Int): ShopItem {
        return shopListRepository.getShopElemById(shopItem)
    }
}