import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.print("Enter First Name: ");
       String firstName = scanner.nextLine();


       System.out.print("Enter Last Name: ");
       String lastName = scanner.nextLine();


       String department="";
       System.out.print("\nPlease enter the department from the following:\n1 Technical \n2 Admin\n3  Human Resource \n4. Legal \nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            department="technical";
        } else if (depChoice == 2) {
            department="admin";
        } else if (depChoice == 3) {
            department="humanresource";
        } else if(depChoice==4) {
            department="legal";
        }


       Employee newEmployee = new Employee(firstName, lastName, department);


       CredentialService credentialService = new CredentialService();


       String emailAddress = credentialService.generateEmailAddress(newEmployee);
       String password = credentialService.generatePassword();


       System.out.println("Dear "+ firstName +" your generated credentials are as follows :");
       credentialService.showCredentials(newEmployee, password, emailAddress);


       scanner.close();
   }
}
