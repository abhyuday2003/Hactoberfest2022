import java.util.Scanner;
class checkpalin
{
	Scanner sc=new Scanner(System.in)
	String str;
	str=sc.nextLine();
	int i=0;
	int j=str.length()-1;
	while(i<=j)
	{
		if(str.charAt(i)==str.charAt(j))
		{
			i++;
			j--;
		}
		else 
			break;	    
	}
	if(i<j)
		System.out.println("not pallindrome");
	else
		System.out.println(" pallindrome");
		
}