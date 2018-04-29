public class PredicateExample {
    public static void main(String[] args){

        // lambda function examples
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;
        Predicate<String> p5 = s -> s.length() > 10;
        Predicate<String> p3 = p1.and(p2);
        Predicate<String> p4 = p2.or(p5);


        boolean b = p1.test("Hello world!");
        System.out.println("p1 is shorter than 20 chars: " + b);


        System.out.println("p3 for yes: " + p3.test("yes"));
        System.out.println("p3 for good morning gentlemen: " + p3.test(" good morning gentlemen"));
        System.out.println("p3 for good morning: " + p3.test("good morning"));


        System.out.println("p4 test true: " + p4.test("true"));
        System.out.println("p4 test not true: " + p4.test("not true"));

        Predicate<String> strings = Predicate.isEqualTo("yes");
        System.out.println("p5 test: " + strings.test("yes"));



    }
}
