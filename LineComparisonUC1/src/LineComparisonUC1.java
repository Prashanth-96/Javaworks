public class LineComparisonUC1{
	public static void main(String []args) {
		float x1,y1,x2,y2;
		float len;
		x1= (int) (Math.random()*100);
		y1=	(int) (Math.random()*100);
		x2=(int) (Math.random()*100);
		y2=(int) (Math.random()*100);
		len=(int)Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y2-y1), 2)));
		System.out.println("The length is "+len);
	}
}