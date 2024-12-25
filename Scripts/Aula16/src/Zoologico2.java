
import java.util.ArrayList;
import java.util.List;

public class Zoologico2 {

    private List<Animal> animais;

    public Zoologico2() {
        animais = new ArrayList<Animal>();
    }

    public boolean adicionar(Animal animal) {
        return animais.add(animal);
    }

    public Animal consultar(int index) {
        return animais.get(index);
    }

    public void remove(int index) {
        animais.remove(index);
    }

    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : animais) {
            sb.append(animal.detalhes()).append("\n");
        }

        return sb.toString();
    }
}
