package ru.zerocool.domain.usecase

import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun shopElemRemove(shopItem: ShopItem) {
        shopListRepository.shopElemRemove(shopItem)
    }
}