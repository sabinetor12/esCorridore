import java.util.*;
public class SwagThread extends Thread{
    private int conta=0;
    private String nome;
    static ArrayList<String> podio = new ArrayList<String>();
    public SwagThread(String nome) {
        this.nome = nome;
    }


    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void run(){
        for(int i = 0; i < 100;i++){
            conta++;
            System.out.println(nome + " è a "+ i);
        }
        podio.add(nome);
        System.out.println(nome + " è un king");
    }

}