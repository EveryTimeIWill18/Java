@FunctionalInterface
public interface Predicate<T>{

    /*functional interfaces can only contain one abstract method
    * but they can have any number of default and static methods.
    * By using Generics, we can implement functional interfaces
    * that are dynamic.
    * */
     boolean test(T t);

     // and(): must be a default method
     default Predicate<T> and(Predicate<T> other){
         return t -> test(t) && other.test(t);
     }

     //or(): must be a default method
    default Predicate<T> or(Predicate<T> other){
        return t -> test(t) || other.test(t);
    }

    static <U> Predicate<U> isEqualTo(U u){
        return s -> s.equals(u);
    }
}
