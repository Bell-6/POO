import classes.pessoa;

public class main {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();

        p1.setNome("Maria");
        p1.setIdade(30);
        p1.setAltura(1.69);

        System.out.println("---- Dados usando Get ----");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
        
        p1.exibirInfo();
        }
    }

