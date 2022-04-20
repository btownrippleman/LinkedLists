
public class LinkedList {
    private LinkedList next;
    private int val;
    LinkedList(int v){
        val = v;
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
            this.next = new LinkedList(m);
        }
        else{
            next.insert(m);
        }
    }
    public void insertAt(int n, int index){
        if (index == 0){
            LinkedList newLink = new LinkedList(n);
            newLink.next = this.next;
            this.next = newLink;
        }
        else{
            this.next.insertAt(n,index-1);
        }
    }
    public String toString(){
        if (this.next != null){
            return Integer.toString(val) +", "+next.toString();
        }
        else return Integer.toString(val);
    }
    
}
