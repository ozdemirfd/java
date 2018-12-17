
public class assignment_21_1 {
	
	public String str;
	public double val;
	public void print() {
		System.out.println("str: "+ str+" val : "+val);
		
	
	}
	
	 public	assignment_21_1() {
		 str=" JAVA";
		 val=0.0;
	 }
	 
	 public assignment_21_1(String str,double val) {
		 this.str=str;
		 this.val=val;
	 }
	 public assignment_21_1(String str) {
		 this();
		 this.str=str;
	 }
	 public assignment_21_1(double val) {
		 this();
		 this.val=val;
	 }

}
