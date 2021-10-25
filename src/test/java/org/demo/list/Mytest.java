package org.demo.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Mytest {

    @Test
    public void arrayTool(){
        int[] tmp = {1,2,3,4,5};

        int[] my = Arrays.copyOfRange(tmp,2,5);
        System.out.print("是否相等:"+tmp+"==="+my);
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
        }
    }

}
