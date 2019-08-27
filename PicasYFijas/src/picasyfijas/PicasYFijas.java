package picasyfijas;

import java.util.Scanner;

public class PicasYFijas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean noSalir = true;
        int i = 0;
        do {

            int numRandom = 3456;
            System.out.println("Ingrese el número: ");
            int num = sc.nextInt(); //1236
            int fijas = fijas(num, numRandom);
            if (fijas == 4) {
                System.out.println("Felicitaciones usted ganó");
                noSalir = false;
            } else {
                System.out.println("La cantidad de fijas es: " + fijas);
                int picas = picas(num, numRandom);
                System.out.println("La cantidad de picas es: " + picas);
                i++;
                if (i == 10) {
                    noSalir = false;
                    System.out.println("Lo sentimos usted ha perdido el juego");

                }
            }
        } while (noSalir == true);

    }

    public static int fijas(int num, int numRandom) {
        int fijas = 0;
        for (int i = 0; i < 4; i++) {
            int res1 = num % 10; //6
            num = num / 10; //123

            int res2 = numRandom % 10; //6
            numRandom = numRandom / 10; //3456

            if (res1 == res2) {
                fijas++;
            }
        }

        return fijas;
    }

    public static int picas(int num, int numRandom) { // NUM = 6543, NUMRANDOM = 354
                                                      // RESULTADO = 4 PICAS
        int picas = 0, cont2 = 1;
        do {//ESTE DO WHILE DESMIEMBRA 3456
            int resA = numRandom % 10; // [1] = resA = 4
            numRandom = numRandom / 10; // [1] = numRandom = 35
            int cont1 = 1; // 
            int numA = num; // numA = 6543
            do {
                if (cont1 == cont2) { //CONT1 = 4 ; CONT2 = 2

                    numA = numA / 10;
                } else {
                    int resB = numA % 10; // [1]  = resB = 
                    numA = numA / 10; //  [1] =  numA = 

                    if (resA == resB) {
                        picas++;
                    }

                }
                cont1++;
            } while (cont1 <= 4); //5
            cont2++;
        } while (cont2 <= 4);//2
        
        return picas;
    }
}
