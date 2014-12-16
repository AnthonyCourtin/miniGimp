package fr.insarouen.asi.minigimp;

import java.awt.*;
import java.awt.event.*;

// Listener qui modifie les données (dessinables) lors d'un click dans la zone de dessin
public class DessineCercleListener extends MouseMotionAdapter implements MouseListener{
  DessinablesData dessinables;
  ControleurCouleur lecontroleur;
  int xdebut = -1;
  int ydebut = -1;
  int yfin = -1;
  public DessineCercleListener(DessinablesData dessinables, ControleurCouleur lecontroleur) {
    this.dessinables = dessinables; 
  	this.lecontroleur = lecontroleur;
  }
     
  public void mouseDragged(MouseEvent e){
    if ((xdebut == -1 ) || (ydebut == -1))  {
      xdebut = e.getX();
      ydebut = e.getY();
    }
    else {
      yfin = e.getY();
    }
  }

  public void mouseClicked(MouseEvent event) {}

  public void mouseEntered(MouseEvent event) {}
  
  public void mouseExited(MouseEvent event) {}
  
  public void mousePressed(MouseEvent event) {}
  
  public void mouseReleased(MouseEvent event) {
    dessinables.addDessinable(new Cercle(xdebut, ydebut, yfin - ydebut, lecontroleur.getColor()));
    xdebut = -1;
    ydebut = -1;
  }
}


