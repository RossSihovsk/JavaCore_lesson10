package Task3;

import java.util.Scanner;


public class HowMany {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ведіть стрічку роставляючи пробіл між словами");
        String input = sc.nextLine();

        int count = 0;

        if(input.length() != 0){
            count++;

            for (int i = 1; i < input.length()-1; i++) {
                if(input.charAt(i) == ' '){

                    count++;
                }
            }
        }

        System.out.println("Ви ввели "+count+"слів ");
    }
}
