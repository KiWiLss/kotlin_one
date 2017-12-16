/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2017/11/17 23:53
 * Description: 只能转换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.kiwi.demo.demo_enum.demo_interface



interface Expr

class Num(val value: Int) : Expr//简单的值对像,只有一个属性value,实现了Expr接口

class Sum(val left: Expr,val right: Expr) : Expr//Sum运算的实参可以是任意的Expr:Num或者是另一个Sum

fun main(args: Array<String>) {
    //求表达式
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))

    println(eval2(Sum(Num(5),Num(9))));

    println(eval3(Num(9)))

    println(eval4(Sum(Num(9),Num(12))))
}

fun eval4(e: Expr): Int =
        when(e){
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = eval4(e.left)
                val right = eval4(e.right)
                println("sum: $left+$right"+"***${e.left}")
                left+right
            }
            else -> throw IllegalArgumentException("no")
        }

//用when代替if
fun eval3(e: Expr) : Int =
    when(e){
        is Num -> e.value

        is Sum ->
                eval3(e.left)+ eval3(e.right)
        else -> throw IllegalArgumentException("no")
    }


fun eval(e: Expr): Int {
    if (e is Num){//如果是数值,直接返回值
        //强制类型转换
        val n = e as Num;
        //return n.value;
        return e.value;
    }
    if (e is Sum){//如果是和,返回计算的和值
        return eval(e.left) + eval(e.right)
        //return eval(e.left)+ eval(e.right);
    }

    throw IllegalArgumentException("Unknown expression");

}



//使用有返回值的if表达式
    fun eval2(e: Expr) : Int =
        if (e is Num){
            e.value
        }else if (e is Sum){
            eval2(e.left)+ eval2(e.right)
        }else{
            throw IllegalArgumentException("Unknown expression");
        }

