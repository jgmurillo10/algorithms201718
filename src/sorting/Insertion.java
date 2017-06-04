package sorting;

public class Insertion {
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			for (int j = i;j>0 && less(a[j],a[j-1]); j--) {
				exch(a, j-1, j);
				
			}
			show(a);
		}
		
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	@SuppressWarnings("rawtypes")
	private static void exch(Comparable[]a, int i, int j){
		Comparable t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
	@SuppressWarnings("rawtypes")
	public static boolean isSorted(Comparable[]a){
		for (int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1]))
				return false;
		}
		return true;
	}
	@SuppressWarnings("rawtypes")
	public static void show(Comparable[]a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}
	public static void main(String[] args){
		String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
		show(a);
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
