package data.structures.linear.arraylist;

/**
 * Custom array list to understand internal workings and mechanics.
 *
 * Uses generic so we can create it for any type.
 */
public class ArrayList<T> {

    // example functions
    // add
    // remove
    // get
    // set
    // remove
    // size
    // isEmpty
    // isFull

    private T[] data; // the array

    private int size = 2; // using normal array but will increase as we add

    private int count = 0;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        this.data = (T[]) new Object[size]; // object cast to type
    }

    public Boolean isFull(){
        return count == size;
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    public void add(T val){
        if (isFull()) {
            resize();
        }

        data[count] = val;
        count++;
    }

    public T get(int i){
        return data[i];
    }

    public void set(T val, int i){
        data[i] = val;
    }

    @SuppressWarnings("unchecked")
    public void resize(){
        T[] r = (T[]) new Object[size*2];

        if (count >= 0) System.arraycopy(data, 0, r, 0, count);

        data = r;
    }



}
