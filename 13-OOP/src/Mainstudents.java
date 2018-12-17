
public class Mainstudents {

	public static void main(String[] args) {
			students s1= new students( "Mike",17,"M",2016,"JAVA");
			   s1.attendLecture();
			   s1.attendLab();
			   s1.submitAssignment();
			   System.out.println("=================");
			  students student2=new students("Mike", 17, "M",2016, "Java");
				student2.attendLecture();
				student2.attendLab();
				student2.submitAssignment();
				System.out.println("=================");
				
			  students student3=new students("John", 18, "M",2016, "TypeScript");
				student3.attendLecture();
				student3.attendLab();
				student3.submitAssignment();
				System.out.println("=================");
	}

}
