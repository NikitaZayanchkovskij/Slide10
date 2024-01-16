package com.example.builderandsingletonpatterns.builder_pattern.first_way

/** Класс хранит в себе возможные критерии, к примеру какой кофе может купить клиент в кофейне.
 * У критериев есть стандартные значения, например самый популярный кофе.
 * Если клиент хочет другой кофе, то мы просто при создании кофе перезаписываем стандартные значения
 * переменных на нужные нам.
 */
data class Coffee (

    val standardCoffee: Boolean = true,
    val doubleCoffee: Boolean = false,
    val milk: Boolean = true,
    val cream: Boolean = false,
    val sugar: Boolean = true,
    val cinnamon: Boolean = false,
    val syrup: Boolean = false

)
