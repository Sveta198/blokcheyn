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

        //Длинна заданного массива
        int full_length = array.length;
        for (int s=0;s<full_length;s+=1){
            System.out.println(array [s]);
        }
        int l;

        for (int i=0;i<6;i+=1){
            for (int g=0;g<5;g+=1){
                if (array[g]>array[g+1]){
                   l= array[g];
                   array[g]=array[g+1];
                   array[g+1]=l;


                }
            }
        }

        for (int s=0;s<full_length;s+=1){
            System.out.println(array [s]);
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

