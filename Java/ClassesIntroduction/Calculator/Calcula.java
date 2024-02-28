package calcula;

public class Calcula {
    float a;
    float b;
    double k;
 
    public Calcula (int x,int y){
        a=x;
        b=y;
        k=0;
  }
    public double suma (int x,int y){
    a=x;
    b=y;
    k=a+b;
     return k; 
    }
    public double resta (int x,int y){
    a=x;
    b=y;
    k=a-b;
     return k; 
    }
    public double multiplicacion (int x,int y){
    a=x;
    b=y;
    k=a*b;
     return k; 
    }
    public double division (int x,int y){
    a=x;
    b=y;
    k=(float)a/(float)b;
     return k; 
    }
    public double potencia (int x,int y){
    
    a = x;
    b = y;
    k = Math.pow(a,b);
        return k;
    }
    public void imprimirsolucion (){
          System.out.println("Resultado" + k);
        
    }
    
  public static void main(String[] args) {
  Calcula operario = new Calcula (0,0);
  operario.suma(25,10);
  operario.imprimirsolucion();
  
 //loat result = operario.suma (25,10);
//System.out.println("" + imprimirresultado);
  
operario.resta(100,25);
 operario.imprimirsolucion();
 
//result = operario.resta(100,25);
//System.out.println("" + imprimirresultado);
  
operario.multiplicacion(6,10);
operario.imprimirsolucion();

//result = operario.multiplicacion(6,10);
//System.out.println("" + imprimirresultado);
  
operario.division(10,3);
operario.imprimirsolucion();

//result = operario.division(10,3);
//System.out.println("" + imprimirresultado);
  
operario.potencia (2,3);
operario.imprimirsolucion();

//double resultado = operario.potencia (2,3);
//System.out.println("" + imprimirresultado);
    }
    
}
