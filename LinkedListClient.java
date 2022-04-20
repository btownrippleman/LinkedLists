public class LinkedListClient
{
   public static void main(String[] args)
   {
     LinkedList numbers = new LinkedList( ); //construct empty LinkedList

     System.out.println( "Length of list: "+ numbers.getLength());
     
     numbers.addToFront(5);
     
     //System.out.println("printing the list: "+numbers.toString( ) );
     
     numbers.addToFront(4);
     
     //System.out.println("printing the list: "+numbers.toString( ) );
     
     numbers.addToFront(3);
     
     //System.out.println("printing the list: "+numbers.toString( ) );

     numbers.addToFront(2);
     
    // System.out.println("printing the list: "+numbers.toString( ) );
     
     numbers.addToFront(1);
     
     //System.out.println("printing the list: "+numbers.toString( ) );
     
     
     
   }


}