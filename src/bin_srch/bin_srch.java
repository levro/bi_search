package bin_srch;

public class bin_srch {

	public static void main(String[] args) {

		int data[] = { 10 };
		int numberToFind = 10;
		
		int output = -1;
		for (int i=0; i<data.length; i++){
			if (data[i] == numberToFind){
				output = i;
				break;
			}
		}
		System.out.println(output);
		System.out.println("Thank you");
		System.out.println("----------------");
		System.out.println("Yesterday all my troubles seemed so far away");
		System.out.println("Now it looks as though they're here to stay");
	}
}
