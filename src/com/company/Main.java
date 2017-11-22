package com.company;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        b = 8;
        a = 5;
        // write your code here
        System.out.println(a);
        a = a + 5;
        if (a < b) {
            a += b;
        }

        System.out.println(a);
        System.out.println("Здравствуй мир");
        int[] array = {6, 9, 8, 25, 96, 47};
        int m = 999;
        for (int i=0;i<6;i+=1){
            if (m > array[i]){
                m=array[i];

            }
        }
        System.out.println(m);
//        int var1=5;
//        int var2=8;
//        int var3;
//        var3=var1;
//        var1=var2;
//        var2=var3;
//        System.out.println(var1);
//        System.out.println(var2);


    }
}

