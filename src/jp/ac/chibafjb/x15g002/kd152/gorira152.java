package jp.ac.chibafjb.x15g002.kd152;

import java.util.Scanner;

public class gorira152 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		double a = sin.nextDouble();
		sin.close();
		double i = 3.14;
		System.out.println("円周 = "+2*i*a);
		System.out.println("面積 = "+i*a*a);
		float a = sin.nextFloat();
	}

}
