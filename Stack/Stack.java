/*Stack Data Structure using ArrayList class and its predefined methods present in collection interface.*/
import java.util.ArrayList;
public class Stack<E>{
    protected ArrayList<E> list = new ArrayList<>();

    protected void push(E data){
        list.add(data);
    }
    
    protected E peek(){
        if(list.size()==0)return ((E)("Sorry stack is empty"));
        return list.get(0);
    }

    protected E pop(){
        if (list.size() == 0) {
            return (E)("Empty stack");
        }else{
            return list.remove(list.size() - 1);
        }
    }

    protected boolean isEmpty(){
        if(list.size() == 0){
            return (E)("Empty stack");
        }else{
            return list.size() == 0;
        }
    }  
}
