package com.example.a1st

class CashList {
    val cashMap: MutableMap<Int, Cash> = mutableMapOf()

    fun addCash(cash: Cash) {
        cashMap[cash.cashId] = cash
    }

    fun getCashById(id: Int): String? {
        return cashMap[id]?.getCash();
    }
}