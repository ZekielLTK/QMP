import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Prenda prenda = new Prenda (
                new Zapato(),
                Material.ALGODON,
                Color.black,
                Trama.LISA,
                null
        );
        Atuendo atuendo = new Atuendo();
        atuendo.agregar(prenda);
        System.out.println(prenda);

        // Rompen
        // Prenda prenda2 = new Prenda(new Zapato(), null, "Tela", "Rojo", null);
        // Prenda prenda3 = new Prenda(new Zapato(), Categoria.PARTE_INFERIOR, "Tela", "Rojo", null);
    }
}