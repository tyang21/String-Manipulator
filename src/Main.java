import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		boolean tryAgain = true;
		
		while (tryAgain) 
		{
			StringManipulator s = new StringManipulator();
			Scanner in = new Scanner(System.in);
			System.out.print("Choose  method:"); 
			String m = in.nextLine();
			
			if(m.equals("noVowels") || m.equals("reverse")) 
			{
				tryAgain = false;
				
				if(m.equals("noVowels")) 
				{
					System.out.println("Enter text: ");
					String n = in.nextLine();
					System.out.println(s.noVowels(n));	
					System.out.println("Do you want to repeat?");
					String repeat = in.nextLine();
							if (repeat.equals("yes"))
							{
								tryAgain = true;
							}
				}
				
				if(m.equals("reverse")) 
				{
					System.out.println("What do you want to input into the code?");
					String n = in.nextLine();
					System.out.println(s.reverse(n));
					
					System.out.println("Do you want to repeat?");
					String repeat = in.nextLine();
							if (repeat.equals("yes"))
							{
								tryAgain = true;
							}
				}
			}
			
			else
			{
				System.out.println("Please Try Again \n");
			}
			

		}
	}

}
