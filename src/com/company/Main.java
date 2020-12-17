package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object object = null;
        try{
            test(object);
        } catch (Exception exception){
            System.out.println("Object exception detected!");
        }
        Scanner in = new Scanner(System.in);
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int [] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        try{
            int input = in.nextInt();
            if(input < 1 || input > 12){
                throw new ArrayIndexOutOfBoundsException("Out of the index!!!");
            }
            System.out.printf("%-10s%d", months[input - 1], dom[input - 1]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException.getMessage());
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Incorrect format!!!");
        }
    }

    public static void test(Object object){
        object.toString();
        System.out.println("I am here");
    }
}
