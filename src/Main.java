import Mensagens.*;
import Usuarios.*;

public class Main {
    public static void main(String[] args) {

        Usuario autor = new Usuario("Leo", "leo@gmail.com");
        Usuario destinatario = new Usuario("Ale", "ale@gmail.com");

        MensagemTexto mensagemTexto = new MensagemTexto("Olá, tudo bem?", destinatario, autor);
        MensagemArquivo mensagemArquivo = new MensagemArquivo("Dados.csv", "C:\\Users\\Leo\\Desktop\\Dados.csv", destinatario, autor, "Segue arquivo que te falei mais cedo.");

        System.out.println("Mensagem de texto: ");
        System.out.println(mensagemTexto);

        System.out.println("");
        System.out.println("");

        System.out.println("Mensagem de arquivo: ");
        System.out.println(mensagemArquivo);

    }
}