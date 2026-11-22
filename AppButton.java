import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ATOMIC COMPONENT CLASS: tombol buatan sendiri (turunan JButton)
public class AppButton extends JButton {

    public AppButton(String text) {
        super(text);
        setOpaque(true);

        // EVENT LISTENER (Event Adapter Class): override method mouseEntered & mouseExited
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(null);
            }
        });
    }
}
