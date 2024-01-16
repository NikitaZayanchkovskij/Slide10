package com.example.builderandsingletonpatterns.builder_pattern.second_way


class CoffeeSecondWay private constructor (

    val standardCoffee: Boolean,
    val doubleCoffee: Boolean,
    val milk: Boolean,
    val cream: Boolean,
    val sugar: Boolean,
    val cinnamon: Boolean,
    val syrup: Boolean

) {


    class CoffeeBuilder {

        private var standardCoffee: Boolean = true
        private var doubleCoffee: Boolean = false
        private var milk: Boolean = true
        private var cream: Boolean = false
        private var sugar: Boolean = true
        private var cinnamon: Boolean = false
        private var syrup: Boolean = false

        fun standardCoffee(value: Boolean) = apply { standardCoffee = value }

        fun doubleCoffee(value: Boolean) = apply { doubleCoffee = value }

        fun milk(value: Boolean) = apply { milk = value }

        fun cream(value: Boolean) = apply { cream = value }

        fun sugar(value: Boolean) = apply { sugar = value }

        fun cinnamon(value: Boolean) = apply { cinnamon = value }

        fun syrup(value: Boolean) = apply { syrup = value }

        fun buildCoffee() = CoffeeSecondWay(
            standardCoffee, doubleCoffee, milk, cream, sugar, cinnamon, syrup)
    }
}

