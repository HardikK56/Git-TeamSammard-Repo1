import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class RockPaperScissors {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Let's play rock paper scissors.\nWhen I say 'shoot', Choose: rock, paper or scissors");
        System.out.println("\nAre you ready? Write 'yes' if you are.");
        String ans=sc.nextLine();
        if(ans.equals("yes"))
        {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            s=sc.nextLine();
            calci(s);
        }
        else
        System.out.println("Darn! some other time... ");
    }
    public static void calci(String s)
    {
        int op=0;
        if(s.equals("rock"))
        {
        op=1;
        System.out.println("\nYou choose:\trock");
        }
        else if(s.equals("paper"))
        {
        op=2;
        System.out.println("\nYou choose:\tpaper");
        }
        else if(s.equals("scissors"))
        {
        op=3;
        System.out.println("\nYou choose:\tscissors");
        }
        else
        {
            System.out.println("Select correct option");
            System.exit(0);
        }
        int comp=(int)(Math.random()*3);
        comp+=1;
        if(comp==1)
        System.out.println("The computer chose:\trock");
        else if(comp==2)
        System.out.println("The computer chose:\tpaper");
        else
        System.out.println("The computer chose:\tscissors");
        if(op==1)
        {
            if(comp==2)
            System.out.println("You lost!");
            else if(comp==3)
            System.out.println("You win!");
            else
            System.out.println("Game even!");
        }
        else if(op==2)
        {
            if(comp==1)
            System.out.println("You win!");
            else if(comp==3)
            System.out.println("You lost!");
            else
            System.out.println("Game even!");
        }
        else
        {
            if(comp==1)
            System.out.println("You lost!");
            else if(comp==2)
            System.out.println("You win!");
            else
            System.out.println("Game even!");
        }
    }
}
