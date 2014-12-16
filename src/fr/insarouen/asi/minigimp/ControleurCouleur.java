package fr.insarouen.asi.minigimp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JPanel;

public class ControleurCouleur extends JPanel {
	Color laCouleur;
	MonBouton rouge = new MonBouton("Rouge");
	MonBouton bleu = new MonBouton("Bleu");
	MonBouton vert = new MonBouton("Vert");
	MonBouton jaune = new MonBouton("Jaune");
	MonBouton blanc = new MonBouton("Blanc");
	MonBouton cyan = new MonBouton("Cyan");
	MonBouton gray = new MonBouton("Gris");
	MonBouton noir = new MonBouton("Noir");
	MonBouton darkGray = new MonBouton("Gris++");
	MonBouton magenta = new MonBouton("Magenta");
	MonBouton orange = new MonBouton("Orange");
	MonBouton ligthGray = new MonBouton("Gris--");
	MonBouton pink = new MonBouton("Rose");

    /** Creates a new instance of ControleurFeuGraphique */
    public ControleurCouleur(Color laCouleur) {
    	this.laCouleur = laCouleur;

		add(rouge);
		add(bleu);
		add(vert);
		add(jaune);
		add(cyan);
		add(blanc);
		add(gray);
		add(noir);
		add(darkGray);
		add(magenta);
		add(orange);
		add(ligthGray);
		add(pink);
		magenta.setBackground(Color.MAGENTA);
		orange.setForeground(Color.ORANGE);
		ligthGray.setForeground(Color.LIGHT_GRAY);
		pink.setForeground(Color.PINK);
		darkGray.setForeground(Color.DARK_GRAY);
		rouge.setForeground(Color.RED);
		bleu.setForeground(Color.BLUE);
		vert.setForeground(Color.GREEN);
		jaune.setForeground(Color.YELLOW);
		cyan.setForeground(Color.CYAN);
		blanc.setForeground(Color.WHITE);
		gray.setForeground(Color.GRAY);
		noir.setForeground(Color.BLACK);

    }

    class MonBouton extends JButton{
    	public MonBouton(String str){
    		super(str);
    		addActionListener(new GereClic());
    	}

    	class GereClic implements ActionListener{
	    	public void actionPerformed(ActionEvent e){
		    		if(e.getSource().equals(rouge))
		    			laCouleur = Color.RED;
		    		if(e.getSource().equals(vert))
		    			laCouleur = Color.GREEN;
		    		if(e.getSource().equals(bleu))
		    			laCouleur = Color.BLUE;
		    		if(e.getSource().equals(jaune))
		    			laCouleur = Color.YELLOW;
		    		if(e.getSource().equals(cyan))
		    			laCouleur = Color.CYAN;
		    		if(e.getSource().equals(blanc))
		    			laCouleur = Color.WHITE;
		    		if(e.getSource().equals(gray))
		    			laCouleur = Color.GRAY;
		    		if(e.getSource().equals(noir))
		    			laCouleur = Color.BLACK;
		    		if(e.getSource().equals(darkGray))
		    			laCouleur = Color.DARK_GRAY;
		    		if(e.getSource().equals(magenta))
		    			laCouleur = Color.MAGENTA;
		    		if(e.getSource().equals(orange))
		    			laCouleur = Color.ORANGE;
		    		if(e.getSource().equals(pink))
		    			laCouleur = Color.PINK;
		    		if(e.getSource().equals(darkGray))
		    			laCouleur = Color.LIGHT_GRAY;
	    	}
	    }
    }

    public Color getColor(){
    	return laCouleur;
    }
}