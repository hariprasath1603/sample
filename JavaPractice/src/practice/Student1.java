package practice;



public class Student1 {
	private String name;
	private int rollno;
	private int[] marks;
	
	public Student1 (String name, int rollno, int[] marks  ) {
		this.name = name;
		this.rollno= rollno;
		this.marks= marks;
	}
	public int totalmarks() {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}
	 public String getname() {
		 return name;
	 }
	 public int getrollno() {
		 return rollno;
	 }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 student1 = new Student1 ("ALice", 101,new  int []{88,99,77,44,55});
Student1 student2 = new Student1("Mike", 102,new int [] {54,66,89,58,77} )	;
Student1 student3 = new Student1("Ross", 103,new int [] {88,55,66,44,77});

System.out.println(student1.getname()+"'s  Total marks"+ student1.totalmarks());
System.out.println(student2.getname()+"'s  Total marks"+ student2.totalmarks());
System.out.println(student3.getname()+"'s  Total marks"+ student3.totalmarks());
}}
