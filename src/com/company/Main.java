package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) {
       /* int a;
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
        for (int s = 0; s < full_length; s += 1) {
            System.out.println(array[s]);
        }
        int l;

        for (int i = 0; i < 6; i += 1) {
            for (int g = 0; g < 5; g += 1) {
                if (array[g] > array[g + 1]) {
                    l = array[g];
                    array[g] = array[g + 1];
                    array[g + 1] = l;


                }
            }
        }

        for (int s = 0; s < full_length; s += 1) {
            System.out.println(array[s]);
        }
        System.out.println(m);*/
//        int var1=5;
//        int var2=8;
//        int var3;
//        var3=var1;
//        var1=var2;
//        var2=var3;
//        System.out.println(var1);
//        System.out.println(var2

     /*   BufferedReader BR=null;
        BR=new BufferedReader(new InputStreamReader(System.in));
        String answer;

        int s=53;
        int start=0, finish=100, size=64;*/
/*
        for(int povtor=0;povtor<5;povtor+=1) {
            System.out.print("ваше число меньше ");
            System.out.print(start + size);
            System.out.println("?");
            try {

                answer = BR.readLine();
                System.out.print(answer);
                if ("da".equalsIgnoreCase(answer)) {
                    System.out.print("Ответ ДА");
                    finish = start+size;
                    size = size / 2;
                } else {
                    System.out.print("Ответ НЕТ");
                    start += size;
                    size /= 2;
                }
            } catch (IOException E) {
                System.out.print("возникла ошибка чтения из буфера");
            }
        }
*/
       /* BufferedReader Br=null;
        Br=new BufferedReader(new InputStreamReader(System.in));



            try {

                answer = Br.readLine();
                int f=0;

                for (int k=0; k<answer.length() ;k++){
                    System.out.println(answer.charAt(k));
                    if (' ' == answer.charAt(k))
                    {
                        System.out.println("найден пробел");
                        f++;
                    }
                }
                System.out.println(f);

                if ("da".equalsIgnoreCase(answer)) {

                } else {

                }
            } catch (IOException E) {
                System.out.print("возникла ошибка чтения из буфера");
            }*/
       /*System.out.print("Данная программа считает количество слов в предложении:1) Введите предложение,\n 2)Нажатие клавиши Enter отправит предложение в программу,\n");
            BufferedReader Br=null;
            Br = new BufferedReader(new InputStreamReader(System.in));

            String user_input;
            int probel=0;
            boolean probelchiki=false;
            try {
                user_input = Br.readLine();
                System.out.print(user_input);
                //с этого момента юзер ин пут содержит всю введенную пользователем строку
            for (int i=0;i<user_input.length();i++){
                if(user_input.charAt(i)==' '){
                 if (!probelchiki){
                     probel++;
                 }
                 probelchiki=true;
                }else {
                    probelchiki=false;
                }
            }
            }catch (IOException E){
                System.out.print("возникла ошибка чтения из буфера");
            }

            System.out.print(probel+1);*/

        // TODO Implement me
        int x = 46867;
        int tsiferka = 0;

        //Get last digit
        while (x > 0) {
            tsiferka = x % 10;
            tsiferka=tsiferka*tsiferka;
            System.out.println(tsiferka);
            x = x / 10;
        }


    }


}

/*   $user_input = php://input

        $parts = explode($user_input,' ');
        print(count($parts));
*
*
* */