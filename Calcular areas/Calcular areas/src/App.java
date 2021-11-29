public class App {
    
    public static void main(String[] args) {
        SolicitarDatos ingresarDatos = new SolicitarDatos();
        double arreglo[] = ingresarDatos.pedirDatos();
      
        ICalculadoraFigura instancia = null;
        
        if(arreglo.length == 3){
            Figura triangulo = new Triangulo(arreglo);
            instancia = new TrianguloCalculadora((Triangulo)triangulo);
        }else if(arreglo.length > 3){
            Figura cuadrilatero = new Poligono(arreglo);
            instancia = new PoliginoCalculadora((Poligono)cuadrilatero);
        }else{
            System.out.println("Numero inválido, intente nuevamente\n ");
            ingresarDatos.pedirDatos();
        }
        
        System.out.println("El area de la figura de "+arreglo.length+" lados es =>"+instancia.calcularArea()+"\n"
                + "El perímetro de la figura de "+arreglo.length+" lados es =>"+instancia.calcularPerimetro());
    }
}