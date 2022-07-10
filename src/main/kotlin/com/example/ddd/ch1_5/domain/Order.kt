package com.example.ddd.ch1_5.domain

/*
 ** 요구사항
 ** 한 상품을 한 개 이상 주문할 수 있다
 ** 각 상품의 구매 가격 합은 상품 가격에 구매 개수를 곱한 값이다
 */
class Order(
    private var orderLines: List<OrderLine>,
    private var totalAmounts: Money,
) {
    private fun setOrderLines(orderLines: List<OrderLine>?) {

    }

    private fun verifyOrderLinesCount(orderLines: List<OrderLine>?) {
        if (orderLines == null || orderLines.isEmpty()) {
            throw IllegalStateException("No OrderLine")
        }
    }

    // private fun calculateTotalAmounts()
}