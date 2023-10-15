package Iphone;

import Iphone.Internet.navegadorInternet;
import Iphone.Musica.ReprodutorMusical;
import Iphone.Telefone.aparelhoTelefonico;

public class smartPhone implements navegadorInternet, ReprodutorMusical, aparelhoTelefonico {

    @Override
    public void ligar() {
        System.err.println("Ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada em execução");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz.");
     }

    @Override
    public void tocar() {
        System.err.println("Tocando música selecionada.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Tocando música selecionada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando.");
    }
}
    

