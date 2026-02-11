// pattern1 : rectangle
class rectanglepattern{
    public static void main(String[] args){
        for(int i=1;i<=4;i++){         //rows
            for(int j=1;j<=5;j++){       //columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// pattern2 : right angle triangle
class rightanglepattern{
    public static void main(String[] args){
        for(int i=1;i<=4;i++){         //rows
            for(int j=1;j<=i;j++){       //columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// pattern3 : inverted triangle
class invertedpattern{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){         //rows
            for(int j=1;j<=i;j++){       //columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// pattern4 : hallow square
class hallowsquare{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// pattern5 : diamond
class diamondpattern{
    public static void main(String[] args){
        int n=5;
        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");   //space
            }
            for(int j=1;j<=2*i-1;j++){
        System.out.print("*");    //star
      }
      System.out.println();
    }
    //Lower half
    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
        
 // pattern6 : pascal's triangle
 class pascalpattern{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            // print spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            // print number
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
 }   
