package com.example.a1st

import java.util.Date

class Cash(
    var cashId: Int,
    var cashMinus: Int,
    var cashCategory: String,
    var cashData: Date) {

    fun getCash() : String {
        return "lost: ${cashMinus}; type: ${cashCategory}; date: ${cashData}"
    }

}