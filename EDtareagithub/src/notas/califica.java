package notas;

import java.util.Scanner;

public class califica {

	public static void califica(String[] num_nota) {
	Scanner reader = new Scanner(System.in);// Para pedir números por teclado
	int n = 0;
	String c = "";
	//nos pide introducir un numero
	System.out.print("Introduzca una nota: ");
	n = reader.nextInt();
	
	//si la nota dada es entre 0 y menos de 5 nos aparece un texto que confirma que la nota esta suspensa
	if (n >= 0 && n < 5)
	c = "Suspenso";
	//si la nota dada es entre 5 y menor de 7 nos aparece un texto que confirma que la nota esta aprobada
	else if (n >= 5 && n < 7)
	c = "Aprobado";
	//si la nota dada es entre 7 y menor de 9 nos aparece un texto que nos dice que la nota es notable
	else if (n >= 7 && n <9)
	c = "Notable";
	//si la nota dada es entre 9 y 10 nos aparece un texto que nos dice que la nota es un sobresaliente
	else if (n >= 9 && n <= 10)
	c = "Sobresaliente";
	//si la nota dada que damos no se trata de numeros, o estos son inferior a 0 o superior a 10 la nota no es correcta
	else
	c = "La nota introducida no es correcta";
	
	System.out.println(c);
	reader.close();
	}
	

}
