package com.kiwi.java.test.type_convent;

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Sum
 * Author:   kiwilss
 * Date:     2017/12/30 19:12
 * Description: sum
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Sum implements Exper{
    Exper left;
    Exper right;

    public Sum(Exper left, Exper right) {
        this.left = left;
        this.right = right;
    }

    public Exper getLeft() {
        return left;
    }

    public Exper getRight() {
        return right;
    }
}
