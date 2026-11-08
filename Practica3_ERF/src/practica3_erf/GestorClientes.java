package practica3_erf;

import java.util.ArrayList;

public class GestorClientes {
    private final ArrayList<Cliente> clientes = new ArrayList<>();

    public void añadir(Cliente c) { clientes.add(c); }
    public Cliente get(int indice) { return clientes.get(indice); }
    public int total() { return clientes.size(); }
}
