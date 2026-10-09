import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Sets {
    public static void main(String[] args) {
        // Aset doesnot contains any duplicate value
        // It doesnot have any Idex value as well
        // Items are not arranged in index order in set
        // Set is an interface amd Hashset utilize the Set interface
       Set<Integer> nums = new HashSet<Integer>();
		nums.add(34);
		nums.add(45);
		nums.add(87);

		System.out.print(nums);

	   Set<Integer> nums2 = new HashSet<Integer>();
		nums2.add(34);
		nums2.add(45);
		nums2.add(87);
        nums2.add(34);

		for (int element : nums2) {
			System.out.print((int)element + " ");
		} 

        System.err.println();
        //used to order the set based on low to high values
        Set<Integer> nums3 = new TreeSet<Integer>();
		nums3.add(34);
		nums3.add(45);
		nums3.add(87);
        nums3.add(34);

		for (int element : nums3) {
			System.out.print((int)element + " ");
		} 
    }
    
}