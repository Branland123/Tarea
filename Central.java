import java.util.Scanner;
public class Central {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float num1= scanner.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        float num2= scanner.nextFloat();
        System.out.println("Ingrese el tercer numero: ");
        float num3= scanner.nextFloat();
        float central;

        if (num1<num2 && num1>num3 || num1>num2 && num1<num3){
            central = num1;
        } else if (num2 < num1 && num2 > num3 || num2 > num1 && num2 < num3) {
            central = num2;
        }else
            central = num3;

        System.out.printf("El numero central es:%n%.2f",central);
    }
}
