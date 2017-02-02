/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author ddsdi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        String  operation;
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Calculator...!");
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        System.out.println("Enter Operation");
        operation = sc.next();
        if("+".equals(operation)){
            answer = add(a,b);
            System.out.println("Answer is : " + answer);
        }
        else{
            System.out.println("Unsupported Operation");
        }
    }
    private static int add(int a,int b){
        return a+b;
    }
}
