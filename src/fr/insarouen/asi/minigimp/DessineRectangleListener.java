package fr.insarouen.asi.minigimp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Listener qui modifie les données (dessinables) lors d'un click dans la zone de dessin
public class DessineRectangleListener extends MouseMotionAdapter implements MouseListener{
  DessinablesData dessinables;
  ControleurCouleur lecontroleur;
  int xdebut = -1;
  int ydebut = -1;

  public DessineRectangleListener(DessinablesData dessinables, ControleurCouleur lecontroleur) {
    this.dessinables = dessinables; 
    this.lecontroleur = lecontroleur;
  }

  public void mouseDragged(MouseEvent e){
    if ((xdebut == -1 ) || (ydebut == -1))  {
      xdebut = e.getX();
      ydebut = e.getY();
    }
    else {
      int xfin = e.getX();
      int yfin = e.getY();
  	  dessinables.addDessinable(new Rectangle(xdebut, ydebut, xfin - xdebut, yfin - ydebut, lecontroleur.getColor()));
    }
  }

  public void mouseClicked(MouseEvent event) {}

  public void mouseEntered(MouseEvent event) {}
  
  public void mouseExited(MouseEvent event) {}
  
  public void mousePressed(MouseEvent event) {}
  
  public void mouseReleased(MouseEvent event) {
    xdebut = -1;
    ydebut = -1;
  }
}

