package cl.inacap.autos.modelo;

public class Auto {
    private int idAuto;
    private String color;
    private String marca;
    private boolean estado;
    public static final boolean disponible=true;

    public Auto(String color, String marca) {
        this.idAuto = idAuto;
        this.color = color;
        this.marca = marca;
        this.estado = disponible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    @Override
    public String toString() {
        String comprado;
        if(estado==disponible) comprado="Disponible";
        else comprado="No disponible";
        return marca+": "+comprado;
    }
}
