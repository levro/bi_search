package bin_srch;

public class bin_srch {

	public static void main(String[] args) {

		int data[] = { 1, 10, -5, 6, 7, 11, 60 };
		int numberToFind = 10;
		
		int output = -1;
		for (int i=0; i<data.length; i++){
			if (data[i] == numberToFind){
				output = i;
				break;
			}
		}
		System.out.println(output);
	}
}
