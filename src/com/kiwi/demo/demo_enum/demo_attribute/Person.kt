package com.kiwi.demo.demo_enum.demo_attribute

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2017/12/17 22:16
 * Description: 声明一个类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Person(val name: String//只读属性,生成一个字段和一个简单的getter
             ,var isMarried: Boolean//可写属性,一个字段,一个getter,一个setter
)


fun main(args: Array<String>) {
    val person=Person("bob",true);//调用构造方法不需要new关键字
    println(person.name)//可以直接引用属性,而不用调用getter方法
    println(person.isMarried)
    //改变属性
    person.isMarried=false
    println(person.isMarried)
}
