import java.util.Scanner;
import java.lang.Math;
public class Main {
    static void Addition(int a ,int b){
        System.out.println("La somme est:" +(a + b));
    }
    static void Soustraction(int a ,int b){

        System.out.println("La soustraction est:" +(a - b));
    }
    static void Multiplication(int a ,int b){
        System.out.println("La multiplication est:" +(a * b));
    }
    static void Division(float a ,float b){
        System.out.println("La division est:" +(a / b));
    }
    static void Puissance(int a ,int b){
        System.out.println("La puissance est:"+ Math.pow (a,b));
    }
    static void Racine(int a ){
        System.out.println("le racine est: "+ Math.sqrt(a));
    }
    static void factoriel(int a) {
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choix;

        do {
            System.out.println("1- Addition");
            System.out.println("2- Soustraction");
            System.out.println("3- Multiplication");
            System.out.println("4- Division");
            System.out.println("5- Puissance");
            System.out.println("6- Racine");
            System.out.println("7- Factoriel");
            System.out.println("[Entrer votre choix]");
            choix = scan.nextInt();

            if (choix >= 1 && choix <= 5) {
                System.out.println("Entrer le premier nombre :");
                int a = scan.nextInt();
                System.out.println("Entrer le deuxième nombre :");
                int b = scan.nextInt();

                switch (choix) {
                    case 1:
                        Addition(a, b);
                        break;
                    case 2:
                        Soustraction(a, b);
                        break;
                    case 3:
                        Multiplication(a, b);
                        break;
                    case 4:
                        Division(a, b);
                        break;
                    case 5:
                        Puissance(a, b);
                        break;
                    default:
                        System.out.println("Choix invalide!");
                        break;
                }
            } else if (choix == 6 || choix == 7) {
                System.out.println("Entrer votre nombre :");
                int a = scan.nextInt();

                switch (choix) {
                    case 6:
                        Racine(a);
                        break;
                    case 7:
                        factoriel(a);
                        break;
                    default:
                        System.out.println("Choix invalide!");
                        break;
                }
            } else {
                System.out.println("Choix invalide!");
            }

        } while (choix != 0);
    }


}