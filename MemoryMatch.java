import java.util.*;
import javax.swing.JOptionPane;
public class MemoryMatch
{            
    public static void main()
    {
        final int NUM_PAIRS=4;
        int board[]=new int[NUM_PAIRS*2+1];
        boolean printElement[]=new boolean[NUM_PAIRS*2+1];
        int temp,position1,position2,i;            
        int k=1;
        for(i=1;i<=NUM_PAIRS*2;i+=2)//creates cards
        {
            board[i]=k;
            board[i+1]=k;
            k++;
        }        
        for(i=1;i<=1000;i++)/randomizes board
        {
            position1=(int)(Math.random()*(board.length-1)+1);
            position2=(int)(Math.random()*(board.length-1)+1);
            
            temp=board[position1];
            board[position1]=board[position2];
            board[position2]=temp;
        }                             
        boolean player=true;
        int matches=NUM_PAIRS;
        int matches1=0;
        int matches2=0;
        int first=0;
        int second=0;
        String prompter;               
        Scanner console=new Scanner(System.in);                     
        while(matches>0)
        {                          
            if(player==true)
            {                
                System.out.print ('\f');
                System.out.println("Player 1-"+matches1);
                System.out.println("Player 2-"+matches2);
                System.out.println("1 2 3 4 5 6 7 8");
                for(i=1;i<board.length;i++)
                {
                    if(printElement[i]==true)
                    System.out.print(board[i]+ " ");
                    else
                    System.out.print("*" +" ");
                }
                System.out.println();
                System.out.println("Enter card Player 1");
                first=console.nextInt();
                 if(printElement[first]!=false)
                 {
                    while(printElement[first]!=false)
                    {
                        System.out.println("Card already chosen, pick another.");
                        first=console.nextInt();
                    } 
                 }
                printElement[first]=true;
                System.out.println("1 2 3 4 5 6 7 8");
                for(i=1;i<board.length;i++)
                {
                    if(printElement[i]==true)
                    System.out.print(board[i]+ " ");
                    else
                    System.out.print("*" +" ");
                }                
                System.out.println();
                System.out.println("Enter another card Player 1");
                second=console.nextInt();
                if(printElement[second]!=false)
                {
                    while(printElement[second]!=false)
                    {
                        System.out.println("Sorry,Enter another card");
                        second=console.nextInt();
                    }
                }
                printElement[second]=true;                
                System.out.println("1 2 3 4 5 6 7 8");
                for(i=1;i<board.length;i++)
                {
                    if(printElement[i]==true)
                    System.out.print(board[i]+ " ");
                    else
                    System.out.print("*" +" ");
                }                                           
                if(board[first]==board[second])
                {
                    matches1++;
                    matches--;
                    printElement[first]=true;
                    printElement[second]=true;
                    System.out.println();
                    System.out.print ('\f');
                    System.out.println("1 2 3 4 5 6 7 8");
                    for(i=1;i<board.length;i++)
                    {
                        if(printElement[i]==true)
                        System.out.print(board[i]+ " ");
                        else
                        System.out.print("*" +" ");
                    }
                    System.out.println();
                    System.out.println("Congrats, go again Player 1");                    
                }
                else
                {
                    System.out.println();
                    System.out.print ('\f');
                    System.out.println("1 2 3 4 5 6 7 8");
                    for(i=1;i<board.length;i++)
                    {
                        if(printElement[i]==true)
                        System.out.print(board[i]+ " ");
                        else
                        System.out.print("*" +" ");
                    }
                    System.out.println();
                    System.out.println("Too bad, Player 2's turn begins");
                    player=false;
                    printElement[first]=false;
                    printElement[second]=false;
                    prompter=JOptionPane.showInputDialog("Are you ready Player 2?Press n to quit. Y to continue");
                    if(prompter.charAt(0)=='n')
                    break;                                    
                }      
            }
            
            else if(player==false)
            {                
                System.out.print ('\f');
                System.out.println("Player 1-"+matches1);
                System.out.println("Player 2-"+matches2);
                System.out.println("1 2 3 4 5 6 7 8");
                for(i=1;i<board.length;i++)
                {
                    if(printElement[i]==true)
                    System.out.print(board[i]+ " ");
                    else
                    System.out.print("*" +" ");
                }
                System.out.println();
                System.out.println("Enter card Player 2");
                first=console.nextInt();
                if(printElement[first]!=false)
                {
                    while(printElement[first]!=false)
                 {System.out.println("Card already chosen, pick another.");
                  first=console.nextInt();
                 }
                }
                printElement[first]=true;
                System.out.println("1 2 3 4 5 6 7 8");
                for(i=1;i<board.length;i++)
                {
                    if(printElement[i]==true)
                    System.out.print(board[i]+ " ");
                    else
                    System.out.print("*" +" ");
                }                
                System.out.println();
                System.out.println("Enter another card Player 2");
                second=console.nextInt();
                if(printElement[second]!=false)
                {
                    while(printElement[second]!=false)
                 {System.out.println("Sorry,Enter another card");
                  second=console.nextInt();
                 }
                }                
                printElement[second]=true;                
                System.out.println("1 2 3 4 5 6 7 8");
                for(i=1;i<board.length;i++)
                {
                    if(printElement[i]==true)
                    System.out.print(board[i]+ " ");
                    else
                    System.out.print("*" +" ");
                }                            
                if(board[first]==board[second])
                {
                    matches2++;
                    matches--;
                    printElement[first]=true;
                    printElement[second]=true;
                    System.out.println();
                    System.out.print ('\f');
                    System.out.println("1 2 3 4 5 6 7 8");
                    for(i=1;i<board.length;i++)
                    {
                        if(printElement[i]==true)
                        System.out.print(board[i]+ " ");
                        else
                        System.out.print("*" +" ");
                    }
                    System.out.println();
                    System.out.println("Congrats, go again Player 2");                               
                }
                else
                {
                    System.out.println();
                    System.out.print ('\f');
                    System.out.println("1 2 3 4 5 6 7 8");
                    for(i=1;i<board.length;i++)
                    {
                        if(printElement[i]==true)
                        System.out.print(board[i]+ " ");
                        else
                        System.out.print("*" +" ");
                    }
                    System.out.println();
                    System.out.println("Too bad, Player 1's turn begins");
                    player=true;
                    printElement[first]=false;
                    printElement[second]=false;
                    prompter=JOptionPane.showInputDialog("Are you ready Player 1?Press n to quit. Y to continue");
                    if(prompter.charAt(0)=='n')
                    break;                                    
                }          
            }        
        }
           System.out.println("The game has ended");
            if(matches>0)
            System.out.println("The game has ended prematurely");
            else
            {
            if(matches1>matches2)
                System.out.println("Player 1 wins!");
            if(matches2>matches1)
                System.out.println("Player 2 wins!");
            if(matches1==matches2)
                System.out.println("It's a tie!");
            }  
        }
}            
