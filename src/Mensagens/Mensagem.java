package Mensagens;

import Usuarios.Usuario;

public abstract class Mensagem {

    private String texto;
    private Usuario destinatario;
    private Usuario autor;

    public Mensagem(String texto, Usuario destinatario, Usuario autor) {
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
}
