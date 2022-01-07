import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public void printOption() {
		System.out.println("1. Insert New Vhicle");
		System.out.println("2. Use Vhicle Services");
		System.out.println("3. Delete Vhicle");
		System.out.println("4. Exit");
		System.out.println(">>");
	}
	
	public boolean licenseValidation(String license) {
		Integer point = 0;
		String [] arrOfStr = license.split("-", 3);
		
		if(arrOfStr.length == 3) {
			if(arrOfStr[0].matches("[a-zA-Z]{1,2}?")) {
				point++;
			}
			
			if(arrOfStr[1].matches("[0-9]{1,4}?")) {
				point++;
			}
			
			if(arrOfStr[2].matches("[a-zA-Z]{1,3}?")) {
				point++;
			}
		}
		
		
		if(point == 3) return true;
		return false;
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		Integer choose;
		do {
			printOption();
			choose = scan.nextInt();
			scan.nextLine();
			
			switch (choose) {
			case 1: {
				String license;
				do {
					System.out.print("Input vehicle license [X-Y-Z format]: ");
					license = scan.nextLine();
					licenseValidation(license);
				} while (licenseValidation(license) == false);
				
				
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
			
		} while (choose != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
