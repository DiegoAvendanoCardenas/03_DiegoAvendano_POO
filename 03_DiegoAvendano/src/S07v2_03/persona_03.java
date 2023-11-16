
package S07v2_03;


public class persona_03 {
    //Atributos 03_DiegoAvendaño
    String nombre;
    int edad;
    String sexo;
    double altura;
    
    
    //Metodos 03_DiegoAvendaño
    public void aprender(){
        System.out.println("Aprender nuevas cosas");
    }
    
    public void correr(){
        System.out.println("salgo en la mañana a correr");
    }
    public void comer(){
        System.out.println("me gusta comer");
    }
    
    
    //SobreCarga de metodos 03_DiegoAvendaño
    public void metodos1 (){
        
    }
    public void metodos1 (int a){
        
    }
    public void metodos1 (int a,int b){
        
    }
    
    
    //Metodos con valores de retorno 03_DiegoAvendaño
    public String frase(String saludo){
        System.out.println(saludo);
        return "";
    }
    
    public int numeroDeHermanos(int nrohermano){
        System.out.println("tengo "+nrohermano +" Hermanos");
        return 0;
    }
    
    public double miAltura (){
        return 0.0;
    }
    
    //Metodos con parametros y argumentos 03_DiegoAvendaño
    
    public void hola(int a , int b){
        
    }
    
    public void caminar(String a , String b){
        
    }
}
