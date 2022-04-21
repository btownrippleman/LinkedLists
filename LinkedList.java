import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class LinkedList
{//LinkedList
   
   //Declare variables
   private IntNode head;
      
   //Constructor
   public LinkedList()
   {
      head=null;
   }
   
   //Method to 
   
   //Method to delete at a particular index
      public boolean deleteAt(int n)
   {//deleteAt
      if(head==null)
      return false;
      if(n==0)
      {
         head=head.getNext();
         return true;
      }
      
      int counter=1;
      IntNode current=head.getNext();
      IntNode prev=head;
      while(counter!=n&&current!=null)
      {
         prev=current;
         current=current.getNext();
         counter++;   
      }
         if(current==null)
            return false;
         
         
         prev.setNext(current.getNext());
         return true;    
   }//deleteAt
   
   //Method that adds to the front
     public void addToFront(int n)
   {
      IntNode theNode=new IntNode(n);
      theNode.setNext(head);
      head=theNode;
      System.out.println("Inserting "+n+"\nprinting the list: "+this.toString( ));
   }


////////////////////////////////////////////
   
   //Method to get the length of the linked list by traversing
   public int getLength()
   {//getLength()
    
    
    if(head==null)
      return 0;
      
    if(head.getNext()==null)
      {
         return 1;
      }
      
      int counter=1;
      IntNode current=head.getNext();
      IntNode prev=head;
      while(current!=null)
      {
         prev=current;
         current=current.getNext();
         counter++;   
      }
        return counter;
         
   }//getLength()

   public int getNumberOfOccurences(int number){
      int occurences = recursionToGetOccurences(head,number);
      if (occurences == 0) return -1;
      else return occurences;
   }
   public int recursionToGetOccurences(IntNode node, int number){
      if (node != null){
         if (node.getData() == number) return 1+ recursionToGetOccurences(node.getNext(), number);
         return recursionToGetOccurences(node.getNext(), number);
      }
      return 0;
   }

   
   void delete(int key)
	{
		// Store head node
		IntNode temp = head, prev = null;

		// If head node itself holds the key
		// or multiple occurrences of key
		while (temp != null && temp.getData() == key)
		{
			head = temp.getNext(); // Changed head
			temp = head; // Change Temp
		}

		// Delete occurrences other than head
		while (temp != null)
		{
			// Search for the key to be deleted,
			// keep track of the previous node
			// as we need to change 'prev->next'
			while (temp != null && temp.getData() != key)
			{
				prev = temp;
				temp = temp.getNext();
			}

			// If key was not present in linked list
			if (temp == null)
				return;

			// Unlink the node from linked list
			prev.setNext(temp.getNext());

			// Update Temp for next iteration of outer loop
			temp = prev.getNext();
		}
	}

  



     
   //
   public void insertAtRecursiveWrapper(int n, int index){
      if (index > -1){
         if (index == 0){
            IntNode newNode = new IntNode(n);
            newNode.setNext(head);
            head = newNode;
         }
         else{
            insertAtRecursive(n, index, this.head);
         }
      }
   }

   public void insertAtRecursive(int n, int index, IntNode currentNode){
      System.out.println("adding "+n+" currently at "+index+" and value is"+currentNode.getData());

      if (index >0 && currentNode.getNext()!=null) {
         insertAtRecursive(n, index-1, currentNode.getNext());
 
         }
      else if ( index == 0 && currentNode.getNext() != null){
         IntNode newNode = new IntNode(n);
         newNode.setNext(currentNode);
         currentNode = newNode;

      }        
         else if (index > 0 && currentNode.getNext() == null) {
            currentNode.setNext(new IntNode(index));
         }


      }
   
   
   
     //Iterative method to insert a number at a particular index
   public boolean insertAt(int n, int index)
   {//insertAt
      insertAtRecursiveWrapper(n, index);

      int linkedListSize=this.getLength();
      IntNode theNode=new IntNode(n);
      
      if(head==null)
      return false;
      
      if(index<0)
      {         
         this.addToFront(n);
         return true;
      }

      int counter=1;
      IntNode current=head.getNext();
      IntNode prev=head;
      //System.out.println("Before while loop, prev (head)  is: "+prev.getData()+"\nBefore while loop, current is: "+current.getData());
               while(counter<=linkedListSize&&current.getNext()!=null) //Loop through list while there are still elements in it.
               {  
                  //System.out.println("Inside while loop, at the top, prev (head)  is: "+prev.getData()+"\nInside while loop, at the top, current is: "+current.getData());
                  //System.out.println("Counter is: "+counter);
                  //System.out.println("theNode is: "+theNode.getData());
              if(counter==index) //If the # of times traversed equals the desired index
                                //location, put a new node in and adjust where the elements point to accordingly.
                  {
                     
                     //System.out.println("Inside while loop top of if statement, prev (head)  is: "+prev.getData()+"\nInside while loop, top of, if statement, current is: "+current.getData());
                     prev.setNext(theNode);
                     theNode.setNext(current);
                     //System.out.println("Inside while loop bottom of if statement, prev (head)  is: "+prev.getData()+"\nInside while loop, bottom of, if statement, current is: "+current.getData());
                     return true;
                  }
                     counter++;                       
                     prev=current;               //if the traversed # != desired index, make the old current node the new previous node,
                     current=current.getNext(); //and make the next node in the queue the new current node.                     
               }
                 
               if(/*index>linkedListSize-1*/current.getNext()==null) //When the desired index is greater than the number of elements in the list, add the new node to the end of the list.
            {
            
               System.out.println("If current.getNext() is null, BEFORE prev is: "+prev.getData());

               prev=current;
               current.setNext(theNode);
               
                              
              // prev.setNext(current);
               System.out.println("If current.getNext() is null, AFTER prev is: "+prev.getData());
               //theNode.setNext(current);
               return true;
            }
   
                  return true;
   }//insertAt
   
   //Method to delete the first of a particular value
   public boolean deleteFirst(int n)
   {
//////////////////////////////////////////////////////////////////////      
{//deleteFirst
      int linkedListSize=this.getLength();
      //IntNode theNode=new IntNode(n);
      
      if(head.getData()==n)
      {
         if(head.getNext()!=null)
            {
               head=head.getNext();
               return true;
            }
         else
            {
               head=null;
            }
      }
      
      
      
      int counter=1;
      IntNode current=head.getNext();
      IntNode prev=head;
      System.out.println("Before while loop, prev (head)  is: "+prev.getData()+"\nBefore while loop, current is: "+current.getData());
               while(counter<=linkedListSize) //Loop through list while there are still elements in it.
               {  
                  System.out.println("Inside while loop, at the top, prev (head)  is: "+prev.getData()
                  +"\nInside while loop, at the top, current is: "+current.getData());
                  System.out.println("Counter is: "+counter);
                  System.out.println("n is: "+n);
              if(current.getData()==n) //If the element at the current list position is an instance of the value to be deleted, 
                                      //delete it and connect the previous node to the node after next. 
                  {
                     if(current.getNext()!=null)
                     prev.setNext(current.getNext());
                     else
                     prev.setNext(null);
                     //theNode.setNext(current);
                     System.out.println("Inside while loop bottom of if statement, prev (head)  is: "+prev.getData()+"\nInside while loop, bottom of, if statement, current is: "+current.getData());
                     return true;
                  }
                     counter++;                       
                     prev=current;               //if the traversed # != desired index, make the old current node the new previous node,
                     if(current.getNext()!=null)
                     current=current.getNext(); //and make the next node in the queue the new current node.                     
               }//End while loop
                 
   
                  return false;
   }//deleteFirst
      

//////////////////////////////////////////////////////////////////////      
   }
   
      //toString method
      @Override
     public String toString()
     {
       String listString = "";
       IntNode current=head;
       for (int i=0; i<this.getLength(); i++ )
       {
         listString += current.getData() + " ";
         current = current.getNext();
       }
       return listString;
     }
   
   
}//LinkedList