// if statements
import java.util.Scanner;
class IfExample{
    public static void main(String[] args){
        int age = 18;
        if(age >= 18) {
            System.out.println("you are an adult");
        }
    }
}


// if_else statements
class if_else{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of num1: ");
        int num1 = scn.nextInt();
        System.out.println("Enter value of num2: ");
        int num2 = scn.nextInt();
        if(num1>num2)    
        {
            System.out.println(num1+ "is greater than" +num2);
        }
        else
        {
            System.out.println(num1+ "is not greater than" +num2);
        }
    }
}

class IfElseExample{
    public static void main(String[] args) {
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number+"is even");
        }
        else{
            System.out.println(number+"is odd");
        }
    }
}

// else_if ladder
class GradeExample{
    public static void main(String[] args) {
        int marks = 79;
        if (marks >= 90) {
            System.out.println("Grade A");
        }else if(marks >=80) {
            System.out.println("Grade B");
        }else if(marks >=70) {
            System.out.println("Grade c");
        }else if(marks >=60) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
    }
}

// Logical operators
class LogicalOperatorExample {
    public static void main(String[] args) {
        int age =30;
        boolean hasTicket = true;
        // AND operator
        if(age >=18 && hasTicket) {
            System.out.println("you can enter the movie");
        }

        //OR operator
        boolean isWeekend = true;
        boolean isHoliday = false;
        if(isWeekend || isHoliday) {
            System.out.println("you can relax");
        }

        //NOT operator
        boolean isRanning = false;
        if(!isRanning) {
            System.out.println("you don't need an umbrella");
        }
    }
}