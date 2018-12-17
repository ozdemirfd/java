
public class UnaryOperators {

	public static void main(String[] args) {
	int i1=+10;
	int i2=10;
	int i3=-100;
	int i4=-(i1+i2);
	 System.out.println(i1+"|"+i2+"|"+i3+"|"+i4);
	 
	 int i=10;
	 int j=5;
	 i++;
	 --j;
	 System.out.println(i+"|"+j);
	 
	 int res=i++ + --j;
	 System.out.println(res+"|"+i+"|"+j);
	 
//		int i=10;  
//		int j=5;
//		i++;   ->11
//		--j;   -> 4
//		System.out.println(i+"|"+j);
//		   
//		int res = i++ + --j;
//                  (11)+ (3)
//		System.out.println(res+"|"+i+"|"+j);
//                           14   |  12 |  3
	 
	 
	 
	 double d1=20.0;
	 double d2=80.0;
	 double result=(d1+d2)*25;
	 double result1=result%40;
	 boolean result2=result1<=20;
	System.out.println(result2);
	 
	 

	}

}
