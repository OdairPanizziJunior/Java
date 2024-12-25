
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TratadorAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("O Botão foi Pressionado " + e.getActionCommand());
        
    }
    
}
