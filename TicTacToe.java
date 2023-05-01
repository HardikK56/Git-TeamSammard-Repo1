import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Let's play tic-tac-toe!");
        char board[][]={{'_','_','_'} , {'_','_','_'} , {'_','_','_'}};
        callBoard(board);
        int i,r,c,ans;
        String r1,c1;
        for(i=1;i<=9;i++)
        {
            System.out.print("Turn ");
            if(i%2!=0)
            System.out.println("X:");
            else
            System.out.println("O:");
            System.out.print("Pick up your row and coloumn number: ");
            r1=sc.next();
            c1=sc.next();
            System.out.println();
            r=Integer.parseInt(r1);
            c=Integer.parseInt(c1);
            if(i%2!=0)
            board[r][c]='X';
            else
            board[r][c]='O';
            callBoard(board);
            ans=checkBoard(board);
            if(ans==1)
            {
                System.out.println("You win!");
                break;
            }
        }
        System.out.println("Game drawn!");
    }
    public static void callBoard(char board[][])
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            System.out.print(board[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static int checkBoard(char board[][])
    {
        int r,c,co;
        char e=' ',d1,d2;
        for(r=0;r<3;r++)
        {
            e=board[r][0];
            co=0;
            for(c=0;c<3;c++)
            {
                if(e==board[r][c])
                co++;
            }
            if(co==3 && e!='_')
            return 1;
        }
        for(c=0;c<3;c++)
        {
            e=board[0][c];
            co=0;
            for(r=0;r<3;r++)
            {
                if(e==board[r][c])
                co++;
            }
            if(co==3 && e!='_')
            return 1;
        }
        d1=board[0][0];
        d2=board[0][2];
        co=0;
        for(c=0;c<3;c++)
        {
            if(d1==board[c][c])
            co++;
        }
        if(co==3 && e!='_')
        return 1;
        if(d2==board[1][1] && d2==board[2][0] && e!='_')
        return 1;
        return 0;
    }
}
