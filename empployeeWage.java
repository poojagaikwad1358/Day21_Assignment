public class employeeWage {
     public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation Problem");
	//UseCase1 - Check employee present or absent
	int IsFullTime=1;
	double empcheck=Math.floor(Math.random() * 10)%2;
	if ( empcheck == IsFullTime)
		System.out.println("Employee is Present.");
	else
	    	System.out.println("Employee is Absent.");
	}
}
