package ru.zerocool.presentation.vm

import androidx.lifecycle.ViewModel
import ru.zerocool.data.repository.ShopListRepositoryImpl
import ru.zerocool.domain.model.ShopItem
import ru.zerocool.domain.usecase.DeleteShopItemUseCase
import ru.zerocool.domain.usecase.EditShopItemUseCase
import ru.zerocool.domain.usecase.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}