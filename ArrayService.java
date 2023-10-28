import java.util.Scanner;
public class ArrayService{
	public static void addArray(int[][]a,int[][]b)
	{
		int[][]temp=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				temp[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[0].length;j++)
			{
				System.out.println(temp[i][j]);
			}
		}
	}
	public static void acceptData(int[][]a)
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	public static int max(int[][]x)
	{
		int max=x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				if(x[i][j]>max)
				{
					max=x[i][j];
				}
			}
		}
		return max;
	}
		public static int FindNumber(int[][] b)
		{
			
			int num,count=0;
			System.out.println("Enter the number which you want to find:");
			Scanner sc= new Scanner(System.in);
			num=sc.nextInt();
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[0].length;j++)
				{
					if(num==b[i][j])
					{
						count++;
					}
				}
			}
			return count;
		}
		public static void Transpose(int[][] a) {
			int[][]b=new int[a.length][a[0].length];
			for( int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					b[i][j]=a[j][i];
				
				}
			}
				for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<b[0].length;j++)
					{
						System.out.println(b[i][j]);
					}
				}
		}
		
}
