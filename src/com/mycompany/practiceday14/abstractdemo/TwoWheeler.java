package com.mycompany.practiceday14.abstractdemo;

public class TwoWheeler extends Mileage{

    public void showDetails(String vehicleType)
    {
        if(vehicleType.equalsIgnoreCase("Two Wheeler"))
        {
            System.out.println("Vehicle Name : Honda Activa 6G");
            System.out.println("Available in 4 variants, 8 colours");
            System.out.println("Mileage is 50 kmpl");

            System.out.println("Vehicle Name : Yamaha FZ SF1");
            System.out.println("Available in 3 variants, 6 colours");
            System.out.println("Mileage is 45 kmpl");
        }
    }
}
