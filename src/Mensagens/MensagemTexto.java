package Mensagens;

import Usuarios.Usuario;

public class MensagemTexto extends Mensagem{

    public MensagemTexto(String texto, Usuario destinatario, Usuario autor) {
        super(texto, destinatario, autor);
    }

    @Override
    public String toString() {
        return "Autor: " + getAutor() + "\nDestinatario: " + getDestinatario() + "\nMensagem: " + getTexto();
    }
}
