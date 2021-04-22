package lesson07.homework07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class About extends JFrame {

    private final int WIN_WIDTH = 400;
    private final int WIN_HEIGHT = 350;

    private MainWindow mainWindow;

    About(MainWindow mainWindow) {
        this.mainWindow = mainWindow;

        Rectangle mainWindowBounds = mainWindow.getBounds();
        int coordinateX = (int) mainWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int coordinateY = (int) mainWindowBounds.getCenterY() - WIN_HEIGHT / 2;
        setLocation(coordinateX, coordinateY);
        setResizable(false);
        setTitle("What this game is about?");
        setSize(WIN_WIDTH, WIN_HEIGHT);

        setLayout(new GridLayout(4, 1));

        gameTipSteadyLine();
        gameTipCompetitor();
        gameTipHaveFun();

        JButton btnExitAbout = new JButton("Got it!");
        btnExitAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        add(btnExitAbout);
    }

    private void gameTipSteadyLine() {
        add(new JLabel("- Try to build a steady line with your assigned symbols."));
    }

    private void gameTipCompetitor() {
        add(new JLabel("- Do not let your competitor to do the same."));
    }

    private void gameTipHaveFun() {
        add(new JLabel("- Have fun!"));
    }

}

