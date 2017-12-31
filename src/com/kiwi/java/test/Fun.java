package com.kiwi.java.test;

import com.kiwi.java.test.type_convent.Exper;
import com.kiwi.java.test.type_convent.Num;
import com.kiwi.java.test.type_convent.Sum;
import com.kiwi.java.test.type_convent.Sum2;
import javafx.beans.binding.When;

import java.util.ArrayList;

/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Fun
 * Author:   kiwilss
 * Date:     2017/12/30 18:44
 * Description: 函数类测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Fun {

    public static void main(String[] args) {
        Fun fun = new Fun();

        try {
            fun.eval(new Sum2(new Num(3),new Num(9)));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);
        for (int i = 0,length=list.size(); i < length; i++) {
            System.out.println(i);
        }


    }



    public  int max(int a,int b) throws Exception{
        return a >b ? a : b ;
    }

    public int eval(Exper exper){
        if (exper instanceof Num){
            return ((Num)exper).getValue();
        }
        if (exper instanceof Sum){
            return eval(((Sum) exper).getLeft())+eval(((Sum) exper).getRight());
        }
        throw new IllegalArgumentException("Unknown expression");
    }

}
