package battleship.UI;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private boolean isFullscreen = false;
    
    public MainFrame() {
        MainPanel mainPanel = new MainPanel();
        add(mainPanel);

        setupKeyBinds();
    }

    public void toggleFullscreen() 
    {
        if (!isFullscreen) 
        {
            dispose();
            setUndecorated(true);
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setVisible(true);
            isFullscreen = true;
        } 
        else 
        {
            dispose();
            setUndecorated(false);
            setExtendedState(JFrame.NORMAL);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
            isFullscreen = false;
        }
    }

    private void setupKeyBinds() 
    {
        JRootPane root = getRootPane();
        InputMap inputMap = root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = root.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke("F11"), "toggleFullscreen");
        inputMap.put(KeyStroke.getKeyStroke("ESCAPE"), "toggleFullscreen");
        actionMap.put("toggleFullscreen", new AbstractAction() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                toggleFullscreen();
            }
        });
    }
}
