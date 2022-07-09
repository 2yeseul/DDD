package com.example.ddd.ch1_4.domain

class ShippingInfo(
    var address: Address,
    message: String,
)


class Address(var zipCode: String, address1: String, address2: String)