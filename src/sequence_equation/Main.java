package sequence_equation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int input = scan.nextInt();
		scan.nextLine();
		String sequence = scan.nextLine();
		
		String[] array_sequence = sequence.split(" ");
		Vector<String> vector_sequence = new Vector<String>();
		vector_sequence.addAll(Arrays.asList(array_sequence));
		
		for (int i = 1; i <= vector_sequence.size(); i++) {
			int first_equation = vector_sequence.indexOf(Integer.toString(i)) + 1;
			int second_equation = vector_sequence.indexOf(Integer.toString(first_equation)) + 1;
			System.out.println(second_equation);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
