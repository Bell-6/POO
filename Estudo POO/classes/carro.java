
public class carro{
    private String marca;
    private String modelo;
    private int ano;

    public carro(String marca, String modelo, int ano ){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

  public void exibirInfor(){
    System.out.println("---- Informações Carro ----");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
  }

  public void ligar(){
    System.out.println("Seu carro foi ligado!");

  }
}