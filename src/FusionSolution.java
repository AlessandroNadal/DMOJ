class Personaje {
    int fuerza;
    int velocidad;

    Personaje(int fuerza, int velocidad) {
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "fuerza=" + fuerza + ", velocidad=" + velocidad;
    }
}

class Fusion {
    public Personaje fusionar(Personaje goten, Personaje trunks) {
        return new Personaje(goten.fuerza + trunks.fuerza, goten.velocidad + trunks.velocidad);
    }
    // escriu el codi aqui
}

public class FusionSolution {

    public static void main(String[] args) {

        Personaje goku = new Personaje(100, 100);
        Personaje vegeta = new Personaje(90, 90);
        Personaje goten = new Personaje(80, 100);
        Personaje trunks = new Personaje(70, 90);

        Personaje gotenks = new Fusion().fusionar(goten, trunks);
        Personaje gogeta = new Fusion().fusionar(goku, vegeta);

        System.out.println("Goku: " + goku);
        System.out.println("Vegeta: " + vegeta);
        System.out.println("Goten: " + goten);
        System.out.println("Trunks: " + trunks);
        System.out.println("Gotenks: " + gotenks);
        System.out.println("Gogeta: " + gogeta);
    }
}
