import java.awt.*;
import java.nio.file.Files;
import java.util.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.*;
import java.io.*;

public class StreamExamples {
    public static void main(String[] args){

    /*  Stream.empty();     // empty stream
        Stream.of("one");   // singleton stream
        Stream.generate(() -> "one"); // constant stream
        Stream.iterate("+", s -> s + "+"); // growing stream +, ++, +++ , ...
        ThreadLocalRandom.current().ints();
        // building streams
        IntStream stream = "William".chars();
        Stream<String> words = Pattern.compile("[^\\p{javaLetter}]").splitAsStream(book);
        Stream<String> lines = Files.lines(path);
        // stream builder
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one").add("two").add("three");
        builder.accept("four");
        Stream<String> build_stream = builder.build();
        build_stream.forEach(System.out::println);*/

            /* Stream examples */

        System.out.println("Stream ex1: ");
        // print each name out
        Arrays.asList("will", "melissa", "james")
              .forEach(System.out::println);    // will
                                                // melissa
                                                // james
        System.out.print("___________ ");
        System.out.println(" ");
        System.out.println("Stream ex2: ");
        // prints first name
        Arrays.asList("will", "melissa", "james")
              .stream()
              .findFirst()
              .ifPresent(System.out::println);  // will

        System.out.print("___________ ");
        System.out.println(" ");
        System.out.println("Stream ex3: Calculating Average ");
        Arrays.stream(new double[] {1.0, 2.4, 3.12, 4.7, 5.09, 6.678, 7.0, 8, 9, 10})
              .filter(v -> v > 6)
              .map(n -> (int)n)
              .average()
              .ifPresent(System.out::println);



        /*Stream Process Order*/
        // streams are lazy evaluated, forEach() prints them out
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));

        Stream.of("d2", "a2", "b1", "b3", "c")
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .anyMatch(s -> {
                  System.out.println("anyMatch: " + s);
                  return s.startsWith("A");
              });

        // Streams cannot be reused, to bypass make a Supplier stream
        Supplier<Stream<String>> streamSupplier =
                () -> Stream.of("d2", "a2", "b1", "b3", "c")
                            .filter(s -> s.startsWith("a"));
        // new stream from supplier
        streamSupplier.get().anyMatch(s -> true);
        // new stream from supplier
        streamSupplier.get().noneMatch(s -> true);


    }

}
