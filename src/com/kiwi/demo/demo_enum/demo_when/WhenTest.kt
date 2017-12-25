/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: WhenTest
 * Author:   kiwilss
 * Date:     2017/11/17 21:51
 * Description: when练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.kiwi.demo.demo_enum.demo_when

import com.kiwi.demo.demo_enum.demo_enum.Color2
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception

fun getMnemonic(color: Color2)=
        when(color){

            Color2.BLUE -> "blue"
            Color2.GREEN -> "green"
            Color2.INDIGO -> "indigo"
            Color2.ORANGE -> "orange"
            else -> "else"

        }
/**
 * 另外一种写法,在一个when分支上合并多个选项
 */

fun getMnemonic2(color: Color2) = when(color){
    Color2.ORANGE,Color2.INDIGO,Color2.GREEN -> "one"
    Color2.BLUE,Color2.RED -> "two"
    else -> "else"
}

/**
 * when结构中可以使用任意对象
 * 使用不同的对象示例
 */
fun mix(c1: Color2, c2: Color2) = when(setOf(c1,c2)){
    setOf(Color2.GREEN,Color2.RED) -> "red,green"
    setOf(Color2.BLUE,Color2.VIOLET) -> "blue,violet"
    else -> "else"
}

/**
 * 使用不同对象,不带参数的when用法
 */
fun mix2(c1: Color2,c2: Color2) = when{
    (c1 == Color2.RED && c2 == Color2.YELLOW) -> "red--yellow"

    (c1 == Color2.ORANGE && c2 == Color2.YELLOW) -> "orange--yellow"

    else -> "no"

}

fun main(args: Array<String>) {
    println(getMnemonic(Color2.RED))
    println(getMnemonic2(Color2.GREEN))
    println(mix(Color2.GREEN,Color2.RED)+"----"+ mix(Color2.RED,Color2.INDIGO))

    println(mix2(Color2.RED,Color2.YELLOW)+"-------"+ mix2(Color2.YELLOW,Color2.VIOLET))
}

