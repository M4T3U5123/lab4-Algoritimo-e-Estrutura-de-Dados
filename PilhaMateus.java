package list;
import java.util.ArrayList;
import array.ListaArray;

public class PilhaMateus implements Pilha {
    ListaArray listaArray;

    public PilhaMateus() {
        listaArray = new ListaArray();
    }

    @Override
    public boolean isEmpty() {
        return listaArray.buscaIndice(0) == -1;
    }

    @Override
    public void push(int valor) {
        listaArray.insereInicio(valor);
        
    }

    @Override
    public int pop() {
            int valorRemovido = listaArray.ultimoElemento();
            listaArray.removeFim();
            return valorRemovido;
    
    }
}
