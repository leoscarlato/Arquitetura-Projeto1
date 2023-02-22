import Mensagens.*;
import Usuarios.*;

public class Main {
    public static void main(String[] args) {

        Usuario autor = new Usuario();
        Usuario destinatario = new Usuario();

        autor.setNome("Leonardo");
        autor.setEmail("leo@gmail.com");
        destinatario.setNome("Carlos");
        destinatario.setEmail("carlos@gmail.com");

        MensagemTexto msg = new MensagemTexto();

        msg.setTexto("Oi, tudo bem?");

        msg.setAutor(autor);
        msg.setDestinatario(destinatario);

        System.out.println(msg);

    }
}