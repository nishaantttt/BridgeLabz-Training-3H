package Training_280825;

import java.util.*;

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to Online shopping system: ");
        System.out.println();
        int tc=0;
        System.out.println("Enter the number of customers: ");
        int cus = sc.nextInt();
        int i=1;
        while(cus>0){
            do{
                System.out.println("What would customer "+ i + " like to buy from our store today? \nwe have \n1.Shirt\n2.Shoes\n3.Jacket?");
                   int n = sc.nextInt();
                System.out.println();
                int price =0;
                switch(n){
                    case 1:
                    System.out.println("What kind of shirt do you want? we have \n1.Formal\n2.Casual\n3.Shacket ");
                    int a = sc.nextInt();
                    System.out.println();
                    switch(a){
                    case 1:
                    price = 500;
                    System.out.println("The shirt is priced at "+price+" rupees.");
                    break;

                    case 2:
                    price = 600;
                    System.out.println("The shirt is priced at "+price+" rupees.");
                    break;

                    case 3:
                    price = 700;
                    System.out.println("The shirt is priced at "+price+" rupees.");
                    break;
                }
                    break;

                    case 2:
                    System.out.println("What kind of shoes do you want? we have \n1.Sneakers\n2.Formal Shoes\n3.Sports Shoes ");
                    int b = sc.nextInt();
                    switch(b){
                    case 1:
                    price = 900;
                    System.out.println("This shoe is priced at "+price+" rupees.");
                    break;

                    case 2:
                    price = 1000;
                    System.out.println("This shoe is priced at "+price+" rupees.");
                    break;

                    case 3:
                    price = 1500;
                    System.out.println("This shoe is priced at "+price+" rupees.");
                    break;
                }
                    break;

                    case 3:
                    System.out.println("What kind of jacket do you want? we have \n1.Leather Jacket\n2.Denim Jacket\n3.Puffer Jacket ");
                    int c = sc.nextInt();
                    switch(c){
                    case 1:
                    price = 1500;
                    System.out.println("The jacket is priced at "+price+" rupees.");
                    break;

                    case 2:
                    price = 1200;
                    System.out.println("The jacket is priced at "+price+" rupees.");
                    break;

                    case 3:
                    price = 2000;
                    System.out.println("The jacket is priced at "+price+" rupees.");
                    break;
                }
                    break;
            }
            tc+=price;
            if(tc>5000){
                tc = (int) ((float) tc*0.95);
                System.out.println("Your current cart value is: " + tc + " rupees after 5% discount!!");
            }
            else{
                System.out.println("Your current cart value is: " + tc + " rupees");
            }

            System.out.println("Do you want to buy another item? ");
        }while(sc.nextInt()==1);
            cus--;
            i++;
        }
        System.out.println("Thank you for shopping, have a wonderful day!");

    }
}