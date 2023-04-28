interface Tipo {
    public Categoria categoria();
}

class Zapato implements Tipo {
    public Categoria categoria()   {
        return Categoria.CALZADO;
    }
}

class Camisa implements Tipo {
    public Categoria categoria()   {
        return Categoria.PARTE_SUPERIOR;
    }
}

class Pantalon implements Tipo {
    public Categoria categoria()   {
        return Categoria.PARTE_INFERIOR;
    }
}
