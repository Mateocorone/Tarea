import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();

        System.out.print("Ingrese los valores de los lados del triángulo (separados por espacios): ");
        double lado1Triangulo = scanner.nextDouble();
        double lado2Triangulo = scanner.nextDouble();
        double lado3Triangulo = scanner.nextDouble();

        System.out.print("Ingrese el valor del radio del círculo: ");
        double radioCirculo = scanner.nextDouble();

        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        Triangulo triangulo = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
        Circulo circulo = new Circulo(radioCirculo);


        System.out.println("Cuadrado - Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("Cuadrado - Área: " + cuadrado.calcularArea());

        System.out.println("Triángulo - Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Triángulo - Área: " + triangulo.calcularArea());

        System.out.println("Círculo - Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Círculo - Área: " + circulo.calcularArea());
    }
}
