package practica3_erf_def;

import java.util.ArrayList;

public class ControladorClientes extends ArrayList<Cliente> {
    private int actual;

    public ControladorClientes() {
        super();
        this.actual = 0;
    }

    public boolean esVacia() {
        return this.isEmpty();
    }

     public boolean esPrimero() {
        return !this.isEmpty() && actual == 0;
    }

    public boolean esUltimo() {
        return !this.isEmpty() && actual == this.size() - 1;
    }
    public void avanzar() {
        if (!this.esUltimo()) {
            actual++;
        }
    }

    public void retroceder() {
        if (!this.esPrimero()) {
            actual--;
        }
    }

    public void irAlPrimero() {
        if (!this.isEmpty()) {
            actual = 0;
        } else {
            actual = -1;
        }
    }

    public void irAlUltimo() {
        if (!this.isEmpty()) {
            actual = this.size() - 1;
        } else {
            actual = -1;
        }
    }


    public void añadirCliente(Cliente c) {
        this.add(c);
        if (actual == -1) {
            actual = 0;
        } else {
            actual = this.size() - 1; 
        }
    }

    public void borrarCliente() {
        if (!this.isEmpty() && actual >= 0 && actual < this.size()) {
            this.remove(actual);
            if (this.isEmpty()) {
                actual = -1;
            } else if (actual >= this.size()) {
                actual = this.size() - 1;
            }
        }
    }

    public Cliente obtenerClienteActual() {
        if (!this.isEmpty() && actual >= 0 && actual < this.size()) {
            return this.get(actual);
        }
        return null;
    }

    public void ordenarListaPorNumeroDeCliente() {
        if (this.size() > 1) {
            for (int i = 0; i < this.size() - 1; i++) {
                for (int j = 0; j < this.size() - 1 - i; j++) {
                    Cliente c1 = this.get(j);
                    Cliente c2 = this.get(j + 1);

                    if (c1.getNumero() > c2.getNumero()) {
                        this.set(j, c2);
                        this.set(j + 1, c1);
                    }
                }
            }
            actual = 0; 
        }
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        if (actual >= -1 && actual < this.size()) {
            this.actual = actual;
        }
    }
}