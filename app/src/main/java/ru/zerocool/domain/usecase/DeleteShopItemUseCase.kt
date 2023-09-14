package ru.zerocool.domain.usecase

import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}
