package New;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) throws Exception {

		int count = 0;
		String[] name = { "Puja", "Pusp", "Bhuwan", "Puja", "Pusp" };
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name:");
		String Name = sc.nextLine();

		for (int i = 0; i < name.length; i++) {

			if (name[i].equals(Name)) {

				// System.out.println("Duplicate Element is : "+name[j]);
				count++;

			}
		}

		if (count > 1) {

			System.out.println(Name + " is duplicate.");

		} else if (count == 0) {
			throw new Exception("Name not in the list.");
		} else {

			System.out.println(Name + " is not duplicate.");

		}

	}

}
