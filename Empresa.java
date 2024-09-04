import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void atualizarSalario(String nome, double novoSalario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionario.setSalario(novoSalario);
                return;
            }
        }
        System.out.println("Funcionário com o nome " + nome + " não encontrado.");
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0.0;
        for (Funcionario funcionario : funcionarios) {
            salarioTotal += funcionario.getSalario();
        }
        return salarioTotal;
    }

    public List<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario f1 = new Funcionario("João", "Desenvolvedor", 5000.00);
        Funcionario f2 = new Funcionario("Maria", "Designer", 4500.00);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);

        System.out.println("Funcionários cadastrados:");
        for (Funcionario f : empresa.listarFuncionarios()) {
            System.out.println(f);
        }

        empresa.atualizarSalario("João", 5500.00);
        System.out.println("Salário atualizado do João:");
        for (Funcionario f : empresa.listarFuncionarios()) {
            System.out.println(f);
        }

        double salarioTotal = empresa.calcularSalarioTotal();
        System.out.println("Salário total da empresa: R$ " + salarioTotal);
    }
}