package classes;

public class livro{
    private String titulo;
    private String autor;
    private int paginas;

        public livro( String autor, int paginas){
        this.autor = autor;
        this.paginas = paginas;
}

public void exibirDetalher(){
    System.out.println("---- Informações Livro ----");
    System.out.println("Título: "+ titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Número de páginas: " + paginas);
}

public void ler(){
    System.out.println("Você começou a ler "+ titulo + "de " + autor + ".");

}

public void setTitulo(String titulo){
    this.titulo = titulo;
}
}