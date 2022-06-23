package Lab2306;

import java.util.Arrays;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc  = new Scanner(System.in);
//		int  roll  = sc.nextInt();
//		String n =  sc.nextLine();
		
		Student obj11 = new Student(1001, "Vishal", "Maths", 75);
		Student obj22 = new Student(1002, "Akshay", "Science", 85);
		Student obj33  = new Student(1003, "Kunal", "Marathi", 95);
		Student obj44 = new Student(1004, "Vikas", "Hindi", 65);
		Student obj55 = new Student(1005, "Darsh", "English", 35);
		
		
		Student [] arr = { obj11 , obj22, obj33, obj44, obj55};
		
		Arrays.sort(arr, new NameComparator());
		
		for(Student s : arr) {
			System.out.println(s+" ");
		}
		
		
		System.out.println("\n from Marks Sort");
		Arrays.sort(arr, new TotalMarksComparator());
		
		for(Student v : arr) {
			System.out.println(v+" ");
		}
		
	}

}
