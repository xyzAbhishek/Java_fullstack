
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class consumer_intro{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0;i<5 ;i++ ) {
			list.add(i*2);
		}

		Consumer<Integer> cons = T -> System.out.println(T);

		list.forEach(cons);
	}
}