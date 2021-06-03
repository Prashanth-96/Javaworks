public class LineComparisonUC3 {
	public static void main(String []args) {
		float x1a,y1a,x2a,y2a,x1b,y1b,x2b,y2b;
		float len_a,len_b;
		x1a= (int) (Math.random()*100);
		y1a=(int) (Math.random()*100);
		x2a=(int) (Math.random()*100);
		y2a=(int) (Math.random()*100);
		x1b= (int) (Math.random()*100);
		y1b=(int) (Math.random()*100);
		x2b=(int) (Math.random()*100);
		y2b=(int) (Math.random()*100);
		len_a=(int)Math.sqrt(((x2a-x1a)*(x2a-x1a))+((y2a-y1a)*(y2a-y1a)));
		len_b=(int)Math.sqrt(((x2b-x1b)*(x2b-x1b))+((y2b-y1b)*(y2b-y1b)));
		if (Float.compare(len_a,len_b)==0) {
			System.out.println("The two lines are equal");
			System.out.printf("\nThe coordinates of 1st line is (%.2f,%.2f)\nThe coordinate of second line is (%.2f,%.2f)",x1a,y1a,x2b,y2b);
		}
		else if (Float.compare(len_a, len_b)<0) {
			System.out.printf("Line 1 : %.2f ,is shorter than line 2:  %.2f",len_a,len_b);
			System.out.printf("\nThe coordinates of 1st line is (%.2f,%.2f)\nThe coordinate of second line is (%.2f,%.2f)",x1a,y1a,x2b,y2b);
		}
		else {
			System.out.printf("Line 1 :%.2f is greater than line 2  :%.2f",len_a,len_b);
			System.out.printf("\nThe coordinates of 1st line is (%.2f,%.2f)\nThe coordinate of second line is (%.2f,%.2f)",x1a,y1a,x2b,y2b);
			
			
				
		}
}
}