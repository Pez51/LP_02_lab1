import java.util.Scanner;

public class PyLab01 {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do{
            vida ++;
            System.out.println("Vida:"+ vida + "\t¿Cual es el numero secreto?");
            rp = sc.nextInt();
            if (rp == 1234)
                fl =true;
        }while(vida < 3 && !fl);
        
        if (fl) {
            System.out.println("Adivinaste!!!! ");
            System.out.println("¡Felicidades! Ganaste un premio.");
            System.out.println("Tu premio es un cupón de descuento del 20% en tu próxima compra.");
        } else {
            System.out.println("Ups, perdiste...");
        }
    }
}
