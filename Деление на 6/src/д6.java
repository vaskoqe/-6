import java.util.Scanner;
public class д6 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Провери, дали числото/а се дели/ят на 6 и разбери колко е, ако се дели");
		System.out.println("Въведи числото а: ");
		long a= input.nextLong();
		if (a%6==0) {
			System.out.println("Числото " + a + " се дели на 6 и е: ");
		System.out.println(a/6);;}
		else 
			System.out.println("Числото "+ a+ " не се дели на 6!");
		input.close();
		

	}

}