package com.kiwi.demo.demo_enum.demo_when

import com.kiwi.demo.demo_enum.demo_enum.Color


/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: WhenObject
 * Author:   kiwilss
 * Date:     2017/12/25 20:06
 * Description: when结构中使用任意对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

//带参数的when
fun mix(c1:Color,c2:Color) =
        when(setOf(c1,c2)){

            setOf(Color.RED,Color.YELLOW) -> {
                Color.RED
            }

            setOf(Color.RED, Color.BLUE) -> Color.BLUE
            else -> {
                throw Exception("dirty color")
            }
        }


//不带参数的when


fun main(args: Array<String>) {
    println(mix(Color.RED,Color.BLUE))
}