public class Calculadora {
    private double result = 0;

    public void suma(double num){result += num;}
    public void resta(double num){result -= num;}
    public void multiplicacion(double num){result *= num;}
    public void division(double num){result /= num;}
    public double igual(){return result;}
    public void reset(){result = 0;}
    public void setResult(double num){result = num;}
}