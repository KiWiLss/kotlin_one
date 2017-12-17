package com.kiwi.demo.demo_enum.demo_value

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: values
 * Author:   kiwilss
 * Date:     2017/12/17 21:10
 * Description: 变量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

//可变变量和不可变变量
/**
 * 1,val,不可变引用.使用val声明的变量不能在初始化之后再次赋值.它对应的是java的final变量.
 * 2,var(variable),可变引用,这种变量的值可以被改变,这种声明对应的是普通的java变量.
 *
 * 默认情况下,应该尽可能使用val关键字来声明所有的kotlin变量,仅在必要的时候换成var.
 */

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "kotlin"
    println("Hello, $name!")
    //如果想打印符号,需要使用转义符号"\$x"
    println("\$x")//此时会打印x符号,不会解释成变量的引用
    //使用${}的语法插入args数组中的第一个元素
    println("Hello two, ${name}!")
    //双引号中直接嵌套双引号,只要它们处在某个表达式的范围内,
    println("Hello, ${if (args.size > 0 ) args[0] else "someone"}")
}
