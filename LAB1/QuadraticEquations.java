import java.util.Scanner;

class QuadraticEquations
{
	public static void main(String args[])
	{
		double a,b,c,D;
		double r1,r2;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the constants a,b and c of the quadratic equation a(x)^2+b(x)+c=0 : ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		System.out.println();
		System.out.println("Input Quadration Equation : "+a+"(x)^2 + "+b+"(x) + "+c+" = 0");
		System.out.println();

		D = (b*b)-(4*a*c);
		
		if(D>0)
		{
			System.out.println("Roots are real and unequal since Discriminant = "+D);
			r1 = (-b + Math.sqrt(D))/(2*a);
			r2 = (-b - Math.sqrt(D))/(2*a);
			System.out.println();
			System.out.println("Roots of the quadratic equation are "+r1+" and "+r2);	
		}
		else if(D==0)
		{
			System.out.println("Roots are real and equal since Discriminant = "+D);
			r1 = r2 = (-b)/(2*a);
			System.out.println();
			System.out.println("Roots of the quadratic equation are "+r1+" and "+r2);	
		}
		else
		{
			System.out.println();
			System.out.println("Roots are unreal since Discriminant = "+D);
		}		
		
	}
}
