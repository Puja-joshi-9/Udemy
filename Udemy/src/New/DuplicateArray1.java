package New;

import java.util.Scanner;
import java.util.Arrays;

public class DuplicateArray1 {

	public static void main(String[] args) {

		int duplicate_entry = 0;
		int duplicacy_array_list = 0;
		Scanner sc = new Scanner(System.in);

		String[] st = { "puja", "pusp", "bhuwan", "jackobian", "puja" };
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i] == st[j])
					duplicacy_array_list++;
			}
		}

		if (duplicacy_array_list > 0)
			System.out.println("duplicate in array list");
		else
			System.out.println("There are unique Elements in array list");

		String proceed = "yes";
		while (proceed.equals("yes")) {

			System.out.println(" enter the string you want to check in array");
			String s1 = sc.nextLine();
			for (int i = 0; i < st.length; i++) {
				if (s1.equals(st[i]))
					duplicate_entry++;
				System.out.println(st[i]);
			}
			if (duplicate_entry > 0)
				System.out.println("Entry Match with array list=" + duplicate_entry);
			else
				System.out.println("Entry do not match with array list");
			System.out.println("If you want to check again press yes");

			proceed = sc.nextLine();
			duplicate_entry = 0;
		}

	}

}
