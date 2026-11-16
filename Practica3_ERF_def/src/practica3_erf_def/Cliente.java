
package practica3_erf_def;

import java.time.LocalDate;

public class Cliente {
    //declaramos las 4 variables
    int numero;
    String nombre;
    float puntos;
    LocalDate FechaNac;

    //hacemos el constructor con todas las variables
    public Cliente(int numero, String nombre, float puntos, LocalDate FechaNac) {
        this.numero = numero;
        this.nombre = nombre;
        this.puntos = puntos;
        this.FechaNac = FechaNac;
    }

    //creamos los Get y Set
    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }
    
    //cambiamos el toString

    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\nnumero: " + this.numero + "\npuntos: " + this.puntos + "\nfecha de nacimiento: " + this.FechaNac;
    }
}
