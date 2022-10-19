import java.util.Scanner;

public class Ticket_Price {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int distance, age, tripType;

        System.out.println("Please enter the distance in kilometers : ");
        distance = inp.nextInt();

        System.out.println("Please enter you age : ");
        age = inp.nextInt();

        System.out.println("Please enter your trip type (one way --> 1   round trip --> 2");
        tripType = inp.nextInt();

        double price = distance * 0.10;
        double tTypeDsc = price * 0.20;

        if (age < 12 && tripType == 2) {
            double ageDsc1 = price * 0.50;
            double kidPrice = price - ageDsc1 - tTypeDsc;
            System.out.println("Your total price is : "+kidPrice);
        }
        else if (age < 12) {
            double kidPrice;
            double ageDsc1 = price * 0.50;
            kidPrice = price - ageDsc1;
            System.out.println("Your total price is : "+kidPrice);
        }
        if (age > 12 && age < 24 && tripType == 2){
           double ageDsc2 = price * 0.10;
           double teenPrice = price - ageDsc2 - tTypeDsc;
            System.out.println("Your total price is : "+teenPrice);
        } else if (age > 12 && age < 24) {
            double ageDsc2 = price * 0.10;
            double teenPrice = price - ageDsc2;
            System.out.println("Your total price is : "+teenPrice);
        }
        if (age > 65 && tripType == 2) {
            double ageDsc3 = price * 0.30;
            double oldPrice = price - ageDsc3 - tTypeDsc;
            System.out.println("Your total price is : "+oldPrice);
        } else if (age > 65) {
            double ageDsc3 = price * 0.30;
            double oldPrice = price - ageDsc3;
            System.out.println("Your total price is : "+oldPrice);
        }     else {
            System.out.println("Your total price is : "+price);
        }


    }
}
