/**
 * StreamEX
 */
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import java.util.ArrayList;
public class StreamEX {
    public static void main(String[] args) {
        // This will genrate a 10000 list of numbers
        List<Integer> lst = new ArrayList<>(10000);
        Random rand = new Random();
        for(int i = 0;i<10000;i++){
            lst.add(rand.nextInt(100));
        }
        System.err.println(lst);
        long t1 = System.currentTimeMillis();
        int s1 = lst.stream() //return a stream
                .map(n -> n*2) // doesnot return stream
                .reduce(0,(c,e) -> c+e);
        long t2 = System.currentTimeMillis();

/*  
ntermediate operations (like .map(), .filter(), .distinct()) 
take a stream, process the elements, and return a new Stream. 
Because they return a stream, you can chain them together.

Terminal operations (like .reduce(), .collect(), .forEach(), .count()) 
consume the stream, trigger the actual execution of the pipeline, and 
return a non-stream result (a collection, a boolean, a void, or a single reduced value).

*/  
        long t3 = System.currentTimeMillis();

         int s2 = lst.parallelStream() //return a stream
                .map(n -> n*2) // doesnot return stream
                .reduce(0,(c,e) -> c+e);
        long t4 = System.currentTimeMillis();

        System.err.println(s1);
        System.err.println(s2);
        System.err.println("1. "+(t2-t1));
        System.err.println("2. "+(t4-t3));

    }
    
}