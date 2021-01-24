package com.mycompany.practiceday14.abstractdemo;

public class MileageMain {
    public static void main(String[] args)
    {
        System.out.println("Showing Mileage details of 2 wheelers");
        //Creating an object of Two wheeler class
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.showDetails("Two Wheeler");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Showing Mileage details of 4 wheelers");
        //Creating an object of Four Wheeler Class
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.showDetails("Four Wheeler");
    }
}
