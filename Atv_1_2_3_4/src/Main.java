public class Main {
    public static void main(String[] args) {


        //Questão 1
        Livro livroExemplo = new Livro("Arsene Lupin - O ladrão de Casaca", "Maurice Leblanc", "10/06/1907", 39.90); //10 de junho de 1907
        System.out.println("\nResposta Questão 1");
        System.out.println("Dados do Livro:");
        System.out.println(livroExemplo);
    

        //Questão 2
        Pessoa pessoaExemplo = new Pessoa("Thiago Luis", 21, "Rua de Pedra 787", "123.456.789-01");
        System.out.println("\nResposta Questão 2");
        System.out.println("Informações da Pessoa:");
        System.out.println(pessoaExemplo);

        //Questão 3
        Universidade universidadeExemplo = new Universidade("Una","Thiago Luis" , "Estrutura de Dados e Análise de Algoritmos", "Daniel Paiva");
        System.out.println("\nResposta Questão 3");
        System.out.println("Informações da Universidade");
        System.out.println(universidadeExemplo);

        //Questão 4 
        cachorro cachorroExemplo = new cachorro(1, "Doméstico", "Terrestre", "Pingado", "Pincher", 7);
        System.out.println("\nResposta Questão 4");
        System.out.println("Dados do Cachorro:");
        System.out.println(cachorroExemplo);

    }
}

