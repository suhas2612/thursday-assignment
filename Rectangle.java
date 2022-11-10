package rt;



	
		public class Rectangle {
			private double length;
			private double breadth;
			Rectangle()
			{
				this.length=length;
				this.breadth = breadth;
				//System.out.println("Length of rectangle is " + length + " "  + "Breadth of rectangle is " + breadth);
			}
			public double getLength() {
				return length;
			}
			public void setLength(double length) {
				this.length = length;
			}
			public double getBreadth() {
				return breadth;
			}
			public void setBreadth(double breadth) {
				this.breadth = breadth;
			}
			void area(double length, double breadth)
			{
				/*Scanner sc = new Scanner(System.in);
				System.out.println("Enter the length of rectangle");
				length = sc.nextDouble();
				System.out.println("Enter the breadth of rectangle");
				breadth = sc.nextDouble();*/
				double area = length*breadth;
				System.out.println("Area of rectangle is " + area);
				
			}
			/*void displayArea()
			{
				double area = (length*breadth);
				System.out.println("area of rectngle is " + area);
			}*/
			void perimetre(double length, double breadth)
			{
				/*Scanner sc = new Scanner(System.in);
				System.out.println("Enter the length of rectangle");
				length = sc.nextDouble();
				System.out.println("Enter the breadth of rectangle");
				breadth = sc.nextDouble();*/
				double perimeter = 2*(length+breadth);
				System.out.println("Area of rectangle is " + perimeter);
				
			}
			/*void displayPerimeter()
			{
				double perimeter =2*(length*breadth);
				System.out.println("perimeter of rectngle is " +perimeter);
			}*/
		}
		 class Square extends Rectangle{

			 private double side;

			public double getSide() {
				return side;
			}

			public void setSide(double side) {
				this.side = side;
			}
			Square()
			{
				super();
				this.side = side;
			}
			void areaOfSquare(double side)
			{
				double area = side * side;
				System.out.println("Area of square is" +  area);
			}
			void perimeterOfSquare(double side)
			{
				double perimeter = 4*side;
				System.out.println("Perimeter of square is" +  perimeter);

	}

}
