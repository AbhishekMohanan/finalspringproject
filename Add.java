import java.util.*;

class Add{
	
	public static void main(String are[]){
		Scanner add = new Scanner(System.in);
		System.out.print("Enter The Num1 : ");
		int Num1 = add.nextInt();
		
		System.out.print("Enter The Num2 : ");
		int Num2 = add.nextInt();
		
		int Sum = Num1 + Num2;
		System.out.println("Sum is : " + Sum);
		
	}
}