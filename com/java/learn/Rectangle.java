package com.java.learn;

/**
 * A constructor is a special method used to initialize objects
 * A constructor is called when an object of a class is created
 * It can be used to set initial values for object attributes
 */
public class Rectangle{
    /** class attributes */
    int x;
    int y;

    /**create  class constructor for the Rectangle class*/
    public Rectangle(){
        /**set the initial values for class attributes */
        x=5;
        y=6;
    }

    /**parametized constructor */
    public Rectangle(int a, int b){
        x=a;
        y=b;
    }

    public int area(){
        return x*y;
    }
    public int perimeter(){
        return (x+y)*2;
    }

    public static void main(String[] args) {
        Rectangle myRectangle=new Rectangle();

        /**Demonstrate parametized constructor */
        Rectangle myRectangleOne=new Rectangle(8,10);
        
        System.out.println("Area: "+myRectangle.area());
        System.out.println("Perimeter: "+myRectangle.perimeter());

    
        System.out.println("Area One: "+myRectangleOne.area());
        System.out.println("Perimeter One: "+myRectangleOne.perimeter());
    }
}