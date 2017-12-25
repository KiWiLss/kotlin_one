package com.kiwi.demo.demo_enum.demo_attribute

import java.util.*

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Rectangle
 * Author:   kiwilss
 * Date:     2017/12/18 21:27
 * Description: 自定义访问器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Rectangle(val height: Int
    ,val width: Int){
    val isSquare: Boolean//声明属性
    //声明属性的getter
//    get() {
//        return height==width
//    }

    //或者这样写
    get() = height==width

}

fun main(args: Array<String>) {
    val rectangle=Rectangle(10,10)

    println(rectangle.isSquare)
    val rect=createRendomREctangel();
    println("${rect.height},${rect.width}")
}

fun createRendomREctangel() : Rectangle{
    val random = Random ();
    return Rectangle(random.nextInt(),random.nextInt())
}