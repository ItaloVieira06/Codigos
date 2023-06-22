package aula_15_06;

public class garcom extends funcionario {

    private double comissão;

    public garcom(double salario, double comissão) {
        super(salario);
        this.comissão = comissão;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + comissão;
    }

}
