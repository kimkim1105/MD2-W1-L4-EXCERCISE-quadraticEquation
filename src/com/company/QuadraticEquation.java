package com.company;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(double a,double b,double c){
        double delta = Math.pow(b,2)-4*a*c;
        return delta;
    }
    public double getRoot1(double a,double b,double delta){
        double r1 = (-b+Math.sqrt(delta))/(2*a);
        return r1;
    }
    public double getRoot2(double a,double b,double delta){
        double r2 = (-b-Math.sqrt(delta))/(2*a);
        return r2;
    }


}
