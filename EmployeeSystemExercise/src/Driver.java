import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
	
	public static void printEmployeeInformation(ArrayList<Employee> employees){
		for(Employee i : employees) {
			System.out.println( i + "\n");
		}
	}

	public static void main(String[] args) {
		HourlyEmployee h1 = new HourlyEmployee("Alex", "Smith", "alexS@mail.com", LocalDate.of(1990, 2, 23), "000-000-0000", 10, 20);
		HourlyEmployee h2 = new HourlyEmployee("John", "Lenon", "JohnL@mail.com", LocalDate.of(1982, 4, 29), "000-000-1111", 10, 20);
		SalesEmployee s1 = new SalesEmployee("Michael", "Jordan", "MichaelJ@mail.com", LocalDate.of(2000, 12, 25), "000-000-2222", 30, 4000);
		SalesEmployee s2 = new SalesEmployee("Katy", "perry", "KatyP@mail.com", LocalDate.of(1959, 4, 3), "000-000-2222", 20, 5000);
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(h1);
		employees.add(h2);
		employees.add(s1);
		employees.add(s2);
		
		printEmployeeInformation(employees);
		
	}
	
	

}
