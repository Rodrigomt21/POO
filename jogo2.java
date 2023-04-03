import java.util.Random;
public class jogo2{
    public static void main(String[] args)throws Exception {
        //Personagem cacador = new Personagem();
        var cacador = new Personagemv2();
        cacador.nome = "Marcola";
        var gerador = new Random();
        //0 = caçar
        //1 = comer
        //2 = dormir
        while(true){
            //sortear um valor no intervalo [0,2]
            //usar u switch/case para decidir o que fazer
            int escolha = gerador.nextInt(3);
            switch(escolha){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;  
            }
            System.out.println(cacador.obterEstado());
            System.out.println("*********************");
            Thread.sleep(10000);

        }
    }
}