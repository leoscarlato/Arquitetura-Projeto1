package Mensagens;

import Usuarios.Usuario;

public class MensagemTexto {

    private String texto;
    private Usuario destinatario;
    private Usuario autor;

    public void MensagemTexto(String texto, Usuario destinatario, Usuario autor) {
        this.texto = texto;
        this.destinatario = destinatario;
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Autor: " + getAutor() + "\nDestinatario: " + getDestinatario() + "\nMensagem: " + getTexto();
    }
}
