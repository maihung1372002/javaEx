import java.util.*;

import jdk.nashorn.api.tree.ReturnTree;

public class Lab2 {

    public static void printArray(Scanner sc){
        System.out.print("enter the number of items :");
        int num = sc.nextInt();
        int[] items = new int[num];
        System.out.print("enter the value of items :");

        for (int i = 0; i < num; i++) {
            items[i] = sc.nextInt();
        }
        System.out.print("the values are [");
        
        for (int i = 0; i < num; i++) {
            System.out.print(" " + items[i]);
        }
        System.out.print(" ]");

    }
       
    public static void printArrayInStars(Scanner sc) {
        System.out.print("Enter the number of items : ");
        int num = sc.nextInt();
        int[] items = new int[num];
        System.out.print("enter the value of items : ");

        for (int i = 0; i < num; i++) {
            items[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(items[i] + " : ");
            for (int j = 1; j <= items[i]; j++) {
                System.out.print("* ");
            }
            System.out.print("(" + items[i] + ")");
            System.out.println();
        }
    }
    
    public static void gradesStatistics(Scanner sc) {
        System.out.print("Enter then number of students: ");
        int numStudents = sc.nextInt();
        int maxGrade = 0;
        int minGrade = 100;
        int grade = 0;
        double sumGrade = 0;
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for student" + i + ":");
            grade = sc.nextInt();
            sumGrade += grade;
            if (grade >= maxGrade ){
                maxGrade = grade;
            }
            if (grade <= minGrade ){
                minGrade = grade;
            }
            System.out.println();
        }
        double avgGrade = sumGrade / numStudents;
        System.out.println("The average is: " + Math.round((avgGrade) * 100.0) / 100.0d);
        System.out.println("The maximmun is: " + maxGrade);
        System.out.println("The minimun is: " + minGrade);

    }

    public static void hex2Bin(Scanner sc) {

        // array contains hexa bits
        final String [] HEX_BITS = 
        {"0000","0001","0010","0011",
        "0100","0101","0110","0111",
        "1000","1001","1010","1011",
        "1100","1101","1110","1111"} ;

        System.out.print("Enter a Hexadecimal string : ");
        String str = sc.next();  
        System.out.print("The equivalent binary for hexadecimal " +  '\"' + str + '\"' + " is: ") ;  
        for (int i = 0; i < str.length(); i++) {
            char characterTemp = str.charAt(i);
            switch(characterTemp){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    System.out.print(" " + HEX_BITS[Integer.parseInt(String.valueOf(characterTemp))]);
                    break;
                case 'a':
                    System.out.print(" " + HEX_BITS[10]);
                    break;
                case 'b':
                    System.out.print(" " + HEX_BITS[11]);
                    break;
                case 'c':
                    System.out.print(" " + HEX_BITS[12]);
                    break;
                case 'd':
                    System.out.print(" " + HEX_BITS[13]);
                    break;
                case 'e':
                    System.out.print(" " + HEX_BITS[14]);
                    break;
                case 'f':
                    System.out.print(" " + HEX_BITS[15]);
                    break;    
            }
        }
    }

    public static double exponent(double base, double exp) {
        return Math.pow(base, exp);
    }
    
    public static boolean hasEight(int number) {
        int tempCheck ;
        while (number > 0){
            tempCheck = number % 10;
            if (tempCheck == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void magicSum(Scanner sc) {
        
    }

    public static void print(int [] array) {
        System.out.print("the values are [");
        
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(" " + array[i] + ",");
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.print(" ]");
    }
    
    public static void print(double [] array) {
        System.out.print("the values are [");
        
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(" " + array[i] + ",");
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.print(" ]");
    }
    
    public static void print(Float [] array) {
        System.out.print("the values are [");
        
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(" " + array[i] + ",");
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.print(" ]");
    }

    public static String arrayToString(int[] array) {
        
        String arrStr = "[ ";
        for (int i = 0; i < array.length; i++) {
            if (i <= array.length - 2) {
                arrStr = arrStr + array[i] + ", ";
            } else {
                arrStr = arrStr + array[i] + " ]";
            }
        }
        return arrStr;

    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }else{
            return false;
        }
        
        
        return true;
    }





    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,5};
        arrayToString(arr);


        scanner.close();
    }
}
