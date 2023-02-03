//Pangon La-or-on
//6409700074

package two;

import java.util.ArrayList;

public class ArrayUtil {
	public static <E> void print(ArrayList<E> arrList){
		for(E dataList: arrList) {
			System.out.println(dataList.toString());
		}
	}
	public static <E> ArrayList<E> concat(E[] arr1, E[] arr2){
		ArrayList<E> list = new ArrayList<E>();
		for(E dataArr1: arr1) {
			list.add(dataArr1);
		}
		for(E dataArr2: arr2) {
			list.add(dataArr2);
		}
		return list;
	}
	public static <E extends Comparable<E>> E findMax(E[] arr){
		E max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].compareTo(max) > 0) {
				max = arr[i];
			}
		}
		return max;
	}
}
