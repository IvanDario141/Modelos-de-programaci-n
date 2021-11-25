
public class TrianguloCalculadora implements ICalculadoraFigura{
    
    private Triangulo triangulo;

    public TrianguloCalculadora(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    @Override
    public float calcularArea() {
        Double aux, raiz;
        float area=0, radicando;
        float[] lados = triangulo.getLados();
        float SPmetro = calcularPerimetro()/2;
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
    public float calcularPerimetro() {
        float perimetro = 0;
        float[] lados = triangulo.getLados();
        for(int i=0; i<lados.length; i++){
            perimetro+=lados[i];
        }
        return perimetro;
    }
    
}
