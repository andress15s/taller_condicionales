package capicúa;

import javax.swing.JOptionPane;

public class capicua 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog(null, "Ingrese un número entero:");
        int numero = Integer.parseInt(input);
        
        if (esCapicua(numero)) 
        {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es capicúa.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " no es capicúa.");
        }
    }
    
    public static boolean esCapicua(int numero) 
    {
        int numeroInvertido = 0;
        int numeroOriginal = numero;

        while (numero != 0) 
        {
            numeroInvertido = (numeroInvertido * 10) + (numero % 10);
            numero = numero / 10;
        }
        
        
        return(numeroOriginal == numeroInvertido);
    }
}