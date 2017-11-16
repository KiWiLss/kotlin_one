/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Color2
 * Author:   kiwilss
 * Date:     2017/11/16 23:24
 * Description: 声明一个带属性的枚举
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.kiwi.demo.demo_enum.demo_enum

enum class Color2(val r: Int,val g:Int,val b: Int) {//声明属性
    //在每个常量创建的时候,指定属性值
    RED(255,0,0),ORANGE(255,165,0),YELLOW(255,255,0)
    ,GREEN(0,255,0),BLUE(0,0,255),INDIGO(75,0,130)
    ,VIOLET(238,130,238);//必须要加分号

    //给枚举定义一个方法
    fun rgb() = (r*256 + g) *256 +b
}