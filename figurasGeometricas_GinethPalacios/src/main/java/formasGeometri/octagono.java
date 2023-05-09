package formasGeometri;
import java.util.Scanner;
public class octagono extends Figuras 
{
    private double perimetro,apotema,area,lado;
    
    public octagono(){}

    public octagono(double perimetro, double apotema, double area, double lado) {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.area = area;
        this.lado = lado;
    }


    public double getPerimetro() {
        return perimetro;
    }


    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public double getApotema() {
        return apotema;
    }


    public void setApotema(double apotema) {
        this.apotema = apotema;
    }


    public double getArea() {
        return area;
    }


    public void setArea(double area) {
        this.area = area;
    }


    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }
    
    Scanner lectura = new Scanner (System.in);

    @Override
    public void calcularArea() 
    {
        area = perimetro * apotema/2;
        System.out.println("El area es "+ area);
    }

    @Override
    public void calcularPerimetro()
    {
        perimetro = lado * 8;
        System.out.println("El perimetro es"+ perimetro );
    }

    
}
