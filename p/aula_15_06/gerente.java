package aula_15_06;

public class gerente extends funcionario {
    private double aumento = 1500;

    public gerente(double salario, double aumento) {
        super(salario);
        this.aumento = aumento;

    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + aumento;
    }
}
