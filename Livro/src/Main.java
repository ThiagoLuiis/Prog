public class Main {
    public static void main(String[] args) {


        //Questão 1
        Livro livroExemplo = new Livro("Arsene Lupin - O ladrão de Casaca", "Maurice Leblanc", "10/06/1907", 39.90); //10 de junho de 1907

        System.out.println("Dados do Livro:");
        System.out.println(livroExemplo);
    

        //Questão 2
        Pessoa pessoaExemplo = new Pessoa("Thiago Luis", 21, "Rua de Pedra 787", "123.456.789-01");
        System.out.println("\nInformações da Pessoa:");
        System.out.println(pessoaExemplo);
    }
}