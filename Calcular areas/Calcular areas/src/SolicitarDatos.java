import java.util.Scanner;

public class SolicitarDatos {
    private int eleccion;
    public double nuevoNumero[];
    
    public double[] pedirDatos(){
     
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese el numero de lados de la figura a la que le desea hallar el perímetro y el área\n");
        eleccion = sc1.nextInt();
        nuevoNumero = new double[eleccion];
        
        if(eleccion == 3){
            for(int i = 0;i < eleccion; i++){
                System.out.println("Ingrese el lado numero "+(i+1));
                double ladosT = sc1.nextInt();
                nuevoNumero[i] = ladosT;
            }
        }else if(eleccion > 3){
            nuevoNumero[0] = eleccion;
            System.out.println("Ingrese uno de los lados: \n");
            nuevoNumero[1] = sc1.nextInt();
        }else{
            System.out.println("Numero inválido, intente nuevamente\n ");
            pedirDatos();
        }
        
        return nuevoNumero;
    }    
}
