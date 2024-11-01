import java.util.List;
import java.util.ArrayList;

public class Banco {
    private String nome;
    private List<Conta> contas;

    
    public Banco(){
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarContas(){
        System.out.println("Olá, seja bem vindo ao " + this.nome);
        System.out.println("-----------------------");
        if(!contas.isEmpty()){
            System.out.println("Estas são as contas que possuímos atualmente");
            for (Conta conta : contas) {
                System.out.println(conta);
            }
        }else{
            System.out.println("Não possuímos contas cadastradas no momento.");
        }
    }


    
    
}