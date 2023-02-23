package Mensagens;

import Usuarios.Usuario;

public class MensagemArquivo extends Mensagem {

    private String nomeArquivo;
    private String caminhoArquivo;
    

    public MensagemArquivo(String nomeArquivo, String caminhoArquivo, Usuario destinatario, Usuario autor,  String texto) {
        super(texto, destinatario, autor);
        this.nomeArquivo = nomeArquivo;
        this.caminhoArquivo = caminhoArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public String toString() {
        return "Autor: " + getAutor() + "\nDestinatario: " + getDestinatario() + "\nMensagem: " + getTexto() + "\nNome do Arquivo: " + getNomeArquivo() + "\nCaminho do Arquivo: " + getCaminhoArquivo();
    }
}
