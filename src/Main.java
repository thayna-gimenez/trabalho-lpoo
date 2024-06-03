import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // criando personagem A

        int personagem_a = scan.nextInt();
        double saude_a = scan.nextDouble();
        double forca_a = scan.nextDouble();
        double destreza_a = scan.nextDouble();
        int arma_a = scan.nextInt();

        if (personagem_a == 1) {
            if (arma_a == 1) {
                Arma magia_a = new Transmutacao();
                Personagem a = new Mago(saude_a, forca_a, destreza_a, magia_a);
            }

            else if (arma_a == 2) {
                Arma psikappa_a = new Psikappa();
                Personagem a = new Mago(saude_a, forca_a, destreza_a, psikappa_a);
            }
        }

        else if (personagem_a == 2) {
            if (arma_a == 1) {
                Arma espada_a = new Espada();
                Personagem a = new Paladino(saude_a, forca_a, destreza_a, espada_a);
            }

            else if (arma_a == 2) {
                Arma lanca_a = new Lanca();
                Personagem a = new Paladino(saude_a, forca_a, destreza_a, lanca_a);
            }
        }

        else if (personagem_a == 3) {
            if (arma_a == 1) {
                Arma espada_a = new Espada();
                Personagem a = new Paladino(saude_a, forca_a, destreza_a, espada_a);
            }

            else if (arma_a == 2) {
                Arma maca_a = new Maca();
                Personagem a = new Paladino(saude_a, forca_a, destreza_a, maca_a);
            }
        }

        a.printStatus();

        // criando personagem B

        int personagem_b = scan.nextInt();
        double saude_b = scan.nextDouble();
        double forca_b = scan.nextDouble();
        double destreza_b = scan.nextDouble();
        int arma_b = scan.nextInt();

        if (personagem_b == 1) {
            if (arma_b == 1) {
                Arma magia_b = new Transmutacao();
                Personagem b = new Mago(saude_b, forca_b, destreza_b, magia_b);
            }

            else if (arma_b == 2) {
                Arma psikappa_b = new Psikappa();
                Personagem b = new Mago(saude_b, forca_b, destreza_b, psikappa_b);
            }
        }

        else if (personagem_b == 2) {
            if (arma_b == 1) {
                Arma espada_b = new Espada();
                Personagem b = new Paladino(saude_b, forca_b, destreza_b, espada_b);
            }

            else if (arma_b == 2) {
                Arma lanca_b = new Lanca();
                Personagem b = new Paladino(saude_b, forca_b, destreza_b, lanca_b);
            }
        }

        else if (personagem_b == 3) {
            if (arma_b == 1) {
                Arma espada_b = new Espada();
                Personagem b = new Paladino(saude_b, forca_b, destreza_b, espada_b);
            }

            else if (arma_b == 2) {
                Arma maca_b = new Maca();
                Personagem b = new Paladino(saude_b, forca_b, destreza_b, maca_b);
            }
        }

        b.printStatus();
    }
}
