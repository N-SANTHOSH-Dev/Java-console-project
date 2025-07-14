// package PasswordGenerator;

import java.util.Random;
public class PassWordGen {
        public static String  Generator(int length){
            String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowercase = "abcdefghijklmnopqrstuvwxyz";
            String digits = "0123456789";
            String specialchar = "!@#$%^&*()-_+=<>?";
            String c = uppercase + lowercase + digits + specialchar;
            Random random = new Random();
            StringBuilder p = new StringBuilder(length);
            for(int i=0;i<length;i++){
                p.append(c.charAt(random.nextInt(c.length())));
            }
            return p.toString();
        }
        public static void main(String[] args) {
            int a = 10;
            String b = Generator(a);
            System.out.println("Generated password=" + b);
        }
}