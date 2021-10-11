import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    int num, res;
	    
	    System.out.println("=====================");
	    System.out.println("       TABUADA       ");
	    System.out.println("=====================");
	    System.out.println("Informe um numero: ");
	    
	    num = numero.nextInt();
	    
	    for(int i = 0; i <= 10; i++){
	        res = num * i;
	        System.out.println(num + " x " + i + " = " + res);
	    }
	    
	}
}
