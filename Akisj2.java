import java.util.Scanner;

public class Akisj2 
{
	public static void main(String[]args){
		
		int sum = 0, number;
		Scanner scan = new Scanner(System.in);
		
		while (true)
		{
		System.out.print("Δώσε έναν αριθμό από το 1 ως 999 ( ή -1 για έξοδο):");
		
		number = scan.nextInt();
		
		if (number == -1)
			break;
		
		
		
		
		if (hasSix(number) == 1)
			sum = sum + number;
		
		}
		
		System.out.println("Το ειδικό άθροισμα που υπολόγισες είναι το:" + sum);
	}
		
		public static int hasSix(int number){
		 
			String numberStr; 
			int i;
			numberStr = Integer.toString(number);
		
			for (i = 0; i < numberStr.length(); i++)
			{			
				if (numberStr.charAt(i) == '6')
					return 1;
			}
		
			return 0;
			
		}
		
}
		
		
	
		
		
		
		
		
		
	
	

