package ru.zerocool.domain.usecase

import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}
