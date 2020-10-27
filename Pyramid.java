import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int rows = reader.nextInt();
		for(int u = 1; u<=rows; u++)
		{
			for(int v = rows; v>u; v--)
			{
				System.out.print(" ");
			}
			for(int w = 1; w<= (2*u-1); w++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}