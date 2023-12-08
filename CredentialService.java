

import java.util.Random;


public class CredentialService {
   public String generateEmailAddress(Employee employee) {
       return employee.getFirstName().toLowerCase() +
              employee.getLastName().toLowerCase() +
              "@" + employee.getDepartment().toLowerCase() + ".company.com";
   }


   public String generatePassword() {
       String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String smallLetters = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?";


       String allChars = capitalLetters + smallLetters + numbers + specialChars;


       StringBuilder password = new StringBuilder();


       Random random = new Random();
       password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
       password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
       password.append(numbers.charAt(random.nextInt(numbers.length())));
       password.append(specialChars.charAt(random.nextInt(specialChars.length())));


       for (int i = 4; i < 12; i++) {
           password.append(allChars.charAt(random.nextInt(allChars.length())));
       }


       return password.toString();
   }


   public void showCredentials(Employee employee, String password, String emailAddress) {
       System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
       System.out.println("Email Address: " + emailAddress);
       System.out.println("Password: " + password);
   }
}
