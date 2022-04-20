
public class Node {
    private Node next;
    private int val;
    Node(int v){
        val = v;
    
    }
    public void delete(int index){
        if(index == 0 && next !=null){
            val = next.val;
            next = next.next;
        }
        else   deleteAtPosition(index -1);
    }

    public void deleteAtPosition(int index){
        if (next!= null){
            if (index != 0){
                next.deleteAtPosition(index-1);
                }
            else{
                next = next.next;
            }
        }
    }


    public int getLength(){
        if (this.next != null){
            return 1+next.getLength();
        }
        else{
            return 1;
        }
    
    }
    public void insert(int m){
        if (next == null){
            this.next = new Node(m);
        }
        else{
            next.insert(m);
        }
    }
    public void insertAt(int n, int index){
        if (index == 0){
            Node newLink = new Node(n);
            newLink.next = this.next;
            this.next = newLink;
        }
        else{
            this.next.insertAt(n,index-1);
        }
    }
    public String toString(){
            return "Printing the list: "+getString();
    }
    public String getString(){
        if (this.next != null){
            return Integer.toString(val) +" "+next.getString();
        }
        else return Integer.toString(val)+" ";

    }
    
}
