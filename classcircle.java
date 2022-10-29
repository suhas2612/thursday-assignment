package cc;

public class classcircle {


	private float radius,center;
	 static  int count=0; 
	 
	 
	 classcircle(){
		 
		 System.out.println("constructor to initialize variables");
	 }
	 
	 classcircle(float radius,float center){
		 
		 this.radius = radius;
		 this.center = center;
		 count++;
		 
		 
	 }
	 

	public static void main(String[] args) {
		classcircle s1 = new classcircle(22.5f,25.6f);
		classcircle s2 = new classcircle(22.55f,25.86f);
		System.out.println("circle 1st center:"+ s1.center+"Radius"+" "+s1.radius);
		System.out.println("circle 2nd center:"+ s2.center+"Radius"+" "+s2.radius);
		System.out.println("no.of instance of circle is:"+classcircle.count);
		
	}

}
		

	


