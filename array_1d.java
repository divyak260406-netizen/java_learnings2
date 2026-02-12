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

class array1max{
  public static void main(String[] args){
    int[] numbers={10,20,30,40,50};
    int max=0;
    for(int num:numbers){
      if(num>max){
        max=num;
      }
    }
    System.out.println("max:"+max);

  }
}

class arraymin{
  public static void main(String[] args){
    int[] numbers={10,20,30,40,50};
    int min=numbers[0];
    for(int num:numbers){
      if(num<min){
        min=num;
      }
    }
    System.out.println("min:"+min);
  }
}

 class Main{
    public static void main(String[] args){
        int[][] numbers={{1,2,3},{4,5,6}};
        System.out.println(numbers[1][0]);
    }
}

class demo{
  public static void main(String[] args){
    //String[] playlist = {"song1","song2","song3"}
    //System.out.println(playlist1[0]);
    String[] playlist1= new String[3];
    playlist1[0] = "song1";
    System.out.println(playlist1[0]);
    playlist1[1] = "song2";
    System.out.println(playlist1[1]);
  }
}

//find the max of array = {10,30,60,80}
class arraymax{
  public static void main(String[] args){
      int[] arr = {10,30,60,80};
      int max=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
          max=arr[i];
        }
      }
      System.out.println("max:"+max);
  }
}