import java.util.ArrayList;
import java.util.List;

public class J8Test {
    public static void main(String[] args){


        // demo of some methods on Collections that use lambdas
        List<String> names = new ArrayList<>(4);
        names.add("William");
        names.add("James");
        names.add("Melissa");
        names.add("Dave");

        // forEach method
        System.out.println("forEach Method");
        System.out.println("___________");
        names.forEach(System.out::println);
        System.out.println("");
        System.out.println("removeIf Method");
        System.out.println("___________");
        // removeIf method(passed a lambda
        names.removeIf(n-> n.length() < 5);
        names.forEach(System.out::println);



    }
}
