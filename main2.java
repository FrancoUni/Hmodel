import java.util.Scanner;
public class main2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre? ");
		String name = scanner.nextLine();
		
		System.out.println("Que edad tienes? ");
        int age = scanner.nextInt();
        scanner.nextLine();
		System.out.println("Cual es tu comida favorita? ");
		String food = scanner.nextLine();

        System.out.print("\n");
		System.out.println("Hello "+name);
		System.out.println("Tienes "+age +" años");
		System.out.println("Te gusta "+food);

	}
}
