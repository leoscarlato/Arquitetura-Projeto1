import Mensagens.*;
import Usuarios.*;

public class Main {
    public static void main(String[] args) {

        Usuario autor = new Usuario("Leo", "leo@gmail.com");
        Usuario destinatario = new Usuario("Ale", "ale@gmail.com");

        MensagemTexto mensagemTexto = new MensagemTexto("Olá, tudo bem?", destinatario, autor);
        MensagemArquivo mensagemArquivo = new MensagemArquivo("Arquivo", "C:\\Users\\Leo\\Desktop\\Arquivo", destinatario, autor, "Olá, tudo bem?");

        System.out.println(mensagemTexto);
        System.out.println("");
        System.out.println(mensagemArquivo);

    }
}