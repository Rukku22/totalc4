package project;

public class Switch {

	public static void main(String[] args) {
		int i=12,j=3,res;
		String sym="+";
		switch(sym) {
		case "+":res=i+j;
		System.out.println(res);
		       break;
		case "-":res=i-j;
		System.out.println(res);
               break;
               default:	System.out.println("invalid");

		}

	}

}
