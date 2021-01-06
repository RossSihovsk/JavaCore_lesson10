package Task2;

import java.util.Scanner;


public class Application {

    public static void replaceVowels(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введіть стрічку");
        String st = scan.nextLine();
        int      c1  = 0;



        char[] ch1 = new char[st.length()];
        for(int i=0;i<st.length();i++)
        {
            ch1[i] = st.charAt(i);
        }

        for(int i=0;i<ch1.length;i++)
        {
            int c = ch1[i];
            if(c >= 97 && c <= 122||c>=65 && c<=90)
                c1++;

        }

        if(ch1.length==c1)
        {
           try{throw new NotUkrainianException("У вас стрічка на англійській. Міняйте на українську");}
           catch (NotUkrainianException exception){
               System.out.println(exception.getMessage());
           }
        }
        else
        {
            char ch[]=st.toCharArray();
            for (int i = 0; i < ch.length; i++)
            {
                if (ch[i]=='а'||ch[i]=='о'||ch[i]=='і'||ch[i]=='є'||ch[i]=='я'||ch[i]=='ю'||ch[i]=='у'||ch[i]=='е'||ch[i]=='ї')
                {
                    ch[i]='-';
                }
            }
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
            System.out.println(" ");
        }
        }




    public static void main(String[] args) {
        System.out.println("Програма працює тільки з українськими голосними!");

        while (true){ replaceVowels(); }

    }

}
