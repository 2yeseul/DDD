package com.example.ddd.ch1_4.domain

class Order(
    private var state: OrderState,
    private var shippingInfo: ShippingInfo,
) {

    // 배송지 변경 관련 도메인 규칙 구현
    private fun isShippingChangeable(): Boolean =
        state == OrderState.PAYMENT_WAITING || state == OrderState.PREPARING

    // 실제 배송지 정보를 변경하는 메서드
    // OrderState의 isShippingChangeable로 변경가능 여부 검사
    fun changeShippingInfo(newShippingInfo: ShippingInfo) {
        if (!isShippingChangeable()) {
            throw IllegalStateException("Can't change shipping in $state")
        }

        this.shippingInfo = newShippingInfo
    }

}


enum class OrderState {
    PAYMENT_WAITING, PREPARING, SHIPPED, DELIVERING, DELIVERY_COMPLETED;
}