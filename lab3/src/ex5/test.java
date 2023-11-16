package ex5;

public class test {

	public static void main(String[] args) {
		Chocolate [] arr = new Chocolate[5];
		for (int i = 1; i<6;i++) {
			arr[i-1] = new Chocolate("a", 6-i);
		}
		for (int i = 0; i<5;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		Sort.bubble(arr);
		for (int i = 0; i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 1; i<6;i++) {
			arr[i-1] = new Chocolate("a", 6-i);
		}
		for (int i = 0; i<5;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		Sort.qsort(arr, 0, arr.length-1);		
		for (int i = 0; i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		Sort.qsort(arr, 0, arr.length-1);


	}

}
