public class Inquilino  extends Pessoa{
    private double rendaMensal;



    public Inquilino() {
    }

    public Inquilino(String cpf, String nome, String telefone,double rendaMensal) {
        super(cpf, nome, telefone);
        this.rendaMensal = rendaMensal;

    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    @Override
    public void mostrarDadosPessoais() {
        System.out.println("\nRENDA MENSAL: "+ this.rendaMensal+"\nCPF: "+ this.getCpf()+
                "\nNOME :"+this.getNome()+"\nTELEFONE: "+this.getTelefone()+"\n");

    }
}
