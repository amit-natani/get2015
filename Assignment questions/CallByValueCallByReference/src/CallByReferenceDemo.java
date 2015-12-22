
public class CallByReferenceDemo {

public static void main(String args[]){
		Demo demo = new Demo();
		demo.one = 4;
		System.out.println("Value of number before calling function : "+demo.one);
		increaseNumberByOne(demo);
		System.out.println("Value of number after calling function : "+demo.one);
	}
	
	public static void increaseNumberByOne(Demo demo){
		demo.one = demo.one+1;
		System.out.println("Value of number after increasing : "+demo.one);
	}
}

class Demo {
	int one;
}
