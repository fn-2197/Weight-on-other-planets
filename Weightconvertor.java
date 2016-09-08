import java.util.Scanner;


public class Weightconvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner amount = new Scanner(System.in);
		System.out.println("Type your weight: ");
		int a = (int) amount.nextInt();
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		
		Scanner choice = new Scanner(System.in);
		System.out.println("Selection? ");
		int c = (int) choice.nextInt();
		
		switch(c){
		case 1:
			System.out.println("Your weight on Voltar would be " + a*.091);
			break;
		case 2:
			System.out.println("Your weight on Krypton would be " + a*.720);
			break;
		case 3:
			System.out.println("Your weight on Fertos would be " + a*.865);
			break;
		case 4:
			System.out.println("Your weight on Servontos would be " + a*4.612);
			break;
		default:
			System.out.println("You needed to type a valid answer you idiot.  I bet you can't even do Two plus Two.  You don't get to try again.  I quit.");
			break;
		}
	}

}
