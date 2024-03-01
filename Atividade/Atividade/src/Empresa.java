

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private static List<Funcionario> Funcionario;

    // Construtor
    public Empresa() {
        Empresa.Funcionario = new ArrayList<>();
    }

    // Método para adicionar funcionários
    public static void adicionarFuncionario(Funcionario funcionario) {
        Funcionario.add(funcionario);
    }

    // Método para calcular a folha salarial total
    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario f : Funcionario) {
            total += f.calcularSalario();
        }
        return total;
    }

    public List<Funcionario> getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        Funcionario = funcionario;
    }

    public Empresa(List<Funcionario> funcionario) {
        Funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "\nEmpresa [Funcionario=" + Funcionario + "]";
    }

}