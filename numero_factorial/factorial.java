package numero_factorial;
import javax.swing.JOptionPane;

public class factorial 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un número entero positivo:"));
        boolean esPrimo = true;
        int divisor = 2;
        
        while(divisor <= num/2 && esPrimo) 
        {
            if(num % divisor == 0) 
            {
                esPrimo = false;
            }
            divisor++;
        }
        
        if(esPrimo) 
        {
            JOptionPane.showMessageDialog(null, num + " es un número primo.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, num + " no es un número primo.");
        }
    }
}