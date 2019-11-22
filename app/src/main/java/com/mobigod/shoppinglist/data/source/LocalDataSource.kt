package com.mobigod.shoppinglist.data.source

import com.mobigod.shoppinglist.data.PreferenceManager
import com.mobigod.shoppinglist.data.ShoppingDb
import com.mobigod.shoppinglist.data.models.ShopItem
import javax.inject.Inject

class LocalDataSource @Inject constructor(val preferenceManager: PreferenceManager, val db: ShoppingDb):
    LocalDSContract {
    override suspend fun saveShoppingList(list: List<ShopItem>?): Int {
        return 1
    }

    override suspend fun getShoppingList(): List<ShopItem> {
        return emptyList()
    }


}