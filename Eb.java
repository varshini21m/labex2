/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb;
import java.util.*;
/**
 *
 * @author VARSHINI M
 */
public class Eb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name,connection;
        int no,prev_mon_red,cur_mon_red;
        System.out.println("Enter the consumer name:");
        name=obj.next();
        System.out.println("Enter the consumer number:");
        no=obj.nextInt();
        System.out.println("Enter previous month reading:");
        prev_mon_red=obj.nextInt();
        System.out.println("Enter the current month reading:");
        cur_mon_red=obj.nextInt();
        System.out.println("enter the connection is (domestic/commercial)");
        connection=obj.next();
        member a1=new member(no,name,prev_mon_red);
        a1.consumerno();
        a1.consumername();
        a1.previousmonthreading();
        a1.currentmonthreading(cur_mon_red);
        a1.currentbill(connection,cur_mon_red);
        // TODO code application logic here
    }
    
}
class member
{
    int no,prev_mon_red,cur_mon_red;
    String name,connection;
    member(int i,String o,int s)
    {
        no=i;
        name=o;
        prev_mon_red=s;
    }
    int consumerno()
    {
        return no; 
    }
    String consumername()
    {
        return name;
    }
    int previousmonthreading()
    {
        return prev_mon_red;
    }
    int currentmonthreading(int k)
    {
        cur_mon_red=k;
        return cur_mon_red;
    }
    void currentbill(String j,int d)
    {
        connection=j;
        cur_mon_red=d;
        switch(connection)
        {
            case "domestic":
                if(cur_mon_red<=100)
                {
                    System.out.println("Total Electricity Bill="+cur_mon_red*2);
                    break;
                }
                else if(cur_mon_red<=200)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(cur_mon_red-100)*3.50);
                    break;
                }
                else if(cur_mon_red<=500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(cur_mon_red-200)*5);
                    break;
                }
                else if(cur_mon_red>500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(200*5)+(cur_mon_red-400)*6); 
                    break;
                }
            case "commercial":
                if(cur_mon_red<=100)
                {
                    System.out.println("Total Electricity Bill="+cur_mon_red*3);
                    break;
                }
                else if(cur_mon_red<=200)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(cur_mon_red-100)*5.50);
                    break;
                }
                else if(cur_mon_red<=500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(cur_mon_red-200)*7);
                    break;
                }
                else if(cur_mon_red>500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(200*5)+(cur_mon_red-400)*8);
                    break;
                }
            default:
                System.out.println("Incorrect Error!");
            
        }
    }
}
