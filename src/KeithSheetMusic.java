import java.util.Scanner;
//Program to find discount
public class KeithSheetMusic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float discount;//discount provided by keith sheet music company
        char profession;
        float purchaseTotal;
        float salesTax = 0.05f;
        float discountedPrice;
        float totalPrice;
        //User Input to enter your profession
        System.out.println("Enter your profession.If u are a teacher then press T or N if  u are not a teacher ");
        profession = sc.next().charAt(0);
        //User input to enter your purchase details
        System.out.println("Enter your purchase details");
        purchaseTotal = sc.nextFloat();

        //Logic to implement discount policy for music teachers and non teachers
        if(profession == 'T'){
            if(purchaseTotal < 100){
                discount = 0.10f;
                discountedPrice = purchaseTotal - purchaseTotal * discount;
                totalPrice = discountedPrice + salesTax * discountedPrice;
                System.out.println("Your total bill amount is "+totalPrice);



            }
        }


    }
}
