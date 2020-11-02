import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate startDate;
	private String phoneNumber;
	
	//constructor
	
	public Employee(String firstName,String lastName, String email, LocalDate startDate, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartDate(startDate);
		setPhoneNumber(phoneNumber);
	}
	 
	
	//getter
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	//setter
	
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}

	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "Unknown";
		}
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
		if (Objects.nonNull(startDate)) {
			this.startDate = startDate;
		} else {
			this.startDate = LocalDate.now();
		}
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//calculateIncome
	public abstract double calculateIncome();
	
	@Override
	public String toString() {
		return "Employee Name: " + firstName + " " + lastName +
			   "\nEmployee Phone Number: " + phoneNumber +
			   "\nEmployee Email: " + email +
			   "\nEmployee Start of Day: " + startDate;
			   
	}
	
	

}
