package Principal;

import org.jetbrains.annotations.NotNull;

public class Kinder {
    String nombreJuguete,tipo,nombreColeccion,añoColeccion,descripcion,instrucciones;
    int numeroPiezas;
    double  precio;

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public boolean setNombreJuguete(@NotNull String nombreJuguete) {
        if (!nombreJuguete.isEmpty()){
            this.nombreJuguete = nombreJuguete;
            return  true;
        }
        else return false;

    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(@NotNull String tipo) {
        if (!tipo.isEmpty()){
            this.tipo = tipo;
            return  true;
        }
        else return false;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public boolean setNombreColeccion(@NotNull String nombreColeccion) {
        if (!nombreColeccion.isEmpty()){
            this.nombreColeccion = nombreColeccion;
            return  true;
        }
        else return false;
    }

    public String getAñoColeccion() {
        return añoColeccion;
    }

    public boolean   setAñoColeccion(@NotNull String añoColeccion) {
        if (!añoColeccion.isEmpty()){
            this.añoColeccion = añoColeccion;
            return  true;
        }
        else return false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean setDescripcion(@NotNull String descripcion) {
        if (!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return  true;
        }
        else return false;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public boolean setInstrucciones(@NotNull String instrucciones) {
        if (!instrucciones.isEmpty()){
            this.instrucciones = instrucciones;
            return  true;
        }
        else return false;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public boolean setNumeroPiezas(int numeroPiezas) {
        if (numeroPiezas>0){
            this.numeroPiezas = numeroPiezas;
            return  true;
        }
        else return false;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean setPrecio(double precio) {
        if (precio>0.0){
            this.precio = precio;
            return  true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Kinder{" +
                "nombreJuguete='" + nombreJuguete + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nombreColeccion='" + nombreColeccion + '\'' +
                ", añoColeccion='" + añoColeccion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", instrucciones='" + instrucciones + '\'' +
                ", numeroPiezas=" + numeroPiezas +
                ", precio=" + precio +
                '}';
    }

    public Kinder(String nombreJuguete, String tipo, String nombreColeccion, String añoColeccion, String descripcion, String instrucciones, int numeroPiezas, double precio) {
        setNombreColeccion(nombreColeccion);
        setTipo(tipo);
        setNombreJuguete(nombreJuguete);
        setAñoColeccion(añoColeccion);
        setDescripcion(descripcion);
        setInstrucciones(instrucciones);
        setNumeroPiezas(numeroPiezas);
        setPrecio(precio);
    }

}

