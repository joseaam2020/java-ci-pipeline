public class Calculadora {
    double result = 0;

    public void suma(float num){result += num;}
    public void resta(float num){result -= num;}
    public void multiplicacion(float num){result *= num;}
    public void division(float num){result /= num;}
    public void raiz(){result = Math.sqrt(result);}
    public double igual(){return result;}
    public void reset(){result = 0;}
}
