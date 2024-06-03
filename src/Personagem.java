public abstract class Personagem {
    private String nome;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    // construtor 
    public Personagem(String nome, double saude, double forca, double destreza, Arma arma) {
        this.nome = nome;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    // métodos

    public void printStatus() {
        
        if (this.estaMorto() == true) {
            System.out.printf("%s [Morreu, Forca: %.1f, Destreza: %.1f, %s]%n", this.nome, this.forca, this.destreza, this.arma.getNome());
        }

        else {
            System.out.printf("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]%n", this.nome, this.saude, this.forca, this.destreza, this.arma.getNome());
        }
     
    }

    public void atacar(Personagem b) {
        if (this.estaMorto() ==  true) {
            System.out.printf("O %s não consegue atacar, pois está morto.%n", this.nome);
            
            this.printStatus();
            b.printStatus();
        }

        else {
            System.out.printf("O %s ataca o %s com %s.%n", this.nome, b.nome, this.arma);

            if (b.estaMorto() == true) {
                System.out.printf("Pare! O %s já está morto!%n", b.nome);
                
                this.printStatus();
                b.printStatus();
            } 

            else if (this.forca > b.forca && this.destreza > b.destreza) {
                b.recebeDano(this.calculaDano());
                System.out.printf("O ataque foi efetivo com %.1f pontos de dano!%n", this.calculaDano());
                
                this.printStatus();
                b.printStatus();
            }

            else if (this.forca < b.forca || this.destreza < b.destreza) {
                this.recebeDano(b.calculaDano());
                System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!%n", b.calculaDano());
                
                this.printStatus();
                b.printStatus();
            }

            else if (this.forca == b.forca || this.destreza == b.destreza) {
                System.out.printf("O ataque foi defendido, ninguem se machucou!%n");
                
                this.printStatus();
                b.printStatus();
            }

        }
    }

    private double calculaDano() {    
        return this.forca * this.arma.getModificadorDano();
    }

    private void recebeDano(double pontosDano) {
        this.saude -= pontosDano;
    }

    private boolean estaMorto() {
        if (this.saude < 1.0) {
            return true;
        }

        else { 
            return false;
        }
    }
}