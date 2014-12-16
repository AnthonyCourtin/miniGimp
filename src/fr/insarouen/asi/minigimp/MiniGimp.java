package fr.insarouen.asi.minigimp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MiniGimp {
    public static Color lacouleur = new Color(255,255,255);

  public static void main(String[] args) {
    JFrame minigimp = new JFrame("MiniGimp");
    minigimp.setMinimumSize(new Dimension(800, 600));
    minigimp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = minigimp.getContentPane();
    // assignation du layout manager
    contentPane.setLayout(new BorderLayout()); 

    DessinablesData figures = new DessinablesData();

    // création du panneau de la zone de dessin
    Dessin dsn = new Dessin();
    
    contentPane.add(BorderLayout.CENTER,dsn);

    // création du panneau de controle
    Controle ctrl = new Controle(dsn,figures);
    contentPane.add(BorderLayout.WEST, ctrl);

    minigimp.pack();
    minigimp.setVisible(true);
  }
}
