package Collaction.Genrics.Exercises;

import java.util.ArrayList;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				 
				    ArrayList<Integer> sortedList = new ArrayList<Integer>();
				    //create arraylist for sorting list
				    ArrayList<Integer> orignalList = new ArrayList<Integer>();
				    //create arraylist for original list 
				  
				    orignalList.add(3);
				    orignalList.add(8);
				    orignalList.add(92);
				    orignalList.add(4);
				    orignalList.add(2);
				    orignalList.add(17);
				    orignalList.add(9);
				  
				    while(orignalList.size() > 0){
				    		orignalList = minToFront(orignalList);
				    		//minToFront() will call first 
				    		sortedList.add(orignalList.get(0));
				    		orignalList.remove(0);
				    	}
				    
				    	System.out.println(sortedList);
			 }
			 
			 
			 public static ArrayList<Integer> minToFront(ArrayList<Integer> list) {
				    int min = list.get(0);
				    int minInd = 0;
				    for (int i = 0; i < list.size(); i++) {

				        if (list.get(i) < min) {
				            minInd = i;
				            min = list.get(i);
				        }

				    }
				    int temp = list.get(0);
				    list.set(0, min);
				    list.set(minInd,temp);

				    return list;
				  }
				
               }
