package aula_16_05;

public class veiculo {

    private String marca;
    private String modelo;
    private int npass;
    private int qlitros;
    private String cor;

    public veiculo(String marca, String modelo, int npass, int qlitros, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.npass = npass;
        this.qlitros = qlitros;
        this.cor = cor;
    }

    public void mostrarCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Npass: " + npass);
        System.out.println("Qlitros: " + qlitros);
        System.out.println("Cor: " + cor);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNpass() {
        return this.npass;
    }

    public void setNpass(int npass) {
        this.npass = npass;
    }

    public int getQlitros() {
        return this.qlitros;
    }

    public void setQlitros(int qlitros) {
        this.qlitros = qlitros;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
