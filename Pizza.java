//Naraen Palanikumar
//12.06.18
//Pizza Class (Cash Register)
//Creates methods for a pizza place to process orders

public class Pizza{
    public final double TAXRATE = 1.06;
    private static int pizzachoice;
    private static int choice;
    private static int xd; 
    public Pizza(int n1, int n2, int n3){
        pizzachoice = n1;
        choice = n2;
        xd = n2;
    }
    
    public static void registermenu(){
        System.out.println("~~---REGISTER MENU---~~");
        System.out.println("1. Enter Pizza Order");
        System.out.println("2. Finish Pizza Order");
        System.out.println("3. See Number of Pizzas Sold");
        System.out.println("4. Total Sales");
        System.out.println("5. Lock/Unlock");
        System.out.println("6. Set Password");
        System.out.println("7. Exit");
    }
    
    public int choicepricing;
}

