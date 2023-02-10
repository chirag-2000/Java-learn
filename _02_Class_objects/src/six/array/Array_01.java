package six.array;

public class Array_01 {

	public static void main(String[] args) {
		int[] myAarray = new int[3];
		myAarray[0] = 10;
		myAarray[1] = 20;
		myAarray[2] = 30;
		
		System.out.println(myAarray[1]);
		System.out.println("len = " + myAarray.length);
		for (int ele : myAarray) {
			System.out.println(ele);
		}
		
		int[] myArr = {22,4,51,35,49};
		for (int i : myArr) {
			System.out.println(i);
		}
		
	}

}
