package jp.ac.chibafjb.x15g002.kd151;

import java.util.Scanner;

public class gorira151 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("aの入力-->");
		double a= sin.nextDouble();
		System.out.print("bの入力-->");
		double b = sin.nextDouble();
		sin.close();
		
		 System.out.println(a+"+"+b+"="+(a+b));
		 System.out.println(a+"-"+b+"="+(a-b));
		 System.out.println(a+"*"+b+"="+(a*b));
		 System.out.println(a+"/"+b+"="+(a/b));
	}

}
