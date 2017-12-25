package com.kiwi.demo.demo_enum.demo_enum

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Color4
 * Author:   kiwilss
 * Date:     2017/12/25 19:45
 * Description: 声明一个带属性的枚举
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
enum class Color4(val r:Int, val g:Int ,val b: Int) {//声明常量属性
    //在每个常量创建时,指定属性值
    RED(255,0,0),ORANGE(255,165,0),YELLOW(255,255,0)
    ,GREEN(0,255,0),BLUE(0,0,255),INDIGO(75,0,130)
    ,VIOLET(238,130,238);//这里必须要有分号

    //给枚举定义一个方法
    fun gfb() = (r*256+g)*256+b
}