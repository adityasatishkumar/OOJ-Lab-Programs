import java.util.Scanner;
class Student{
    Scanner ss= new Scanner(System.in);
	String USN;
    String Name;
    int credits[]= new int[5];
    double marks[]= new double[5];
    int points[]= new int[5];
    double SGPA;
    int totalCredits= 0;

    void getDetails(){
        System.out.println("Enter the Student USN: ");
        USN= ss.nextLine();
        System.out.println("Enter the name of the Student: ");
        Name= ss.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Enter the amount of Credits for Subject " + (i+1) + ": ");
            credits[i]= ss.nextInt();
            totalCredits+= credits[i];
            System.out.println("Enter the Marks obtained by the student for Subject " + (i+1) + " out of 100: ");
            marks[i]= ss.nextDouble(); 
        }
    }

    void printDetails(){
        
		System.out.println("Student USN: " + USN);
        System.out.println("Student Name: " + Name);
        for(int i=0;i<5;i++){
        
			System.out.println("Subject " + (i+1) + " :       Credits: " + credits[i] + "    --> Marks: " + marks[i]);
        
		}
        
		System.out.println("SGPA of " + Name + " is: " + (double)(SGPA/totalCredits));
    }

    void sumSGPA(){
        
        
        for(int i=0;i<5;i++){
			
			if(marks[i] >= 91){
				
                points[i] = 10;
            
			}
			else if(marks[i] >= 81){
				
				points[i] = 9;
            
			}
			else if(marks[i] >= 71){
            
				points[i] = 8;
            
			}
			else if(marks[i] >= 61){
				
				points[i] = 7;
            
			}
			else if(marks[i] >= 51){
				
				points[i] = 5;
            
			}
			else if(marks[i] >= 41){
					
				points[i] = 4;
            
			}
			else{
            
				points[i] = 0;
	
            }
            
            SGPA += (points[i]*credits[i]);
        }
    }
}

public class LAB2 {
    public static void main(String args[]){
        Student s1= new Student();
        s1.getDetails();
        s1.sumSGPA();
        s1.printDetails();
        
    }
}