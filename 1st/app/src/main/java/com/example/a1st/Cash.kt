package com.example.a1st

import java.util.Date

class Cash(
    var cashId: Int,
    var cashMinus: Int,
    var cashCategory: String,
    var cashData: Date) {

    constructor(
        cashId: Int,
         cashMinus: Int,
         cashCategory: String,
         cashData: Date,
         doubleDate: Date
    ) : this(cashId, cashMinus, cashCategory, cashData)

    fun getCash() : String {
        return "lost: ${cashMinus}; type: ${cashCategory}; date: ${cashData}"
    }

}