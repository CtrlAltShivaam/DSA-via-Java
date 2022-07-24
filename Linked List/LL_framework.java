import java.util.*;
public class LL_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");
        
        list.remove(2);
        System.out.println(list);

    }
}
