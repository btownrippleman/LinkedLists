public class LinkedListTest
{
  public static void main( String [] args )
  {
    // construct empty LinkedList
    LinkedList numbers = new LinkedList( );
    for (int i: new int[] {7,2,5,3,4,6}){
      numbers.addToFront(i);
      System.out.println( "Number of items in the list: "
      + numbers.getLength() + "\n" + numbers.toString( ) );
    }

    
/*
    if ( ! numbers.deleteAt( 8 ) )   // unsuccessful - not in list
        System.out.println( "8 could not be deleted:" );

    if ( numbers.deleteAt( 2 ) )     // successful
        System.out.println( "2 was successfully deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getLength() + "\n" + numbers.toString( ) );

    if ( numbers.deleteAt( 7 ) )    // successful
        System.out.println( "7 was successfully deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getLength() + "\n" + numbers.toString( ) );

    if ( numbers.deleteAt( 5 ) )    // successful
        System.out.println( "5 was successfully deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getLength() + "\n" + numbers.toString( ) );

    if ( ! numbers.deleteAt( 8 ) )  // unsuccessful - empty list
        System.out.println( "8 could not be deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getLength() + "\n" + numbers.toString( ) );

//*///////////////////////////////////////////////////////////////////////////

    numbers.insertAt( 77,-10 );  // Insert w neg index check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST ADDED 77 AT INDEX -10: " + numbers.toString( ) );
  
    //numbers.insertAt( 55, 3 );  // Insert within index range check
   // System.out.println( "Number of items in the list: "
    // + numbers.getLength() + "\n JUST ADDED 55 AT INDEX 3: " + numbers.toString( ) );
     
     numbers.insertAt( 000, 5);  // Insert within index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST ADDED 0 AT INDEX 5: " + numbers.toString( ) );

     numbers.insertAt( 3434, 7);  // Insert outside index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST ADDED 3434 AT INDEX 7: " + numbers.toString( ) );


 
  //numbers.deleteFirst(333 );  // Delete outside index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n HERE IS MY LIST: " + numbers.toString( )+"\n\n");
     
   
   
////////////////////////////////////////////////////////////////////////////*/  
     
     numbers.deleteFirst(77 );  // Delete 0th index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST DELETED FIRST 77: " + numbers.toString( ) );


     
     numbers.deleteFirst(6 );  // Delete 1st index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST DELETED FIRST 6: " + numbers.toString( ) );

   numbers.deleteFirst(4 );  // Delete 2nd index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST DELETED FIRST 4: " + numbers.toString( ) );

   numbers.deleteFirst( 3);  // Delete 3rd index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST DELETED FIRST 3: " + numbers.toString( ) );
   
     numbers.deleteFirst( 3434);  // Delete last index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST DELETED FIRST 3434: " + numbers.toString( ) );
 
     numbers.deleteFirst( 99);  // Delete outside index range check
    System.out.println( "Number of items in the list: "
     + numbers.getLength() + "\n JUST DELETED FIRST 99: " + numbers.toString( ) );



  //if(!numbers.deleteFirst(333))
  //System.out.println("Couldn't delete 333");
  
  }
}
