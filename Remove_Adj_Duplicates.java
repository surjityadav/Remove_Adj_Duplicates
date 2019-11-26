
import java.util.Scanner;


public class Remove_Adj_Duplicates 
{
    static void remDuplicate(String str)
    {
        if(str.length()<=1)
        {
            System.out.println(str);
        }
        String res="";
        for(int i=0;i<str.length();i++)
        {
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1))
            {
                if(i<str.length()-2 && str.charAt(i)!=str.charAt(i+2))
                {
                    i=i+2;
                }
                else
                {
                    i++;
                }
            }
            if(i!=str.length()-1)
            {
                res = res+str.charAt(i);
            }
            if(i==str.length()-1 && str.charAt(i)!= str.charAt(i-1))
            {
                res=res+str.charAt(i);
            }
        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        remDuplicate(str);
    }
}
