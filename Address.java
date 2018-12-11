//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address implements Comparable
{

   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }
   
   /**
    * Returns a -1 if I am less than,  +1 if I am greater, 0 if equal
    * @retrun int -1, 1, 0
    */
   public int compareTo(Object obj) //object is a general container
   {
       Address other = (Address)obj ;//cast Object to my class
       
       int s = this.streetAddress.indexOf(" ");
       int n = other.streetAddress.indexOf(" ");
       
       String a = this.streetAddress.substring(s);
       String b = other.streetAddress.substring(n);
       String c = this.streetAddress;
       String d = other.streetAddress;
       
       if(a.compareTo(b) <0 ){
           return -1;
        }
       else if(a.compareTo(b) > 0)
           return 1;
       else
       {
           
               if(c.compareTo(d) <0 ){
               return -1;
            }
           else if(c.compareTo(d) > 0)
               return 1; 
        }

      
       
       return 0;
   }


   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
