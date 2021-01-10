import java.util.*;
import java.lang.*;

class gen<A, B, C>{
	A ob1;
	B ob2;
	C ob3;
	gen(A x, B y, C z){
		ob1 = x;
		ob2 = y;
		ob3 = z;
	}
	
	A getob1() {
		return ob1;
	}
	B getob2() {
		return ob2;
	}
	C getob3() {
		return ob3;
	}

	void display(){
		System.out.println("Ob1:" + getob1());
		System.out.println("Ob2:" + getob2());
		System.out.println("Ob3:" + getob3());
		
	}
	B join() {
		if (ob1 instanceof Integer && ob2 instanceof Integer && ob3 instanceof Integer) {
			int i1 = (Integer)getob1();
			int i2 = (Integer)getob2();
			int i3 = (Integer)getob3();
			return (B) new Integer(i1 + i2 + i3);
		}
		else if (ob1 instanceof Double && ob2 instanceof Double && ob3 instanceof Double) {
			double d1 = (Double)getob1();
			double d2 = (Double)getob2();
			double d3 = (Double)getob3();
			return (B) new Double(d1 * d2 * d3);
		}
		else if (ob1 instanceof String && ob2 instanceof String && ob3 instanceof String) {
			String s1 = (String)getob1();
			String s2 = (String)getob2();
			String s3 = (String)getob3();
			return (B) new String(s1 + s2 + s3);
		}
		else {
			return (B) new String("ERROR! ob1 and ob2 Type Mismatch...");
		}
	}
}

class labtest2_Prog1 {
	public static void main(String[] args) {

		Generics<Integer, Integer, Integer> iObj = new Generics<Integer, Integer, Integer>(6,2,4);
		iObj.display();
		System.out.println("Addition::> " + iObj.join());

		Generics<Double, Double, Double> dObj = new Generics<Double, Double, Double>(3.86,4.25,1.37);
		dObj.display();
		System.out.println("Multiplication::> " + dObj.join());

		Generics<String, String, String> sObj = new Generics<String, String, String>("Hi,", "My name is Aditya.", "What is your name? ");
		sObj.display();
		System.out.println("Concatenation: " + sObj.join());

	}
}
