package three.one;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex () {
        this(0.0, 0.0);
    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "("+this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return ((this.real==real) && (this.imag==imag));
    }

    public boolean equals(MyComplex another) {
        return this.equals(another.real, another.imag);
    }

    public double magnitude() {
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real = right.getReal() + this.real;
        this.imag = right.getImag() + this.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex mycomplex = new MyComplex();
        mycomplex.setReal(right.getReal() + this.real);
        mycomplex.setImag(right.getImag() + this.imag);
        return mycomplex;
    }

}
