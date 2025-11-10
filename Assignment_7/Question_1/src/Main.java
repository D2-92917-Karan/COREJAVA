
public class Main {
public static  <T extends Comparable> T findMin(T[] arr) {
	T min =arr[0];
	for(T n: arr) {
		if(n.compareTo(min)<0) {
			min=n;
		}
	}
	return min;
}
public static void main(String[] args) {
	Integer[] intArr = {5, 2, 8, 1, 9};
    Double[] doubleArr = {3.5, 7.2, 1.8, 4.0};
    
    System.out.println("Min"+findMin(intArr));
    System.out.println("Min"+findMin(doubleArr));
}
}
