package com.example.ddd.ch1_5.domain

import lombok.AllArgsConstructor

// OrderLine 주문항목
// 주문할 상품, 상품의 가격, 구매 개수 포함, 각 구매 항목의 구매 가격 제공
@AllArgsConstructor
class OrderLine(
    private val product: Product,
    private val price: Int,
    private val quantity: Int,
    private val amounts: Int,
) {
    private fun calculateAmounts() = price * quantity
}