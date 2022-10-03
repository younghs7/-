
public class AuthApp {

	public static void main(String[] args) {
		
		System.out.println("id Input " + args[0]);
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1112";
		String inputPass = args[1];
		
		
		System.out.println("pass input: " +args[1]);
		
//		if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputId.equals(pass)) {
//			System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password");
//			}
//				
//		} else {
//			System.out.println("Who are you?");
//		}
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
			} else {
			System.out.println("Who are you?");
		}
		

	}

}

