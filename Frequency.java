import java.util.Scanner;
class Frequency
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of array: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	int numbers[]=new int[n];
	int freq[]=new int[n];
	int cnt=0;
	for(int i=0;i<n;i++)
	{	boolean found=false;
		for(int j=0;j<cnt;j++)
		{
		if(numbers[j]==a[i])
		{freq[j]++;
		found=true;
		break;
		}
		}
	if(found==false)
	{
	numbers[cnt]=a[i];
	freq[cnt]=1;
	cnt++;
	}
    
	}
//sort
for(int i=0;i<cnt-1;i++)
	for(int j=i+1;j<cnt;j++)
	if(freq[i]>freq[j])	
	{
	int t=freq[i];
	freq[i]=freq[j];
	freq[j]=t;
	t=numbers[i];
	numbers[i]=numbers[j];
	numbers[j]=t;
	}
//output
	for(int i=0;i<cnt;i++)
	{
		System.out.println(numbers[i]+"->"+freq[i]);
	}
	}
}