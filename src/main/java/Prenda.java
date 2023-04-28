import java.awt.*;
import java.util.Objects;

class Prenda {
    public Tipo tipo;
    public Material material;

    public Material material() {
        if (material == null) throw new RuntimeException();
        return this.material;
    }

    public void material(Material _material) {
        material = _material;
    }

    public Trama trama;

    public Trama trama() {
        if (trama == null) throw new RuntimeException();
        return this.trama;
    }

    public void trama(Trama _trama) {
        trama = _trama;
    }

    public Color color;

    public Color color() {
        if (color == null) throw new RuntimeException();
        return this.color;
    }

    public Color secondaryColor;

    public Color colorSecundario() {
        return this.secondaryColor;
    }

    public Categoria categoria() { return tipo.categoria(); }

    public Prenda(Tipo _tipo, Material _material, Color _color, Trama _trama, Color _secondaryColor) {
        tipo = _tipo;
        material = _material;
        color = _color;
        trama = _trama;
        secondaryColor = _secondaryColor;
    }
}

class Borrador {
    public Tipo tipo;
    public Material material;

    public Material material() {
        if (material == null) throw new RuntimeException();
        return this.material;
    }

    public void material(Material _material) {
        // validacion contra el tipo
        material = Objects.requireNonNull(_material, "No se ha pasado el material");
    }

    public Trama trama = Trama.LISA;

    public Trama trama() {
        return this.trama;
    }

    public void trama(Trama _trama) {
        if (material == null) throw new RuntimeException("Falta el material");
        // validacion contra el material/tipo
        trama = _trama == null ? Trama.LISA : _trama;
    }

    public Color color;

    public Color color() {
        if (color == null) throw new RuntimeException();
        return this.color;
    }

    public void color(Color _color) {
        if (material == null) throw new RuntimeException("Falta el material");
        // validacion contra el material/tipo
        color = Objects.requireNonNull(_color, "No se ha pasado el color");
    }

    public Color secondaryColor;

    public Color colorSecundario() {
        return this.secondaryColor;
    }

    public void colorSecundario(Color _color) {
        if (material == null) throw new RuntimeException("Falta el material");
        // validacion contra el material/tipo
        secondaryColor = _color;
    }

    public Categoria categoria() { return tipo.categoria(); }

    public Borrador(Tipo _tipo) {
        tipo = Objects.requireNonNull(_tipo, "No se ha pasado el tipo");
    }
    public Prenda crearPrenda() {
        if (material != null && color != null) {
            return new Prenda(tipo, material, color, trama, secondaryColor);
        }
        throw new RuntimeException("El borrador es invalido");
    }
}

enum Material {
    ALGODON
}

enum Trama {
    LISA,
    RAYADA,
    CON_LUNARES,
    A_CUADROS,
    ESTAMPADO
}

enum Categoria {
    PARTE_SUPERIOR,
    CALZADO,
    PARTE_INFERIOR,
    ACCESORIOS
}
