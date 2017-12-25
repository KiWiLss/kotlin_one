package com.kiwi.demo.demo_enum.demo_when

import com.kiwi.demo.demo_enum.demo_enum.Color3

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: WhenEnum
 * Author:   kiwilss
 * Date:     2017/12/25 19:55
 * Description: 简单的when使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun getMnemonic(color3: Color3) = when(color3){
    Color3.BLUE -> 3
    Color3.GREEN ->4
    Color3.RED -> 5
    else -> 0
}

fun getMnemonic2(color3: Color3) : String =
    when(color3){
        Color3.BLUE -> "blue"
        Color3.RED ->"red"
        else -> "nothing"
    }


fun main(args: Array<String>) {
    println(getMnemonic2(Color3.RED))
    println(getMnemonic(Color3.RED))
}