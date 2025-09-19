import Classes.Cliente;
import Classes.Vendedor;

public class loja {

    public static void main(String[] args) {
        
        Cliente Fernanda = new Cliente("Fernanda", "000.999.999", 30);

        Fernanda.ExibirInfor();

        Vendedor João = new Vendedor("João","000.555.777",90); 

        João.ExibirInfor();
    }
}