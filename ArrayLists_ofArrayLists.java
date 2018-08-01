import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<String> inner_list = new ArrayList<>();
        List<String> inner_list_two = new ArrayList<>();
        List<List<String>> list_of_lists = new ArrayList<>();

        inner_list.add("William Murphy");
        inner_list.add("Melissa Lin");
        inner_list.add("James Murphy");

        inner_list_two.add("Ellen Murphy");
        inner_list_two.add("Ralph Murphy");
        inner_list_two.add("The Klamps");


        list_of_lists.add(inner_list);
        list_of_lists.add(inner_list_two);

        Iterator<List<String>> iter = list_of_lists.iterator();
        while (iter.hasNext()){
            List<String> inner = iter.next();
            Iterator<String> j = inner.iterator();
            while (j.hasNext()){
                System.out.println(j.next());
            }
        }

    }
}
