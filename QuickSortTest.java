package proj2;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

	 static Points points = new Points();
	 static List<Points> pointslist = new ArrayList<Points>();
	   

	    public static List<Points> quickSort(List<Points> points1, int begin, int end) {
	        if (begin >= end) {
	        		return null;
	        }           
           int i = begin;
           int j = end;
           double key = points1.get(begin).getY();
	            while (i < j) {
	                while (i < j && points1.get(j).getY() >= key) {
	                    j--;
	                }
	                
	                while (i < j && points1.get(i).getY() <= key) {
	                    i++;
	                }
	                swap(points1,i,j);
	            }
	            swap(points1, begin, i);
	            //key = points1.get(i).getY();
	            quickSort( points1, begin, j - 1);
	            quickSort( points1, j + 1, end);
	        
	        return points1;
	    }
	    private static void swap(List<Points>list, int i, int j) {
	    	Points temp = list.get(i);
	    	list.set(i, list.get(j));
	    	list.set(j,temp);
	    }
	    public static void main(String[] args) {         

	    	pointslist = points.randomPoints();
	    	
	    	List<Points> pointsY = new ArrayList<Points>();
	    	long starttime = System.nanoTime();
	    	pointsY = quickSort(pointslist, 0, pointslist.size()-1);
	    	
	        long endtime = System.nanoTime();
			System.out.println(endtime - starttime + "ns");



	    } 


}
