public class Main {
    public static void main(String[] args) {
        LinkedList m = new LinkedList(0);
        for (int i:new int[]{1,2,3,4,5}){
            m.insert(i);
        }
        
        System.out.println(m); 
        System.out.println("the length of this node is"+m.getLength()); 
        m.insertAt(7, 2);
        System.out.println(m); 
        System.out.println("the length of this node is"+m.getLength()); 

    }
}
