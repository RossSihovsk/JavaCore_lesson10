package Task1;

import java.util.Scanner;


public class Application {

    static void  cheskMethod()
    {

        System.out.println("Введіть слово з 5 букв!");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (word.length()!=5){
            try{ throw new NotFiveLetterException("Слово не з 5 букв, давайте заново!");}
            catch (NotFiveLetterException exception)
            {
                System.out.println(exception.getMessage());
                System.out.println("");
            }
        }

        String word2 = new  StringBuffer(word).reverse().toString();
        if (word.equalsIgnoreCase(word2))
        {
            System.out.println("Введене слово є паліндромом ");
            System.out.println("");
        }

    }



    public static void main(String[] args) {

        System.out.println("Програма для перевірки чи є введене слово паліндромом");

        while (true){

            cheskMethod();

        }





    }

}
