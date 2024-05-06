package list;
import array.ListaArray;
import array.ListaArray;


public class FilaMateus implements Fila {
    ListaArray listaArray;


    public FilaMateus() {
        listaArray = new ListaArray();
    }

    @Override
    public void enqueue(int valor) {
        listaArray.insereFim(valor);
    }

    @Override
    public int dequeue() {
        int valorRemovido = listaArray.ultimoElemento();
            listaArray.removeFim();
            return valorRemovido;
    }

    @Override
    public boolean isEmpty() {
        return listaArray.buscaIndice(0) == -1;

    }

    @Override
    public int size(){
        return listaArray.size();

    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }
}
