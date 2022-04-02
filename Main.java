package harmonikSeri;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Harmonik toplamý bulunacak sayýyý giriniz:");
		double num=scanner.nextDouble();
		double	toplam=0;
		for(int i=1;i<=num;i++) {
			toplam+=(1.0/i);
		}
		System.out.println("Harmonik toplam= "+toplam);
	}

}
