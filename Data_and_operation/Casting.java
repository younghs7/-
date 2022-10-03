
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String (Casting -> 검색해라)
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass()); 
		
		char k = 66;
		System.out.println(k);
		
		k = 0x44;
		System.out.println(k);
		
		int year = 123;
		
		switch(1) 
		{
		case 1900: System.out.println(1900);
		case 1910: System.out.println(1910);
		case 1920: System.out.println(1920);
		case 1930: System.out.println(1930);
		default : System.out.println("defalut");
		break;
		case 1940: System.out.println(1940);
		
		
		
		}

	}

}
