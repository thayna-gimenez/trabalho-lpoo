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
        Personagem a = null;

        if (personagem_a == 1) {
            if (arma_a == 1) {
                ArmaMago magia_a = new Transmutacao();
                a = new Mago(saude_a, forca_a, destreza_a, magia_a);
            }

            else if (arma_a == 2) {
                ArmaMago psikappa_a = new Psikappa();
                a = new Mago(saude_a, forca_a, destreza_a, psikappa_a);
            }
        }

        else if (personagem_a == 2) {
            if (arma_a == 1) {
                ArmaPaladino espada_a = new Espada();
                a = new Paladino(saude_a, forca_a, destreza_a, espada_a);
            }

            else if (arma_a == 2) {
                ArmaPaladino lanca_a = new Lanca();
                a = new Paladino(saude_a, forca_a, destreza_a, lanca_a);
            }
        }

        else if (personagem_a == 3) {
            if (arma_a == 1) {
                ArmaClerigo martelo_a = new Martelo();
                a = new Clerigo(saude_a, forca_a, destreza_a, martelo_a);
            }

            else if (arma_a == 2) {
                ArmaClerigo maca_a = new Maca();
                a = new Clerigo(saude_a, forca_a, destreza_a, maca_a);
            }
        }

        // criando personagem B

        int personagem_b = scan.nextInt();
        double saude_b = scan.nextDouble();
        double forca_b = scan.nextDouble();
        double destreza_b = scan.nextDouble();
        int arma_b = scan.nextInt();
        Personagem b = null;

        if (personagem_b == 1) {
            if (arma_b == 1) {
                ArmaMago magia_b = new Transmutacao();
                b = new Mago(saude_b, forca_b, destreza_b, magia_b);
            }

            else if (arma_b == 2) {
                ArmaMago psikappa_b = new Psikappa();
                b = new Mago(saude_b, forca_b, destreza_b, psikappa_b);
            }
        }

        else if (personagem_b == 2) {
            if (arma_b == 1) {
                ArmaPaladino espada_b = new Espada();
                b = new Paladino(saude_b, forca_b, destreza_b, espada_b);
            }

            else if (arma_b == 2) {
                ArmaPaladino lanca_b = new Lanca();
                b = new Paladino(saude_b, forca_b, destreza_b, lanca_b);
            }
        }

        else if (personagem_b == 3) {
            if (arma_b == 1) {
                ArmaClerigo martelo_b = new Martelo();
                b = new Clerigo(saude_b, forca_b, destreza_b, martelo_b);
            }

            else if (arma_b == 2) {
                ArmaClerigo maca_b = new Maca();
                b = new Clerigo(saude_b, forca_b, destreza_b, maca_b);
            }
        }

        a.printStatus();
        b.printStatus();

        while (scan.nextInt() != 0) {
            int atacante = scan.nextInt();
            System.out.println();

            if (atacante == 2) {
                a.atacar(b);
                a.printStatus();
                b.printStatus();
                System.out.println();
            }

            else {
                b.atacar(a);
                a.printStatus();
                b.printStatus();
                System.out.println();
            }
        }
    }
}
