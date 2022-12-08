package Collaction.Genrics.Exercises02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentsDetail {

@SuppressWarnings("unchecked")
public static void main(String[] args) 
{
    ArrayList<Students> students=new ArrayList<>();
	
	students.add(new Students("AF0216223","Aryan Raj",21,"AndraPradhesh"));  
	students.add(new Students("AF0216224","Bivor Kumar",22,"AndraPradhesh"));  
	students.add(new Students("AF0216227","SUSHMITA KUMARI",23,"Madhya Pradesh"));
	students.add(new Students("AF0216231","Ragiv Zafar",24,"Maharashtra"));
	students.add(new Students("AF0216232","RAHUL MAHTO",25	,"Orissa"));
	students.add(new Students("AF0216234","NainsiKumari",19,"Gujarath"));
	students.add(new Students("AF0216236","MD ALI"	,26,"Madhya Pradesh"));
	students.add(new Students("AF0216238","ABHISHEK KUMAR",22,"AndraPradhesh"));
	students.add(new Students("AF0216240","AFROZ ANSARI",21,"Maharashtra"));
	students.add(new Students("AF0216259","RITIK RAJ",20,"Orissa"));
	students.add(new Students("AF0216263","Anant Kumar",25,"AndraPradhesh"));
	students.add(new Students("AF0216305","BABU KUMAR",24,"Gujarath"));
    students.add(new Students(	"AF0216307","NIKITA KUMARI",23,	"Madhya Pradesh"));
    students.add(new Students("AF0216353","PRANAV PANDEY",22,"Orissa"));
    students.add(new Students(	"AF0216964","Radheshyam Kumar",21,"Maharashtra"));
	students.add(new Students("AF0216973","Ankur Utpstudents",19,"Gujarath"));
	students.add(new Students("AF0217607","Banty Mishra",18,"Madhya Pradesh"));
    students.add(new Students("AF0217615","RIYA KUMARI",20,"Madhya Pradesh"));
	students.add(new Students("AF0217791","Priyadarshani Kumari",21,"Maharashtra"));
	students.add(new Students("AF0223373","Chanchstudents Thakur",22,"Orissa"));
	students.add(new Students("AF0221549","SATENDRA KUMAR",23,"Maharashtra"));
	students.add(new Students("AF0216212","Pappi Verma	",24," "));	
	students.add(new Students("AF0216244","Ramkrishna Kushwah",25,	"AndraPradhesh"));
	students.add(new Students("AF0216245","YogitaTamoliya",26,"Orissa"));
	
	System.out.println(" ");
	System.out.println("************************************************************************");
	System.out.println("/////////////////////////STUDENT'S DETAILS/////////////////");
	System.out.println("************************************************************************");
	
	for(Students stud:students){  
		System.out.println(stud.getCode()+" ,"+stud.getName()+" ,"+stud.getAge()+" ,"+stud.getState());  
	}  
	System.out.println(" ");
	
	System.out.println("************************************************************************");
	
 	// those  students has age more than 20
	System.out.println("______________Students age greater than 20_____________________");
	System.out.println("************************************************************************");
	
    
	for(Students student: students) {
		if(student.getAge()>20)
		System.out.println(student);
		
        
	}
	System.out.println(" ");
	System.out.println("************************************************************************");
	
    //Display the students from Andhra Pradesh
	System.out.println("_______________Students from Andra Pradhesh____________________");
	System.out.println("************************************************************************");
	
    
	for(Students student : students)
	{
		if(student.getState()=="AndraPradhesh")
			System.out.println(student);
	}
	
     //Sort students by their age.
	

	System.out.println(" ");
	
    
	System.out.println("************************************************************************");
	
    
    System.out.println("____________________Sorting by age__________________________");  
	
    System.out.println("************************************************************************");
	
    
	Collections.sort(students,new AgeComparator());  
	
	Iterator<Students> itr2=students.iterator();  
	
	while(itr2.hasNext()){  
		Students programmer=(Students)itr2.next();  
		System.out.println(programmer);  
	} 
	
	//Sort students by their state.
	
	System.out.println(" ");
	System.out.println("************************************************************************");
	
    
    System.out.println("____________________Sorting by state _________________________");  
	
    System.out.println("************************************************************************");
	
    
	Collections.sort(students,new StateComparator());  
	
	Iterator<Students> itr3=students.iterator();  
	
	while(itr3.hasNext()){  
		Students programmer=(Students)itr3.next();  
		System.out.println(programmer);  
	} 
	
	//Sort students by their name.
	
	System.out.println(" ");
	System.out.println("************************************************************************");
	
    
    System.out.println("____________________Sorting by student's name _________________________");  
	
    System.out.println("************************************************************************");
	
    
	Collections.sort(students,new NameComparator());  
	
	Iterator<Students> itr4=students.iterator();  
	
	while(itr4.hasNext()){  
		Students programmer=(Students)itr4.next();  
		System.out.println(programmer);  
	} 
  }

}
