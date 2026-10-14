import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public void ToString(Student std){
		System.out.print("Name: "+std.name+" age: "+std.age);
	}
}
class sorting{
	public static void ToString(Student std){
		System.out.println("Name: "+std.name+" age: "+std.age);
		}

	public static void main(String[] args) {
		// For implementing Annonymous Ineer class structue we need to provide Gnrics on both the sides.
		//comparator is used to specify the 
		Comparator<Student> comp = new Comparator<Student>(){
			public int compare(Student std1,Student std2){
				if(std1.age>std2.age){
					return 1;
				}
				else{
					return -1;
				}
			}
		};

		List<Integer> list = new ArrayList<>();

		list.add(23);
		list.add(24);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(29);
		list.add(25);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);

		List<Student> list2 = new ArrayList<>();

		list2.add(new Student("Abhishek",13));
		list2.add(new Student("Shashank",11));
		list2.add(new Student("Ashish",17));
		list2.add(new Student("Aryan",16));
		list2.add(new Student("Amogh",19));
		for(Student element : list2){
		ToString(element);
		}
	//	Collections.sort(list,comp);
		Collections.sort(list2,comp);

		System.out.println();
		for(Student element : list2){
		ToString(element);
		}
	}
}