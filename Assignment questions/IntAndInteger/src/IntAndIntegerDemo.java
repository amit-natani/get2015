import java.util.ArrayList;
import java.util.List;

public class IntAndIntegerDemo {
	
	public static void main(String args[]){
		int number1 = 99;
		int number2 = '\0';
//		int number3 = null;  // It gives error, as primitive typr cannot contain null
		String s = "67";

		Integer integerObject1 = new Integer(number1); // wrapper for primitive type int
		Integer integerObject2 = new Integer(number2);
		Integer integerObject3 = null;
		Integer integerObject4 = Integer.parseInt(s);

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(integerObject1);
		numberList.add(integerObject2);
		numberList.add(integerObject4);

		//		numberList.add(integerObject3);   gives null pointer exception

		System.out.println("null object is : "+integerObject3);

		System.out.println("number2 is : "+ number2);

		System.out.println("Given list is :");
		for(int num : numberList)
			System.out.println(num);

		int n = integerObject4.intValue();
		System.out.println("Number is : "+n);

	}

}
