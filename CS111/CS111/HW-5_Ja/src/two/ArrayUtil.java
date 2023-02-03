//Kanyanat Det-in
//6409618011
package two;

import java.util.ArrayList;

public class ArrayUtil {
	public static <E> void print(ArrayList<E> list){
		for(E data: list) {
			System.out.println(data.toString());
		}
	}
	public static <E> ArrayList<E> concat(E[] list1, E[] list2){
		ArrayList<E> list=new ArrayList<E>();
		int i;
		for(i=0; i<list1.length; list.add(list1[i]), i++);
		for(; i<list1.length+list2.length; list.add(list2[i]), i++);
		return list;
	}
	public static <E extends Comparable<E>> E findMax(E[] list){
		E max=list[0];
		for(int i=0; i<list.length; i++) {
			if(list[i].compareTo(max)>0)
				max=list[i];
		}
		return max;
	}
	
}
