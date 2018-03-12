package aula02.Complex;

public class LibComplex {
    public static Complex add(Complex z1, Complex z2){
        return new Complex(z1.x + z2.x, z1.y + z2.y);
    }

    public static Complex sub(Complex z1, Complex z2){
        return new Complex(z1.x - z2.x, z1.y - z2.y);
    }
    public static Complex mul(Complex z1, Complex z2){
        return new Complex(z1.x *z2.x - z1.y * z2.y, z1.x *z2.x + z1.y * z2.y);
    }

    public static Complex div(Complex z1, Complex z2){
        double d = z2.x *z2.x + z2.y * z2.y;
        return new Complex((z1.x * z2.x + z1.y * z2.y) / d,
                (z1.y * z2.x - z1.x * z2.y) / d);
    }

    public static String toString(Complex z){
        return z.x + "+" + z.y + "i";
    }
}
