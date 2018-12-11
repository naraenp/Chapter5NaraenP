
/**
 * Write a description of class Student_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student_Test
{
   public static void main (String[] args)
   {



    Address home = new Address("456 Elm st", "Naperville", "IL", 60565);
    Address school = new Address("540 W Auora Ave", "Naperville","IL",60540);

    Student Taylor = new Student("Taylor","Swift",home);
    System.out.println(Taylor.schoolAddress);
    
    Student Jill = new Student("Jill","Jones",home);
    Student Tom = new Student("Tom","Jones",home);
    
    System.out.println(Tom.get_pop());
    
    //non static variable so objects can access but not the class as its not on the class level
    System.out.println(Jill.getSchool());

    //System.out.println(Jill.compareTo(Taylor));
    //System.out.println(Jill.compareTo(Tom));






}//end of main
}
