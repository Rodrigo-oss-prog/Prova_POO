import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario("216.458.030-11", "J", "888888", "BB",
                "9998-780");
        Inquilino inquilino = new Inquilino("445.556.887-77", "Talia Santos", "(16)88997777",
                4500);
        Corretor corretor = new Corretor("222.443.876-33", "Joas James", "(16)99887766",
                "6500-43"
                , 1500);
        Casa casa = new Casa("Rua: A", 154.2, 4, 2000, proprietario,
                "10", "z");
        Aluguel aluguel = new Aluguel("01/07/2001", "31/06/2005", 5,
                casa, inquilino, corretor);
        Apartamento apartamento = new Apartamento("Rua B", 254.2, 2, 4500,
                proprietario, aluguel, "EDuar", 4);


        List<Imovel> imoveis = new ArrayList<>();

        imoveis.add(casa);
        imoveis.add(apartamento);

        System.out.println("***Mostrar Dados pessoais***");
        System.out.println("Proprietário");
        proprietario.mostrarDadosPessoais();
        System.out.println("Inquilino");
        inquilino.mostrarDadosPessoais();

        System.out.println("Corretor");
        corretor.mostrarDadosPessoais();

        System.out.println("***Dados do Aluguel***");
            aluguel.mostraDadosAluguel();

        System.out.println("Dados dos imóveis [Casa-Apartamento]");
        for (Imovel i : imoveis) {
            i.mostarDadosImovel();

        }
    }
}
