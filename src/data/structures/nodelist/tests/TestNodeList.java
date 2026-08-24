package data.structures.nodelist.tests;
import data.structures.nodelist.NodeList;

public class TestNodeList {
    public static NodeList<Integer> head = new NodeList<>();
    public static NodeList<Integer> dummy = head;

    public static NodeList<Integer> testManually(){
        NodeList<Integer> current = dummy;
        current.val = 20;
        current.next = new NodeList<>(30); // begin manually switching
        current = current.next;
        current.next = new NodeList<>(40); // moves over to next node
        current = current.next;
        current.next = new NodeList<>(50);


        return head; // testing that we get 20,30,40,50 to understand the traversal

    }

    public static void main(String[] args) {

        NodeList<Integer> result = testManually();
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
