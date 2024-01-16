package com.example.builderandsingletonpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.builderandsingletonpatterns.builder_pattern.first_way.Coffee
import com.example.builderandsingletonpatterns.builder_pattern.second_way.CoffeeSecondWay
import com.example.builderandsingletonpatterns.databinding.ActivityMainBinding
import com.example.builderandsingletonpatterns.singleton_pattern.Sun


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        makeACoffeeFirstWay()
        makeACoffeeSecondWayWay()

        testSingleton()
    }


    /** Функция возвращает кофе, который заказал клиент.
     * Например у нас стандарт обычный капучино с сахаром.
     * В этом случае мы просто пишем val coffee = Coffee() без каких либо параметров в скобках.
     * Если клиент хочет другой кофе - мы просто меняем значения на нужные, как в примере ниже.
     */
    private fun makeACoffeeFirstWay(): Coffee {
        val coffee = Coffee(cream = true, syrup = true)
        return coffee
    }


    /** Второй вариант решения, похожий на пример из статьи на которую ссылка в презентации:
     * https://refactoring.guru/ru/design-patterns/builder/java/example
     * Мне кажется, что первый вариант лучше, более по Kotlin-овски.
     */
    private fun makeACoffeeSecondWayWay() {

        val coffee = CoffeeSecondWay.CoffeeBuilder()

            .standardCoffee(true)
            .doubleCoffee(false)
            .milk(false)
            .cream(true)
            .sugar(false)
            .cinnamon(false)
            .syrup(true)
    }


    private fun testSingleton() {
        val sun1 = Sun.start()
        val sun2 = Sun.start()
    }


}