package passwordgen.src;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static String GenerateRandomPassword(int passwordLength){
        //  Characters for the password to include at random
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz123456789012345678901234567890!!!!!@@#####$$$%^&*(()())_+-/.,<>?;:[]{}|~";
        //  The generated password
        String generatedPassword = "";
        Random random = new Random();
        while (generatedPassword.length() < passwordLength) {
            int index = (int)(random.nextFloat() * characters.length());
            generatedPassword += characters.charAt(index);
        }
        return generatedPassword;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("How long do you want the generated password to be? (Recommended: greater than 8) ");
        int passwordLength = input.nextInt();
        String password = GenerateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + password);
        input.close();
    }
}
