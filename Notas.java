import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su calificacion: ");
        int cal = scanner.nextInt();
        char nota;

        if (cal>=90){
            nota='A';
        } else if (cal>=80) {
            nota='B';
        } else if (cal>=70) {
            nota='C';
        } else if (cal>=60) {
            nota='D';
        }else
            nota='F';

        System.out.println("Su nota es:\n"+nota);
    }
}

