// exercise 1.



package Collaction.Genrics.Exercises;
import java.util.*;


public class ex01 {
	public static void main(String[] args) {
			LinkedList<String> languages =new LinkedList<String>();  
			
			languages.add("C");  
			languages.add("C++");  
			languages.add("Java");  
			languages.add("Kotlin ");  
			languages.add("Python "); 
			languages.add("Perl "); 
			languages.add("Ruby"); 
			
			Iterator<String> itr=languages.iterator(); 
			  System.out.println("***********************");
			  while(itr.hasNext()){  
				  System.out.println(itr.next());  
			  }
			  System.out.println(" ");
			  languages.remove(5) ;
			  Iterator<String> itr1=languages.iterator(); 
			  System.out.println("*************************");
			  while(itr1.hasNext()){  
				  System.out.println(itr1.next()); 
			  }
			  System.out.println(" ");
			  languages.remove("Kotlin ") ;
			  Iterator<String> itr2=languages.iterator(); 
			  System.out.println("*************************");
			  while(itr2.hasNext()){  
				  System.out.println(itr2.next());  
			  }
			  LinkedList<String> Scriptinglanguages =new LinkedList<String>();  
			  
			  Scriptinglanguages.add("Python "); 	
			  Scriptinglanguages.add("Ruby"); 	
			  Scriptinglanguages.add("Perl "); 	
			  
			 
			  Iterator<String> itr3=Scriptinglanguages.iterator(); 
			  System.out.println("******************************************");
			  while(itr3.hasNext()){  
				  System.out.println(itr3.next());  
			  }
			  System.out.println(" ");
			   Scriptinglanguages.removeAll(Scriptinglanguages) ;
			  Iterator<String> itr4=Scriptinglanguages.iterator(); 
			  System.out.println("*******************************************");
			  while(itr4.hasNext()){  
				  System.out.println(itr4.next());  
				  
			  }
			  System.out.println(" ");
			  languages.clear(); ;
			  Iterator<String> itr5=languages.iterator(); 
			  System.out.println("********************************************");
			  while(itr5.hasNext()){  
				  System.out.println(itr5.next());  
			  }
		}
	}





