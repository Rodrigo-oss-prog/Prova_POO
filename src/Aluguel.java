public class Aluguel{
    private String inicioContrato;
    private String fimContrato;
    private int diaPagamento;
    //private Proprietario proprietario;
    private Imovel imovel;
    private Inquilino inquilino;
    private Corretor corretor;

    public Aluguel() {
    }

    public Aluguel(String inicioContrato, String fimContrato, int diaPagamento, Imovel imovel,
                   Inquilino inquilino, Corretor corretor) {
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.diaPagamento = diaPagamento;
        this.inquilino = inquilino;
        this.corretor = corretor;
        this.imovel = imovel;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }

    public int getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(int diaPagamento) {

        this.diaPagamento = diaPagamento;
    }
    //public Proprietario getProprietario() {
      //  return proprietario;
    //}

   // public void setProprietario(Proprietario proprietario) {
        //this.proprietario = proprietario;
    //}


    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void mostraDadosAluguel(){
        System.out.println("\nInício do contrato: " + this.getInicioContrato()+"\nFim do contrato: "
                +this.getFimContrato()+"\nDia do Pagamento: " +this.getDiaPagamento()+
                "\nProprietário do imóvel: "+ imovel.getProprietario().getNome()+
                "\nNome do inquilino: " + inquilino.getNome()+"\nNome do corretor: "+corretor.getNome()+"\n");
    }
}
