

import java.util.*;

public class Solution
{

    // 8.- Diseñe un método que al ingresar por teclado un numero, si es par mostrar el doble,
    // si es impar mostrar el triple.



    public static class Ejercicio8
    {
        Scanner dato = new Scanner(System.in);
        void dobleotriple()
        {
            int numero;
            System.out.println("Ingrese el numero a evaluar ;");
            numero = dato.nextInt();
            if( numero % 2 == 0 ){
                System.out.println("El doble del numero ==> " + 2* numero);
            }
            else
            {
                System.out.println("El triple del numero ==> " + 3* numero);
            }
        }  public static void main(String []args)
    {
            Ejercicio8 dt = new Ejercicio8();
            dt.dobleotriple();
        }
    }

}
