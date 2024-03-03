public class Calcula {
    Orcamento orcamento = new Orcamento();

    // Passar o orçamento e o imposto

    public Calcula(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public double calcularImposto(double taxa) {
        return orcamento.getVal() * taxa;
    }
}
