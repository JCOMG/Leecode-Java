package com.jimmychuang.tutorial.java;

public class Solution2235 {

    public int sum2235(int num1, int num2) {

        int sum = 0;
        if (num1 + num2 == 0 )
            return sum;

        if ( num1 + num2 != 0 ) {
            sum = num1 + num2;

        }
        return sum;


    }




    public static void main(String[] args) {
        System.out.println("Hello World");
        Solution2235 a = new Solution2235(); //創建一個實例去執行
        int num1 =  12 ;
        int num2 = 5;
        System.out.println(a.sum2235 (num1 , num2));


    }
}
