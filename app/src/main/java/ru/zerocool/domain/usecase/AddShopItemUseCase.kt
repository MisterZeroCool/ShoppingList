package ru.zerocool.domain.usecase

import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}
