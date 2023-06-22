package aula_22_05;

public class principal {
  public static void main(String[] args) {
    animal macaco = new animal("macaco", 1.50, 4, "albino", "floresta", 50.0);
    macaco.dados();

    peixe peixe = new peixe("pirarucu", 2.00, 0, "azul", "amazônia", 10.0, "gostoso");
    peixe.dados();

    mamifero mamifero = new mamifero("babuíno", 1.60, 4, "branco", "floresta", 8.0, "frutas");
    mamifero.dados();

  }
}
