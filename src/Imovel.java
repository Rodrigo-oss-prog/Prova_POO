public abstract class Imovel {
    private String endereco;
    private double areaConstruida;
    private int vagaGaragem;
    private double valorAluguel;
    private Proprietario proprietario;
    //private Aluguel aluguel;

    public Imovel() {
    }

    public Imovel(String endereco, double areaConstruida, int vagaGaragem, double valorAluguel,
                  Proprietario proprietario) {
        this.endereco = endereco;
        this.areaConstruida = areaConstruida;
        this.vagaGaragem = vagaGaragem;
        this.valorAluguel = valorAluguel;
        this.proprietario = proprietario;
        //this.aluguel = aluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getVagaGaragem() {
        return vagaGaragem;
    }

    public void setVagaGaragem(int vagaGaragem) {
        this.vagaGaragem = vagaGaragem;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    /*public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }
*/
    public abstract void mostarDadosImovel();
}
