public class Apartamento extends Imovel{
    private String nomeEdificio;
    private int andar;

    public Apartamento() {
    }

    public Apartamento(String endereco, double areaConstruida, int vagaGaragem, double valorAluguel,
                       Proprietario proprietario, Aluguel aluguel, String nomeEdificio, int andar) {
        super(endereco, areaConstruida, vagaGaragem, valorAluguel, proprietario);
        this.nomeEdificio = nomeEdificio;
        this.andar = andar;
    }


    public String getNomeEdificio() {
        return nomeEdificio;
    }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override
    public void mostarDadosImovel() {
        System.out.println("\nEndereco: "+ this.getEndereco()+"\nÁrea construida: "+ this.getVagaGaragem()+
                "\nValor Aluguel: "+ this.getValorAluguel()+ "\nproprietário: "+ "\nNome edifício: " +
                this.nomeEdificio+ "\nAndar: "+this.andar +
                "\nProprietário: " + this.getProprietario().getNome());
    }
}
