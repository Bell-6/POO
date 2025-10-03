import classes.livro;

public class main {
    public static void main(String[] args) {
        livro livro1 = new livro("Holly black", 320); 
        livro1.setTitulo("aiaiaiai");

        livro1.ler();

        livro1.setTitulo("Principe cruel");
        livro1.ler();
    }
}


