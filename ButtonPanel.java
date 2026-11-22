import javax.swing.*;
import java.awt.*;

// INTERMEDIATE CONTAINER CLASS: JPanel (tombol)
public class ButtonPanel extends JPanel {
    private final AppButton sapaButton = new AppButton("Sapa");
    private final AppButton resetButton = new AppButton("Reset");

    public ButtonPanel() {
        // LAYOUT CLASS 3: FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));
        add(sapaButton);
        add(resetButton);
    }

    public AppButton getSapaButton() { return sapaButton; }
    public AppButton getResetButton() { return resetButton; }
}
