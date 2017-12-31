package com.kiwi.demo.demo_enum.demo_attribute

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Student
 * Author:   kiwilss
 * Date:     2017/12/25 21:09
 * Description: data类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class Student(val age:Int, val name:String)


fun main(args: Array<String>) {
    println(Student(9,"kitty"))
}