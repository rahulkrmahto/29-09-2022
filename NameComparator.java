package Collaction.Genrics.Exercises02;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Students student1 = (Students)o1;
		Students student2 = (Students)o2;
		return student1.getName().compareTo(student2.getName());
	}

}
