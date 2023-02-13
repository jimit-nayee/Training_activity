import java.util.Scanner;

public class DemoException {
	public static void main(String[] args) throws markLimitExcedException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int mark = s.nextInt();
		if(mark>=101) {
			throw new markLimitExcedException();
		}
		else {
			System.out.println("thanks for entering "+mark);
		}
//		try {
//		int a =20/4;
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("finally used here");
//		}
//		System.out.println("done");
//		System.out.println("done");
	}
}