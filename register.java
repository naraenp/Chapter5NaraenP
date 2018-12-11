//Naraen Palanikumar
//12.10.2018
//Pizza Program Client (Register)
//Client for user to input stuff for pizza class to process

//import section
import java.util.Scanner;

public class register{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        switch(choice){
            case 1:
                {}
            case 2:
                {}
            case 3:
                {}
            case 4:
                {}
        }
        
        
        
        System.out.println("Enter the client's name: ");
        String name = scan.nextLine();
        System.out.println("Enter the choice of pizza type: ");
        System.out.println("1 - Cheese\n2 - Pepperoni\n3 - Sausage\n4 - Eternal Void"); 
        int choice = scan.nextInt();
        System.out.println("How many ingredients?: ");
        int ingnum = scan.nextInt();
        System.out.println("How much money did the client give?:: ");
        double moneyin = scan.nextDouble();
        
        Pizza name = new Pizza(choice, ingnum, moneyin);
        
    }
}