package Zada4ki;

public class Task14 {
    public static void main(String[] args) {
        //число армстронга
        //153 = 1/3 + 3/3 + 5/3 = 1+27+ 125    /-степень . Нужно написать программу
        int number = 153;
        int y = 0,x,temp;
        temp = number;

        while(temp>0){
            x =temp %10;
            temp=temp/10;
        y = y +(x*x*x);
        }
        if (number==y)
            System.out.println("Число является числм Армстронга");
        else System.out.println("Число не является числом Армстронга");


    }
}
