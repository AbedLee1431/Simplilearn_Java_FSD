package project2;
import java.util.*;
import java.util.regex.*;
public class ValidationOfAnEmailID {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<String>();

        for (String value : emails) 

            System.out.println("The Email address you entered -----> " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

            System.out.println("enter the Email id:");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            System.out.println("The Email address you entered -----> " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

}


public static boolean isValidEmail(String email) { 
    
    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex); 
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();


}

}