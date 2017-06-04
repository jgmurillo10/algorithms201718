package sorting;

public class Selection {
	public static void sort(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(less(a[j],a[min])){
					min=j;
				}
			}
			exch(a, i, min);
		}
		
	}
	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[]a, int i, int j){
		Comparable t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static boolean isSorted(Comparable[]a){
		for (int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1]))
				return false;
		}
		return true;
	}
	public static void show(Comparable[]a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}
	public static void main(String[] args){
		Integer[] a = {2,1,2,34,5,6,4,2};
		show(a);
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
