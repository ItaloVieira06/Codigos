package aula_15_06;

public abstract class funcionario {
    private double salario;

    public funcionario(double salario) {
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacao();

}
