package monthlySalary;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String [] namn = {"Ram", "Joseph", "Peter", "Mari", "Andreas"};

		int [] telnr = {121212,131313,141414,151515,161616};

		String person;

		while(true) {

		System.out.println("Vems nr vill du veta?");

		person = input.nextLine();

		for(int i=0;i<namn.length;i++){

			if(person.equals(namn[i])){

				System.out.println(telnr[i]);

			 }

		     }

		}

	}

}
