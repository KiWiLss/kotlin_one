/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: FunMain
 * Author:   kiwilss
 * Date:     2017/11/16 23:20
 * Description: 主函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.kiwi.demo.demo_enum

import com.kiwi.demo.demo_enum.demo_enum.Color2

/**
 * 函数表达式
 */

fun main(args: Array<String>) {
    //println("demo fun main${max1(3,9)}")
    //println(Color2.BLUE.rgb())

    println(max3(3,5))


}

fun max(a: Int,b: Int) : Int{//声明一个函数,写法一,如果函数写在花括号内,这个函数就有代码块体
    return if (a>b) a else b
}

fun max1(a: Int,b: Int):Int = if (a<b) a else b//声明函数,方法二

//进一步简化,省略返回值类型
fun max2(a: Int,b: Int) = if (a < b) a else b

fun max3(a: Int,b: Int) = a+b




