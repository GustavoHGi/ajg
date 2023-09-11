package SumaDeDosNumeros;
import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int Suma,p;
		Suma=n1+n2;
		p=Suma%2;
		if(p>0) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
			}
		}

}
