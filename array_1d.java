import java.util.Scanner;
class ArrayBasic{
    public static void main(String[] args){
        int[] number = {10,20,30,40,50};
        System.out.println("first number:"+number[0]);
         System.out.println("second number:"+number[2]);
         System.out.println("last number:"+number[4]);
    }
}

class Array1Dprint{
    public static void main(String[] args){
        int[] number = {10,20,30,40};
            for(int i = 0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}

//print using enhance for loop
class array1denhance{
    public static void main(String[] args){
        int[] number={10,20,30,40,50};
        int max=0;
        for(int num:number){
            if(num>max){
                max=num;
            }
        }
        System.out.println("max:"+max);
    }
}

