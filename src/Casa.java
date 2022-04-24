public class Casa extends Imovel{
    private String quadra;
    private String lote;

    public Casa() {
    }

    public Casa(String endereco, double areaConstruida, int vagaGaragem, double valorAluguel,
                Proprietario proprietario, String quadra, String lote) {
        super(endereco, areaConstruida, vagaGaragem, valorAluguel, proprietario);
        this.quadra = quadra;
        this.lote = lote;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public void mostarDadosImovel() {
        System.out.println("\nEndereco: "+ this.getEndereco()+"\nÁrea construida: " +this.getAreaConstruida()
                + "\nVagas garagem: "
                +this.getVagaGaragem()+
                "\nValor Aluguel: "+ this.getValorAluguel()+ "\nProprietário: "+this.getProprietario().getNome()+
                "\nQuadra: " +
                this.quadra+ "\nLote: "+this.lote +
                "\nProprietário: " + this.getProprietario().getNome()
                );

    }
}
