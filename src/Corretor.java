public class Corretor extends Pessoa{
    private String cresci;
    private double comissao;

    public Corretor() {
    }

    public Corretor(String cpf, String nome, String telefone, String cresci, double comissao) {
        super(cpf, nome, telefone);
        this.cresci = cresci;
        this.comissao = comissao;
    }

    public String getCresci() {
        return cresci;
    }

    public void setCresci(String cresci) {
        this.cresci = cresci;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public void mostrarDadosPessoais() {
        System.out.println("\nCPF: "+this.getCpf()+"\nNOME: "+ this.getNome()+"" +
                "\nTELEFONE: "+this.getTelefone()
                +"\nCRESCI: "+ this.cresci+"\nComissão: "+ this.comissao+"\n");


    }
}
