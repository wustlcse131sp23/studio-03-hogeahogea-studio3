package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("n?");
		int number = in.nextInt();
		boolean [] bool = new boolean[number+1];
		
		//make booleans equal true
		for(int i = 0; i < bool.length; i++) 
		{
			bool[i]=true;
		}
		
		for(int p = 2; p*p <=number; p++)
		{
			//if(bool[p]=true)
			//{
				for(int i = p*p; i <=number; i +=p)
				{
					//System.out.println(i);
					bool[i]=false;
				}
			//}
		}

        // Print all prime numbers
        for(int i = 2; i <= number; i++)
        {
            if(bool[i] == true)
            {
                System.out.print(i + " ");
            }
        }
		
	}
}
