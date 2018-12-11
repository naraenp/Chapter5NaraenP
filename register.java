//Naraen Palanikumar
//12.10.2018
//Pizza Program Client (Register)
//Client for user to input stuff for pizza class to process

//import section
import java.util.Scanner;

public class register{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 1;
        int ingnum = 1;
        int moneyin = 1;
        Pizza name = new Pizza(choice, ingnum, moneyin);
        Pizza.registermenu();
        
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
        String namae = scan.nextLine();
        System.out.println("Enter the choice of pizza type: ");
        System.out.println("1 - Cheese\n2 - Pepperoni\n3 - Sausage\n4 - Eternal Void"); 
        int ptypae = scan.nextInt();
        System.out.println("How many ingredients?: ");
        int ingnaum = scan.nextInt();
        System.out.println("How much money did the client give?: ");
        double monaeyin = scan.nextDouble();
        
        
        //https://stackoverflow.com/questions/19961844/creating-multiple-objects-with-different-names-in-a-loop-to-store-in-an-array-li
    }
}