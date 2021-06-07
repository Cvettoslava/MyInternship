package Exc3andExc4;

import com.company.OutOfRangeException;

import java.util.ArrayList;

public class WorkWithList {

    public ArrayList list;

    //Constructor
    public WorkWithList (ArrayList listA){
        this.list = listA;
    }

    /** Adds object to ArrayList.
    * @param obj is the object who we want to add to ArrayList.*/
    public void add(Object obj){

        list.add(obj);
    }

    /** Remove last added object from ArrayList.*/
    public void remove() throws EmptyList {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == true){
            throw new EmptyList();
        }else {
            int index = list.size() - 1;
            list.remove(index);
        }
    }
    /** Prints all object in ArrayList.*/
    public void printAllElements(){
        boolean isEmpty = list.isEmpty();
        if (isEmpty == true){
            System.out.println("The List is empty!");
        }else {
            System.out.println(list);
        }
    }
}
