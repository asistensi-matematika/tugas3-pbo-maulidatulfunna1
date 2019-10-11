
package pbo;
public class LinearEquation {
    private int a,b;
    private double c,d,e,f;
    
    public LinearEquation(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
    public LinearEquation( int a, int b, double c, double d, double e ,double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
     public void setB(int b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }
     public void setD(double d) {
         this.d = d;
    }
     public double getE() {
        return e;
    }
    public void setE(double e) {
        this.e = e;
    }
    public double getF() {
        return f;
    }
    public void setF(double f) {
        this.f = f;
    }
    public double getX(){
        return (((e*d)-(b*f))/((a*d)-(b*c)));
    }
     public double getY(){
        return (((a*f)-(e*c))/ ((a*d)-(b*c)));
     }
     public void Output(){
         System.out.println();
         System.out.println("output :" );
         System.out.println("Sistem Persamaannya : ");
     }
     public void persamaannya( int a, int b, double e){
          if(b<0){
             System.out.println(getA()+ "x + " + getB()+ " y = " + getE());
         }
         else if (b>=0){
             System.out.println(getA()+ "x + " + getB()+ " y = " + getE());
         }
         if (d<0){
            System.out.println(getC()+ "x +" + getD()+ "y =" + getF());
     }
     else if(d>=0){
            System.out.println(getC()+ "x + " + getD()+ "y =" + getF());
     }}
     public boolean cekSolusi(){
         if((a*d)-(b*c) ==0)
         return false;
         else 
             return true;
     }
    public void info(){
         System.out.println("\nhasilnya ");
          if (cekSolusi()==true){
             System.out.println("x = " + String.format("%.2f", getX())+ ", y = "+
                      String.format("%.2f", getY()));
             }
         else  {
              System.out.println("sistem tidak punya penyelesaian");
         }}}
         
   

