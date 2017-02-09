package com.company;

/**
 * Created by Emil on 01/02/2017.
 */
public class Triangle {

    private int a, b, c;

    public Triangle() {

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isValid(){
        if (a+b > c && a+c > b && b+c > a){
            return true;
        } else {
            return false;
        }
    }

    public String checkSides(){
        if (a == b && a == c){
            return "It's a equilateral";
        }   else if (a == b || a == c || b == c){
            return "It's a isosceles";
        }   else {
            return "It's a scalene";
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
