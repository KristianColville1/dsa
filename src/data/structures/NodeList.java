package data.structures;

/**
 * Custom generic singly linked list
 */
public class NodeList<T> {

    public T val;
    public NodeList<T> next;

    public NodeList(){}
    public NodeList(T val){
        this.val = val;
    }

    public NodeList(T val, NodeList<T> next){
        this.val = val;
        this.next = next;
    }
}
