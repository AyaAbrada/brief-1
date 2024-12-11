import java.util.Scanner;
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
    static void Division(int a ,int b){
        System.out.println("La division est:" +(a / b));
    }
    public static void main(String[] args){
        int choix;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Entrer le premier nombre :");
            int a = scan.nextInt();
            System.out.println("Entrer le deuxiéme nombre :");
            int b = scan.nextInt();
            System.out.println("1- Addition ");
            System.out.println("2- Soustraction");
            System.out.println("3- Multiplication");
            System.out.println("4- Division");
            System.out.println("5- Puissance");
            System.out.println("7- Racine ");
            System.out.println("6- Factoriel");
            System.out.println("8- Quitter");
            System.out.println("[Entrer votre choix]");
            Scanner ch = new Scanner(System.in);
            choix = ch.nextInt();
            switch(choix){
                case 1 : Addition(a,b);
                break;
                case 2 : Soustraction(a,b);
                break;
                case 3 : Multiplication(a,b);
                break;
                case 4 : Division(a,b);
                break;
                default:
                    System.out.println("Choix invalide!");
                    break;

            }
        }while(choix!=8);

    }

}