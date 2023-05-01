import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) 
    {
        int i,n,usersum=0,sumdice;
        System.out.println("Pick any 3 numbers:");
        for(i=1;i<=3;i++)
        {
            n=getInput();
            usersum+=n;
        }
        System.out.println("The user sum is: "+usersum);
        sumdice=diceRoll();
        if(sumdice<usersum && (usersum-sumdice)<3)
        System.out.println("Congrats! you won");
        else
        System.out.println("Sorry! You lost");

    }
    public static int getInput()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1 || n>6)
        {
            System.out.println("Invalid dice input");
            System.exit(0);
        }
        return n;
    }
    public static int diceRoll()
    {
        int sum=0;
        for(int i=1;i<=3;i++)
        {
          int d=(int)(Math.random()*6);
          d+=1;
          System.out.print(d+" ");
          sum=sum+d;
        }
        System.out.println();
        return sum;
    }
}
