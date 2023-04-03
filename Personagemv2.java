import java.beans.PersistenceDelegate;

public class Personagemv2 {
    String nome;
    private int fome = 0;
    private int energia = 10;
    private int sono = 0;
    Personagemv2(String nome, int energia){
        this(nome, energia, 0, 0 );
    }
    Personagemv2(int sono, int energia){
        this(null, energia, 0, sono);
    }
    
    
    
    
    Personagemv2(){

    }
    Personagemv2(String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;
        
    }

    //isso é um contrutor
    Personagemv2(int energia, int fome, int sono){
        //shadowing(sombreamento)
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }
    
    void comer(){
        if(fome >= 1){
            System.out.printf("%s esta comendo...%n", nome);
            fome --;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.printf("%s nao esta com fome");
        }
    }
    void cacar(){
        if (energia >= 2){
            System.out.printf("%s esta caçando...%n", nome);
            energia--;
        }
       else{
        System.out.printf("%s sem energia para caçar");
        energia -= 2; // energia = energia -2
       }
    fome = Math.min(fome + 1,10);
    sono = Math.min(sono + 1, 10);
    }
    void dormir(){
        if(sono >= 1){
            System.out.printf("%s esta dormindo...%n", nome);
            --sono;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.printf("%s esta sem sono....%n");
        }
    }
    String obterEstado(){
        String estado = String.format(
            "nome: %s, energia: %d, fome: %d, sono: %d",
            nome,
            energia,
            fome,
            sono
        );
        return estado;
    }

}
