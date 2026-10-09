// List , Queqe, Set implements the collection interfaces
import java.util.*;
class List {
	public static void main(String[] args) {
		//we are using collections.
		//collection are utility pacakages and so we will be importing the collection pacakage first. .
		//using Genrics to specify the variable type.
		//collectios is an interface so you cannot create am object of collection.
		//collectiosn by default implements object class , so if we dont specify the datatype , it will count it as a seperate object.
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(34);
		nums.add(45);
		nums.add(87);

		System.out.print(nums);

		Collection nums2 = new ArrayList();
		nums2.add(34);
		nums2.add(45);
		nums2.add(87);

		for (Object element : nums2) {
			System.out.print((int)element + " ");
		}
	}
}