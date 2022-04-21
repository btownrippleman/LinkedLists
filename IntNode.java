   public class IntNode
   {
      private int data;
      private IntNode next;
      
      public IntNode(int datax)
      {
         data = datax;
      } 
      public int getData()
      {
         return data;
      }
      public void setData(int newdata)
      {
         data = newdata;
      }
      
      public IntNode getNext()
      {
         return next;
      }
      public void setNext(IntNode newNext)
      {
         next = newNext;
      }


 public String toString(){
     if (this.next != null){
         return data +" "+next.toString();
     }
     else return Integer.toString(data)+" ";

 }
  
  }
 

