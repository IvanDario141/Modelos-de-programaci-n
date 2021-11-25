public class TrianguloCalculadora implements ICalculadoraFigura{
    
    private Triangulo triangulo;

    public TrianguloCalculadora(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    @Override
    public double calcularArea() {
        Double aux, raiz;
        double area=0, radicando;
        double[] lados = triangulo.getLados();
        double SPmetro = calcularPerimetro()/2;
        radicando = SPmetro*(SPmetro-lados[0])*(SPmetro-lados[1])*(SPmetro-lados[2]);
        aux = (double) radicando;
        for(int i=0;i< lados.length;i++){
            if(SPmetro>lados[i]){
                raiz = Math.sqrt(aux);
                area = raiz.floatValue();
            }else{
                System.out.println("No se puede calcular el área");
            }
        }
        return area;
    }
 
    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        double[] lados = triangulo.getLados();
        for(int i=0; i<lados.length; i++){
            perimetro+=lados[i];
        }
        return perimetro;
    }
   
}
