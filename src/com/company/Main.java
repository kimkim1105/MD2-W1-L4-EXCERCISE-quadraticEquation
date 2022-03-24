package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Phương trình có dạng: \t"+a+"x2 + "+b+"x + "+c+" = 0");
        QuadraticEquation tinh = new QuadraticEquation();
        double delta = tinh.getDiscriminant(a,b,c);
        if(delta>0){
            double x1 = tinh.getRoot1(a,b,delta);
            double x2 = tinh.getRoot2(a,b,delta);
            System.out.println("Nghiệm phương trình là:");
            System.out.println("x1 = "+x1+"\tx2 = "+x2);
        }else if(delta==0){
            double x = tinh.getRoot1(a,b,delta);
            System.out.println("Nghiệm phương trình là: x1 = x2 = "+x);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
