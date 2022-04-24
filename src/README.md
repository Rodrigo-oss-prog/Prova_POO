# PRIMEIRA PROVA POO - HERANÇA, POLIMORFISMO E ASSOCIAÇÃO ENTRE CLASSES.


```` java
    public class Hello{
        public static void main(String args[]){
            System.out.println("Hello Word!");
        }

    }           
````
Prova nº 1  de POO ministrada pelo Professor Pablo Dalbem -IFSP-São Carlos SP


# Modelagem simples de um sistema imobiliário

![POO](/home/rsval-security/Imagens/modelagem_Prova_POO.png)
[POO](https://drive.google.com/file/d/1t04psWjL2dtKGUodOuHXRSHZ1HJHTaq2/view?usp=sharing)

Outros conceitos combrados nesta prova foram, a multiplicidade e a navegabilidade entre as 
entidades. Neste exercício foi fundamental entender o conceito de herença, 
para aplicar o método abstrato da classe abstrata.

trecho de um código:

````java

public abstract class  Imovel{


    public abstract void mostarDadosImovel();
    
}

public class Casa extends Imovel{
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
```` 

## Obs:

No código esta comentado entidades inseridas que não respeitavam o conceito de
'é um'.Poderiam serem inseridas só aplicando o conceito de associação entre classes,
porém não fez sentido 'Aluguel é um imóvel.

Alguns valores foram inseridos genéricamente a fim de observar o retorno.
'


