package Collaction.Genrics.Exercises02;

import java.util.Comparator;


@SuppressWarnings("rawtypes")
public class AgeComparator implements Comparator { 
	@Override
	public int compare(Object o1, Object o2) {
		Students student1 = (Students)o1;
		Students student2 = (Students)o2;
		
		if(student1.getAge() == student2.getAge()) {
			return 0;
		}
		else if(student1.getAge() > student2.getAge()) {
			return 1;
		}
		else 
			return -1;
	}

	}
	