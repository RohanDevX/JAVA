import com.sun.source.tree.WhileLoopTree;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    final int a = 10;
        System.out.println("enter the numer:");
//        Scanner input = new Scanner(System.in);
//        int b = input.nextInt();
//        int add = a + b;
//        System.out.println(add);
//        byte a = (byte)128;
//        byte b = 127;
//        int sum = a + b;
//        System.out.println(sum);
//        char c = ('A');
//        System.out.println(c);
//        int num = 'A';
//        System.out.println(num);
//          boolean exp = ('B') > ('b');
//        System.out.println(exp);
//        int car1 = 'b';
//        int car2 = 'B';
//        System.out.println(car1 );
//        System.out.println(car2 );
//        String one = " ";
//         String grt = one.toUpperCase();
//        System.out.println(grt);
//        boolean i = grt.isBlank();
//        boolean j = grt.isEmpty();
//        System.out.println(i);
//        System.out.println(j);
//        String one = "I'M ROHAN AND YOU WILL SUCK MY ";
//        String two = one.concat("DICK");
////        System.out.println(two);
//        String myString = "rohan ";
//        String myString2 = "is thriving for betterment";
//        System.out.println(myString + myString2 + " " + (2 + 3));
//        System.out.println("mark".concat(" is 2"));
//        String another = new String("hello");
//        String another1 = "hello";
//        System.out.println(another1);
//        System.out.println(another);
//        Scanner input = new Scanner(System.in);
//        System.out.println("ENTER YOUR FAV NUMBER: ");
//        int fav = input.nextInt();
//        System.out.println(fav);
//        System.out.println("ENTER YOUR NAME: ");
//        String naam = input.nextLine();
//        System.out.println(naam);
//        System.out.println("HAVE YOU EVER LIED");
//        boolean what = input.nextBoolean();
//        System.out.println(what);
//        System.out.print("ENTER YOUR NAME and age:");
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println("age");
//        int num =  input.nextInt();
//        String suma = "helo";
//        boolean what = suma.isBlank();
//        System.out.println("so your name is " + name + "" + " and your age is " + num + " " +what);
// Scanner input = new Scanner(System.in);
// System.out.println("enter a");
// int a = input.nextInt();
// System.out.println("enter b");
// int b = input.nextInt();
// int max = ((a > b) ? a : b);
//        System.out.println(max + " " + "is the biggest number");
//String aka = "";
//if (aka.isBlank()){
//    System.out.println("it is empty, please enter anything");
//int i = 10;
//while (i>0){
//    System.out.println(i);
//    --i;
//        System.out.println("Enter the salary:");
//        Scanner input = new Scanner(System.in);
//        int salary = input.nextInt();
//        if (salary > 10000) {
//            System.out.println("your new salary is " + (salary + 2000));
//        } else if (salary >= 7000) {
//            System.out.println("your salary is " + (salary + 1000));
//
//        } else {
//            System.out.println("your new salary is " + salary);
//        }
//        for (int i=1 ; i ; i+=2){
//            System.out.println(i);
//            for (int j = 0; j < ; j++) {
//
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i = 0; i < n  ; i++) {
//            System.out.println("jello worlds");
//
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("HELLO WORLD :)");
//        Scanner input = new Scanner(System.in);
//        int i=1 ;
//        int n = input.nextInt();
//        while (i < n){
//            System.out.println(i);
//            i++;
//
////        }
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int i = 0;
//        do {
//            System.out.println("hello");
//            i++;
//        }while (i<n);
//        System.out.println("enter your first  and second number:");
//        Scanner input = new Scanner(System.in);
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        if (n1>n2){
//            System.out.println("the number " + n1 + " is largest");
//        }else{
//            System.out.println("the number " + n2 + " is largest");
//        }
//        System.out.println("ENTER THE NUMBER:");
//        Scanner input = new Scanner(System.in);
//        int i = input.nextInt();
//        if (i % 2 == 0){
//            System.out.println("IT IS EVEN");
//        }else {
//            System.out.println("IT IS ODD");
//        }
//        System.out.println("ENTER YOUR NUMBER:");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        if (n<10){
//            System.out.println("<10");
//        } else if (n==10) {
//            System.out.println("n=10");
//        }else {
//            System.out.println("n>10");
//        }
//        System.out.println("ENTER YOUR NUMBER:");
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        switch (num % 2){
//            case 0:
//                System.out.println("it is even");
//                break;
//            case 1:
//                System.out.println("it is odd");
//                break;
//            default:
//                System.out.println("ENTER VALID NUMBER");
//
//
//        }
//
//        System.out.println("ENTER YOUR TWO NUMBER:");
//        Scanner in = new Scanner(System.in);
//        double num1 = in.nextInt();
//        double num2 = in.nextInt();
//        System.out.println("ENTER THE OPERATOR AMONG THIS:(+)(-)(*)(/)");
//        char op = in.next().charAt(0);
//        if (op == '+') {
//            System.out.println("THE SUM IS: " + (num1 + num2));
//        }else if (op == '-') {
//            System.out.println("THE SUM IS: " + (num1 - num2));
//        }else if (op == '*') {
//            System.out.println("THE SUM IS: " + (num1 * num2));
//        }else if (op == '/') {
//            System.out.println("THE SUM IS: " + (num1 / num2));
////        }else {
////            System.out.println("ENTER VALID KEYS");
////    }
//        System.out.println("ENTER YOUR TWO NUMBER:");
//        Scanner in = new Scanner(System.in);
//        double num1 = in.nextInt();
//        double num2 = in.nextInt();
//        System.out.println("ENTER THE OPERATOR AMONG THIS:(+)(-)(*)(/)");
//        char op = in.next().charAt(0);
//        switch (op){
//            case '+':
//                System.out.println("THE SUM IS: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("THE DIFFERENCE IS: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("THE PRODUCT IS: " + (num1 * num2));
//                break;
//            case '/':
//                System.out.println("THE QUOTIENT IS: " + (num1 / num2));
//                break;
//            default:{
//                System.out.println("ENTER VALID KEYS");
//            }
//        }
//        System.out.println("ENTER THE FOUR NUMBERS:");
//        Scanner in = new Scanner(System.in);
//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//        int n3 = in.nextInt();
//        int n4 = in.nextInt();
//        int add1 = (n1 + n2);
//        int add2 = (n3 + n4);
//        if (add1 == add2) {
//            System.out.println("IT IS A LUCKY NUMBER");
//        }else {
//            System.out.println("IT IS NOT A LUCKY NUMBER");
//        }
//        System.out.println("ENTER THE NUMBER BETWEEN 1 TO 10:");
//        Scanner in =  new Scanner(System.in);
//        int n = in.nextInt();
//        while (n > 10 || n <1){
//            System.out.println("ENTER NEW NUMBER,TRY AGAIN");
//        n = in.nextInt();
//        }
//        System.out.println("IT IS");
//        System.out.println("ENTER THE NUMBER:");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        do {
//            System.out.println("no it is not between 1 to 10 !!! so try agaimn");
//            n = in.nextInt();
//        }while (n<1 || n>10);
//        System.out.println("yes it is between 1 to 10");

//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=i ; j++)
//                System.out.print( '*' +" ");
//            System.out.println();
//        }
//        for (int i = 1; i <=10; i++) {
//            for (int j = 1; j <=10; j++) {
//                System.out.print((i * j) + " ");
//
//            }
//            System.out.println();
//        }

        
//        for (int i = 0; i <=15; i++) {
//            if (i == 3 || i == 6 || i == 11 || i == 14 || i == 9){         //BREAK STATEMENT//
//                continue;}
//            System.out.print(i + " ");
//        }
//        System.out.println("ENTER A NUMEBR:");
//        Scanner input = new Scanner(System.in);                               // ternary operator//
//        int n = input.nextInt();
//         int  j = (n == 10)?1:10;
//            System.out.println(j);

//        System.out.println("ENTER YOUR NUMBER BETWEEN 1 TO 7:");
//        while (true) {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//            switch (n) {
//                case 1:
//                    System.out.println("ONE");
//                    break;
//                case 2:
//                    System.out.println("TWO");              //switch and asking input again if user enters wrong one//
//                    break;
//                case 3:
//                    System.out.println("THREE");
//                    break;
//                case 4:
//                    System.out.println("FOUR");
//                    break;
//                case 5:
//                    System.out.println("FIVE");
//                    break;
//                case 6:
//                    System.out.println("SIX");
//                    break;
//                case 7:
//                    System.out.println("SEVEN");
//                    break;
//                default:
//                    System.out.println("ENTER THE  NUMBER WHICH FOLLWS THE GIVEN CONDITION, TRY AGAIN");
//                    continue;
//
//            }
//            break; //we give break so that it won't go back to while loop again//
//        }
//        System.out.println("ENTER THE CHARACTER:");
//        Scanner in = new Scanner(System.in);
//        while (true){
//        char n = in.next().charAt(0);
//                    switch (n) {                                     //ENHANCED SWITCH WITH TERNARY OPERATOR//
//            case 'A', 'E', 'I', 'O', 'U' -> System.out.println("VOWEL");
//            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("VOWEL");
//            default -> System.out.println(Character.isLetter(n) ? "CONSONANT" : " INVALID");
//        }
//        break;
//        }

//        System.out.println("THE EVEN NUMBERS ARE:");
//        for (int i = 0; i <=100; i++) {               //printing even numbers//
//            if (i % 2 == 1){                      //method1//
//                continue;
//        }
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println("THE EVEN NUMBERS in decreasing orderr is:");
//        for (int i = 100; i >=0; i--) {          //printing even numbers in drcreasing order//
//            if (i % 2 == 0)                      //method2//
//            System.out.print(i + " ");
//
//        }
//        System.out.println();
//        System.out.println("THE EVEN NUMBERS in decreasing orderr is:");
//        for (int i = 100; i >=0; i-=2) {          //printing even numbers in drcreasing order//
//          System.out.print(i + " ");                 //method3//
//
//        }

//      int n = 0;
//while (true) {
//    System.out.println("ENTER THE NUMBER");
//    Scanner input = new Scanner(System.in);
//    n += input.nextInt();
//    if (n>100){ break;}
//        System.out.println("done");
















        }
    }












