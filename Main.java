import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Complex z1 = new Complex();				//первое комплексное число
		System.out.println("Enter first complex number:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println();
		Complex z2 = new Complex(x,y);				//второе комплексное число
		System.out.println("Enter second complex number:");
		scanner.nextLine();					//free scanner					
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println();
		Complex z3 = new Complex(x,y);
		System.out.println("First modulo: ");
		z2.Modulo();
		System.out.println();
		System.out.println("Second modulo: ");
		z3.Modulo();
		System.out.println();
		System.out.println("First argument: ");
	        z2.Arg();
		System.out.println();
		System.out.println("Second argument: ");
		z3.Arg();
		System.out.println();
		Complex.Sum(z2,z3);
		Complex.Minus(z2,z3);
		scanner.close();					//close scanner
	}
}
