import java.util.Scanner;

public class Akisj {

	public static void main (String[] args) {
	
		int i = 1;
		int MyNumber;
		int RandomNumber = (int) (Math.random() * 100 + 1);
		
		System.out.println(" Σκέφτομαι έναν αριθμό... ");
		System.out.println(" Μπορείς να τον μαντέψεις; ");
	 
	
		do
		{
			Scanner number = new Scanner(System.in);
		
			MyNumber = number.nextInt();
			System.out.println( "Προσπάθεια#" + i + ": " + MyNumber );
	
		
			if ( MyNumber < RandomNumber )
				System.out.println(" Ο αριθμός που ψάχνεις είναι ΜΕΓΑΛΥΤΕΡΟΣ! ");
	
			if  (MyNumber > RandomNumber )
				System.out.println(" Ο αριθμός που ψάχνεις είναι ΜΙΚΡΟΤΕΡΟΣ! ");
	
			if (MyNumber == RandomNumber )
			{
				System.out.println(" Μπράβο! ");
				System.out.println (" Τα κατάφερες σε " + i + " προσπάθειες");
				
				if (i > 5)
				{
					System.out.println (" Μπορείς όμως να τα καταφέρεις και γρηγορότερα!");
					break;
				}
				
				else
						System.out.println (" Είσαι πάρα πολύ γρήγορος...ΜΠΡΑΒΟΟΟΟΟΟ!!!!");
			}
			
			i = i + 1;
		
	    } while (  MyNumber >= RandomNumber || MyNumber <= RandomNumber );
	}
}
		

		