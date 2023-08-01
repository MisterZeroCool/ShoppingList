package ru.zerocool.domain.usecase

import androidx.lifecycle.LiveData
import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}