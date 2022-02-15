import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String operation;

        System.out.print("Digite o primeiro número: ");
        calculadora.setNum1(sc.nextInt());
        System.out.print("Digite o segundo número: ");
        calculadora.setNum2(sc.nextInt());
        System.out.print("Digite a operação desejada: ");
        operation = sc.next();

        if (operation.equals("+")) {
            System.out.println("Resultado: " + calculadora.somar()); 
        }
        else if (operation.equals("-")) {
            System.out.println("Resultado: " + calculadora.subtrair());
        }
        else if (operation.equals("/")) {
            System.out.println("Resultado: " + calculadora.dividir());
        }
        else if (operation.equals("*")) {
            System.out.println("Resultado: " + calculadora.multiplicar());
        } else {
            System.out.println("Operação invalida!");
        }

        sc.close();
    }
}
