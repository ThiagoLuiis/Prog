public class Livro {
    private String titulo;
    private String autor;
    private String dataPublicacao;
    private double preco;


    public Livro(String titulo, String autor, String dataPublicacao, double preco ) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.preco = preco;
    }


    public String toString() {
        return "Título: " + titulo 
        + "\nAutor: " + autor 
        + "\nData 1ª Publicação: " + dataPublicacao 
        + "\nPreço: R$" + preco;
    }


}