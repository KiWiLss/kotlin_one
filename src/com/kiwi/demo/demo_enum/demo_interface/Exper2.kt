package com.kiwi.demo.demo_enum.demo_interface

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Exper2
 * Author:   kiwilss
 * Date:     2017/12/30 18:56
 * Description: 只能转换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Exper2

class Num2 (val vaule : Int) :Exper2

class Sum2 (val left : Exper2 ,val right : Exper2) : Exper2


fun eval( e : Exper2): Int {
    if (e is Num2){
        val n = e as Num2
        return e.vaule
    }
    if (e is Sum2){
        return eval(e.left)+ eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
    //return -99999
}
//使用有返回值的if,
fun eval2(e : Exper2) : Int =
    if (e is Num2) {
        val a : Int
        e.vaule
    }else if (e is Sum2){
        eval2(e.left) + eval2(e.right)
    }else{
        throw IllegalArgumentException("Unknown expression")
    }
//使用有返回值的if,如果if分支中只有一个表达式,
//花括号可以省略.如果if分支是一个代码块,代码块中最后一个表达式会作为结果返回
fun eval3(e: Exper2) : Int =
        if (e is Num2) e.vaule
        else if (e is Sum2) eval3(e.left)+ eval3(e.right)
        else throw IllegalArgumentException("Unknow exoression")

//使用when代替if
fun eval4(e: Exper2):Int {
    return when (e) {
        is Num2 -> e.vaule
        is Sum2 -> eval4(e.left)+ eval4(e.right)
        else -> throw IllegalArgumentException("Unknow exoression")
    }
}
//使用when代替if
fun eval5(e: Exper2):Int =
   when (e) {
        is Num2 -> e.vaule
        is Sum2 -> eval4(e.left)+ eval4(e.right)
        else -> throw IllegalArgumentException("Unknow exoression")
    }




//使用when代替if,如果使用代码块,代码块中最后一个表达式就是结果
fun eval6(e: Exper2):Int =
        when(e){
            is Num2 -> {
                println()
                e.vaule
            }
            is Sum2 -> {
                println()
                eval6(e.left)+ eval6(e.right)
            }
            else -> {
                println()
                throw IllegalArgumentException("error expression")
            }
        }

fun main(args: Array<String>) {
    println(eval(Sum2(Sum2(Num2(3),Num2(7)),Num2(9))))
}


