package com.kiwi.demo.demo_enum.demo_qujian

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Interval
 * Author:   kiwilss
 * Date:     2017/12/30 20:34
 * Description: 区间
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun fizzBuzz(i: Int) = when{
    i % 15 ==0 -> "fizzbuzz"
    i % 3 == 0 -> "fizz"
    i % 5 == 0 -> "buzz"
    else -> "$i"
}

fun main(args: Array<String>) {
    //在区间1到100
//    for (i in 1..100){
//        println(fizzBuzz(i))
//    }
    //倒序
//    for (i in 100 downTo 1){
//        println(fizzBuzz(i))
//    }
    //改变步长
    for (i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }
//    //不包含最后一个,写法一
//    for (i in 1..99){
//        println(fizzBuzz(i))
//    }

    //不包含最后一个,写法二
    for (i in 1 until 100){
        println(fizzBuzz(i))
    }
}