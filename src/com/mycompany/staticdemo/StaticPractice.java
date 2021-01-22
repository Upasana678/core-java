package com.mycompany.staticdemo;

public class StaticPractice {

    static int a = 10;
    static int b;
    int empId = 555;

    //static block
    static {
        System.out.println("Static block initialised");
        b = a * 4;

    }

    {
        System.out.println("I am a non static block");
    }

    public StaticPractice()
    {
        System.out.println("Default Constructor called");
    }

    public void show()
    {
        //static members are allowed to be accesed inside a non static method/context.
        System.out.println("Value of a is "+this.a);
        System.out.println("Value of Employee ID is "+this.empId);
    }
    public static void display()
    {
        //System.out.println("Value of a is "+this.a);//object creation happens late first static block gets initialised.
        //this cannot be used inside static context.
        //System.out.println("Value of Employee ID is "+this.empId);
        System.out.println("Value of a is "+a);
        //System.out.println("Value of Employee ID is "+empId);//non static members cannot be referenced inside a static method
    }

    public static void main(String[] args)
    {
        System.out.println("From Main");
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        //Creating an object of StaticPractice class
        StaticPractice sp1 = new StaticPractice();
        sp1.a = 99;//class level static variable a is getting modified by sp1 which means from now on all objects will see the modified value
        sp1.empId = 666;
        StaticPractice sp2 = new StaticPractice();
        System.out.println("Value of sp2.a is "+sp2.a);//99
        System.out.println(StaticPractice.a);//Static members can be called without object they can be called only with class name directly.
        StaticPractice.display();
        System.out.println("Value of sp2.empId is "+sp2.empId);//555
    }
}
