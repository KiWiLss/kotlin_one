package com.kiwi.demo.demo_enum.demo_when

import javafx.beans.binding.When

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: FizzBuzz
 * Author:   kiwilss
 * Date:     2017/11/25 19:37
 * Description: 区间和数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    //for (i in 1..100){
//        println(fizzBuzz(i))
//    }

    for (i in 100 downTo 1 step 2){//倒叙,并且步长为2
        println(fizzBuzz(i))
    }
    for (i in 1 until 100){//范围在1到99
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) =
        when {
            i % 15 == 0 -> "fizzbuzz"
            i % 3 ==0 -> "fizz"
            i % 5 ==0 -> "buzz"
            else -> {
                "$i"
            }
        }