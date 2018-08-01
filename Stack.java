import java.util.ArrayList;

public class Stack<T> {
    private T[] stack;
    private int size;
    private int position;
    private int numElmnts;

    // default constructor
    public Stack(){
        stack = null;
        size = 0;
        position = -1;
        numElmnts = -1;
    }
    // overloaded constructor
    public Stack(int size){
        this.size = size;
        stack = (T[])new Object[size];
        position = this.size-1;
        numElmnts = 0;
    }
    // push method
    public void push(T data){
       if(position < 0){
           System.err.print("Error: Stack filled to capacity.");
       }
       else {
           stack[position] = data;
           position -= 1;
           numElmnts += 1;
       }
    }
    // pop method
    public T pop(){
        int temp = position+1;
        T popped = stack[temp];
        numElmnts -= 1;
        position = position -1;
        return popped;
    }
    // isEmpty method
    public boolean isEmpty(){
        return (numElmnts == 0);
    }


}
