import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class streamAPI {
    public static void main(String[] args) {
        
    List<Integer> l1 = new ArrayList<>();
    for(int i = 0;i<5;i++){
        l1.add(i*2);
    }
    Stream<Integer> s1 = l1.stream();

    //you can use a stream for only once , cannot use it for multiple times..
  //  s1.forEach(n -> System.out.println(n));
   // s1.forEach(n -> System.out.println(n-1));
    Stream<Integer> s2 = s1.map(n -> n-2);
    Stream<Integer> s3 = s2.map(n -> n-2);
    Stream<Integer> s4 = s3.map(n -> n-2);
    Stream<Integer> s5 = s4.map(n -> n-2);

//     s2.forEach(n -> System.out.println(n));
  //   s3.forEach(n -> System.out.println(n));
//     s4.forEach(n -> System.out.println(n));
     s5.forEach(n -> System.out.println(n));

System.err.println();
System.err.println();
System.err.println();

   int result =   l1.stream()
        .filter(n -> n%2==0) //creates a new stream
        .map(n -> n+1) // creates a new stream
        .reduce(0,(c,e) -> c+e);

    System.err.println(result);

    



}
}
