import java.util.Scanner;
public class Dups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number:");
		Scanner a= new Scanner(System.in);
		int num= a.nextInt();
		
		int tmp=1;
		
		for(int i=num; i>0; i++)
		{
			for(int j=0; j>=i; j++)
			{
			    
				System.out.print(tmp+" ");
				tmp++;
			}
			System.out.print(" ");
			
		}

	}

}
