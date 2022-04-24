public class Proprietario extends Pessoa{
    private String banco;
    private String conta;


    public Proprietario() {
    }

    public Proprietario(String cpf, String nome, String telefone, String banco, String conta) {
        super(cpf, nome, telefone);
        this.banco = banco;
        this.conta = conta;

    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public void mostrarDadosPessoais() {
        System.out.println("\nCPF: "+this.getCpf()+"\nNOME: "+ this.getNome()+"" +
                "\nTELEFONE: "+this.getTelefone()
                    +"\nBANCO: "+ this.banco + "\nCONTA: "+ this.conta+"\n");

    }
}
