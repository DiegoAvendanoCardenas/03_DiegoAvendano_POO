
package S07v2_03;


public class persona_03 {
    //Atributos
    String nombre;
    int edad;
    String sexo;
    double altura;
    
    
    //Metodos
    public void correr(){
        System.out.println("salgo en la mañana a correr");
    }
    public void comer(){
        System.out.println("me gusta comer");
    }
    //SobreCarga de metodos
    public void metodos1 (){
        
    }
    public void metodos1 (int a){
        
    }
    public void metodos1 (int a,int b){
        
    }
    
    
    //Metodos con valores de retorno
    public String frase(){
        System.out.println("soy el mejor :v");
        return "";
    }
    
    public int numeroDeHermanos(int nrohermano){
        System.out.println("tengo "+nrohermano +" Hermanos");
        return 0;
    }
    
    public double miAltura (){
        return 0.0;
    }
    
    //Metodos con parametros y argumentos
    
    public void hola(int a , int b){
     
    }
    
    public void caminar(String a , String b){
        
    }
}
