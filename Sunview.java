
import java.util.*;
import java.lang.*;
import java.io.*;

class Sunview
{
	public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
	int t = obj.nextInt();
	for(int i=0;i<t;i++)
	{
		int l = obj.nextInt();
		int a[] = new int[l];
	
	for(int j=0;j<l;j++)
	{
		a[j]=obj.nextInt();
	}
		int max = -1;
		int temp = 0;
	
	for(int j=0;j<l;j++)
	{
		if(a[j]>=max)
		{
			max=a[j];
			temp++;
		}
	}
	System.out.println("\n Surface of the building =" + temp); 	}
}
}
