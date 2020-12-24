import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Operations{
	
	ArrayList<Person> person = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in); 
	
	public void addInformation() {                                  //Add users Method
		
		Person personInfo = new Person();
		
		System.out.println("Enter First-Name -");
		personInfo.setFirstName(scan.nextLine());
		
		System.out.println("Enter Last-Name -");
		personInfo.setLastName(scan.nextLine());
		
		System.out.println("Enter Address -");
		personInfo.setAddress(scan.nextLine());
		
		System.out.println("Enter State -");
		personInfo.setState(scan.nextLine());
		
		System.out.println("Enter City -");
		personInfo.setCity(scan.nextLine());
		
		System.out.println("Enter Zip-Code -");
		personInfo.setZipCode(scan.nextLine());
		
		System.out.println("Enter Phone-Number -");
		personInfo.setPhoneNumber(scan.nextLine());
		
	
		person.add(personInfo);
		
		System.out.println(" ");
		System.out.println("--Information Stored--");
		
	}
	
	public void viewInformation() {                                         //Get users Method
		
		for(int i = 0 ; i < person.size() ; i++) {
			System.out.println(" ");
			System.out.println(person.get(i));
			System.out.println(" ");
		}
		
	}
	
	public void searchInformationByCity() {                                       //Search by City Method
		
			System.out.println("*Enter City to search records-");
			String city = scan.nextLine();
			
			if(person.isEmpty()) {
				System.out.println("No such record found.");
			}
			
			for(int i = 0 ; i < person.size() ; i++) {
				if(person.get(i).getCity().equals(city)) {
					
					System.out.println(" ");
					System.out.println(person.get(i));		
				}
			}				
	}
	

	
	
}
