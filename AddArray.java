

public class AddArray {
	public static void main(String[] args)
	{
		int max;
		int [][]a=new int[2][2];
		int [][]b=new int[2][2];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st array:");
		ArrayService.acceptData(a);
		System.out.println("Enter the 2nd array:");
		ArrayService.acceptData(b);
		ArrayService.addArray(a,b);
		System.out.println(ArrayService.max(b));
		System.out.println(ArrayService.FindNumber(a));
	
	}

}



