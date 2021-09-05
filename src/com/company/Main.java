package com.company;

import Methods.doMethod;
import Methods.forMethod;
import Methods.foreachMethod;
import Methods.whileMethod;

public class Main {

    public static void main(String[] args) {
        forMethod f =new forMethod();
        int sumFor= f.arrayCountMethod(new int[]{1,2,3,4,5,6});
        f.arrayPrintMethod();
        System.out.println(sumFor);

        whileMethod w= new whileMethod();
        int sumWhile=w.arrayCountMethod(new int[]{1,2,3,45,6});
        w.arrayPrintMethod();
        System.out.println(sumWhile);

        doMethod d= new doMethod();
        int sumDo=d.arrayCountMethod(new int[]{1,2,3,4,6});
        d.arrayPrintMethod();
        System.out.println(sumDo);

        foreachMethod fe= new foreachMethod();
        int sumFore=fe.arrayCountMethod(new int[]{1,2,3,4,6});
        fe.arrayPrintMethod();
        System.out.println(sumFore);




    }
}
