package com.example.examen.network

import com.example.examen.bd.ItemsDao
import com.example.examen.data.ItemRequestJson
import com.example.examen.data.ItemsResponse
import com.example.examen.data.Proyecto
import com.example.examen.data.Usuario

class ItemsRepositoryImpl(val itemsWs: ItemsWs, val dao: ItemsDao) :
    ItemsRepository {

    override suspend fun getItems(): ItemsResponse {
        val proyecto = Proyecto(0,"137")
        val usuario = Usuario("11208")
        val request = ItemRequestJson(usuario,proyecto)

        val result = itemsWs.getItems(request)
        dao.save(result.items)
        return result
    }





}