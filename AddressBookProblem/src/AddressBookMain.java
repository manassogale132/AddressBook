import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		Operations operations = new Operations();
		
		System.out.println("------------------------------------------------");
		System.out.println("---Address Book Program---");
		System.out.println("------------------------------------------------");
		System.out.println(" ");
		System.out.println("1. Add User(s) Information .");
		System.out.println("2. View User(s) Information .");
		System.out.println("3. Search Information by City .");
		System.out.println("4. Search Information by State .");
		System.out.println("5. Delete Information by First-Name .");
		System.out.println(" ");
		System.out.println("------------------------------------------------");
	
		Scanner scan = new Scanner(System.in);
		
		int option = 0;
		do {
		int option1 = scan.nextInt();
		
		switch(option1) {
		
		case 1:
			System.out.println("---");
			operations.addInformation();
			System.out.println("---");
			break;
			
		case 2:
			System.out.println("---");
			operations.viewInformation();
			System.out.println("---");
			break;
			
		case 3:
			System.out.println("---");
			operations.searchInformationByCity();
			System.out.println("---");
			break;
			
		case 4:
			System.out.println("---");
			operations.searchInformationByState();
			System.out.println("---");
			break;
			
		case 5:
			System.out.println("---");
			operations.deleteInformationByFirstName();
			System.out.println("---");
			break;

			
	
		}while(option != 5);

	}

}
