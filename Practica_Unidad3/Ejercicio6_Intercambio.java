/**
 * Este es un ejemplo para el manejo de BlueJ 
 * 
 * @author (Franz Ruddy Salinas Cespedes) 
 * @version 
 */

public class Ejercicio6_Intercambio
{
    public String intercambiar(int num1, int num2, int num3){
        String respuesta = "";
        int aux = num1;
        num1 = num2;
        num2 = aux;
        aux = num1;
        num1 = num3;
        num3 = aux;
        respuesta = num1+" "+num2+" "+num3;
        return respuesta;
    }
}