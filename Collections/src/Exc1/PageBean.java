package Exc1;

import java.util.ArrayList;
import java.util.List;


public class PageBean<T> {


    //връща следващите няколко елемента от списъка, но не работи прравилно все още;
    public void next(ArrayList<T> elements, int pageSize) {
        ArrayList<T> firstE = new ArrayList<>();
        //int size = elements.size();
        //int pages = size/pageSize;
        for(int i = 0; i <= elements.size(); i++){
                while(i!=pageSize-1){
                    firstE.add(elements.get(i));
                    System.out.println("Fisrt element is:"+ firstE.get(i));
                }
        }
        System.out.println(firstE);
    }

    /*//връща предишните няколко елемента на списъка;
    public List<T> previous() {

    }

    //връща дали има следващи елементи;
    public boolean hasNext() {

    }

    //връща дали има предишни елементи;
    public boolean hasPrevious() {

    }

    //връща първата страница и я прави текуща;
    public List<T> firstPage() {

    }

    //връща последната страница и я прави текуща;
    public List<T> lastPage() {

    }

    //връща номера на текущата страница.
    public List<T> getCurrentPageNumber() {
    }*/
}
