import list.EstruturaElementar;
import list.PilhaMateus;
import list.FilaMateus;
import list.Fila2;

public class Main {
    public static void main(String[] args) {

      
        PilhaMateus novaPilha = new PilhaMateus();

        novaPilha.push(1);
        novaPilha.push(2);
        novaPilha.push(3);

        System.out.println("Pop"+novaPilha.pop());
        System.out.println("Pop"+novaPilha.pop());

        System.out.println("Está vazio"+novaPilha.isEmpty());

    
    }
}
