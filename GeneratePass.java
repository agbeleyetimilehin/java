import java.util.Scanner;

public class GeneratePass {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        String firstname;
        System.out.println("enter your firstname");
        firstname = pass.next();
        String middlename;
        System.out.println("enter your middlename:");
        middlename = pass.next();
        String mat_number;
        System.out.println("enter your matric number:");
        mat_number = pass.next();
        String lastname;
        System.out.println("enter your lastname:");
        lastname = pass.next();

        System.out.println("The password is:" + firstname.charAt(2) + middlename.charAt(0) + mat_number.charAt(3) + lastname.charAt(3));
    }

}