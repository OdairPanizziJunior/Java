
public class Menu {

    private Agenda[] animais;

    public Menu() {
        animais = new Agenda[10];
    }

    public boolean adicionar(Agenda animal) {
        boolean result = false;
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == null) {
                animais[i] = animal;
                result = true;
                break;
            }
        }
        return result;
    }

    public Agenda consultar(int index) {
        return animais[index];
    }

    public void remove(int index) {
        animais[index] = null;
    }

    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] != null) {
                Agenda animal = animais[i];
                sb.append("" + i + " " + animal.detalhes()).append("\n");
            }
        }

        return sb.toString();
    }
}
