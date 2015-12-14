package jp.ac.chibafjb.x15g002.kd153;

import java.util.Scanner;

public class gorira153 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		float a = sin.nextFloat();
		sin.close();
		float i = 3.14f;
		System.out.println("円周 = "+Math.round(2*i*a*10)/10.0f);
		System.out.println("面積 = "+Math.round(i*a*a*10)/10.0f);
	}

}
