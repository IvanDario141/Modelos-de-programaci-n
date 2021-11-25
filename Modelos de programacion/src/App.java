import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese el numero de lados de la figura a la que desea hallar el perímetro y el área\n");
        int operacion = sc.nextInt();
        App ingresarDatos = new App();
        double arreglo[] = ingresarDatos.iDatos(operacion);
        
        switch(operacion){
            case 3:
                Figura triangulo1 = new Triangulo(arreglo);
                TrianguloCalculadora trianguloCalculo = new TrianguloCalculadora((Triangulo) triangulo1);
                System.out.println("Area del triangulo => "+trianguloCalculo.calcularArea()+"\n"
                        + "Perímetro del triangulo => "+trianguloCalculo.calcularPerimetro());
                break;
            case 4:
                Figura cuadrado1 = new Cuadrado(arreglo);
                CuadradoCalculadora cuadradoCalculo = new CuadradoCalculadora((Cuadrado) cuadrado1);
                System.out.println("Area del cuadrilatero => "+cuadradoCalculo.calcularArea()+"\n"
                        + "Perímetro del cuadrilatero => "+cuadradoCalculo.calcularPerimetro());
                break;
            default:
                System.out.println("Numero inválido");
        }
    }
    
    private double[] iDatos(int eleccion){
        Scanner sc1 = new Scanner(System.in);
        double nuevoNumero[];
        nuevoNumero = new double[4];
        
        for(int i=0;i<eleccion;i++){
            System.out.println("Ingrese el primer lado numero "+(i+1));
            double ladosT = sc1.nextInt();
            nuevoNumero[i] = ladosT;
        }
        return nuevoNumero;
    }
        
  
}
