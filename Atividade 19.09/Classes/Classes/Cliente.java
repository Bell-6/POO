package Classes;

public class Cliente {
    // Atributos da classe Cliente
    private String nome;
    private String CPF;
    private int idade;

    // Construtor da classe Cliente
    public Cliente(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public void ExibirInfor() {
        System.out.println("-------- Cliente --------");
        System.out.println("Nome: " + this.nome + "\n" +
                           "CPF: " + this.CPF + "\n" +
                           "Idade: " + this.idade);
        System.out.println();
    }
}
