public class Main {
    public static void main(String[] args) {
        Node m = new Node(0);
        for (int i:new int[]{1,2,3,4,5}){
            m.insert(i);
        }
        
        System.out.println(m); 
        System.out.println("the length of this node is"+m.getLength()); 
        m.insertAt(7, 2);

        System.out.println(m); 
        System.out.println("the length of this node is"+m.getLength()); 
        System.out.println("deleting at position 0");
        m.delete(0);
        System.out.println(m); 
        System.out.println("the length of this node is"+m.getLength()); 
        System.out.println("deleting at position 2");
        m.delete(2);
        System.out.println(m); 
        System.out.println("the length of this node is"+m.getLength()); 
    }
}
