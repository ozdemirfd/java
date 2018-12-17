
public class students {
	
	public String name;
	public int age;
	public String gender;
	public int year;
	public String course;
	public  static String universty="Cybertek";
	
	public students(String name,int age,String gender, int year,String course) {
		
		this.name=name;
		this.age=age;
	    this.gender=gender;
	    this.year=year;
	    this.course=course;
	    //this.universty=universty;   
	
	}
	
	public void attendLecture() {
		System.out.println(name+" attended lecture at " + universty);
	}
	public void submitAssignment() {
		System.out.println(name+" submitted assignment at "+ universty);
	}
	public void attendLab() {
		System.out.println(name+" attended lab at " + universty);
	}
	
	
}
