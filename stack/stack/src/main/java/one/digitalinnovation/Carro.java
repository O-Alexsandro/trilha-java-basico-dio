package one.digitalinnovation;

public class Carro {

    String marca;
    public java.lang.String getMarca() {
        return marca;
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Carro carro = (Carro) object;
        return java.util.Objects.equals(marca, carro.marca);
    }
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), marca);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
    
}
