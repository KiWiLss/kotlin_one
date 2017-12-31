package com.kiwi.demo.demo_enum.demo_enum

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Lang
 * Author:   kiwilss
 * Date:     2017/12/25 21:13
 * Description: 语言
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
enum class Lang(val hello:String) {
    ENGLISH("Hello"),
    CHINESE("你好"),
    JAPANESE("こんにちは"),
    KOREAN("안녕하새요");

    init {//构造方法
        println("init 构造方法")
    }

    fun sayHello(){
        println(hello)
    }

    companion object {
        fun parse(name: String):Lang{
            return Lang.valueOf(name.toUpperCase())
        }
    }
}