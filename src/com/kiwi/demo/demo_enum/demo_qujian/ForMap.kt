package com.kiwi.demo.demo_enum.demo_qujian

import java.util.*

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: ForMap
 * Author:   kiwilss
 * Date:     2017/11/25 20:18
 * Description: 迭代map
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char,String>()//使用treemap让键排序

    for (c in 'A'..'F'){
        //使用字符区间迭代从A到F之间的字符
        val binary = Integer.toBinaryString(c.toInt())//把ascii码转成二进制
        //binaryReps.put(c,binary)
        binaryReps[c]=binary

    }
    //迭代map
    for ((letter ,binary) in binaryReps ){
        println("$letter = $binary")
        
    }

    val list= arrayListOf<String>("10","11","99")

    val withIndex = list.withIndex()
    println("withIndex=$withIndex")
    //迭代List
    for ((index , element) in list.withIndex()){
        println("$index -- $element")
    }

}


