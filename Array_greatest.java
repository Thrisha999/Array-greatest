import java.util.*;
import java.util.Scanner;
class Array_greatest
{
    public static void main(String[] args)
    {
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("the greatest element is "+a[i-1]);
    }
}