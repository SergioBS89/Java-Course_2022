package exercices;

import javax.swing.JOptionPane;

public class NameLonger {

    public static void main(String[] args) {
        
      var name1 = JOptionPane.showInputDialog(null,"Ingrese nombre de la primera persona");
      var surname1 = JOptionPane.showInputDialog(null,"Ingrese primer apellido primera persona");
      name1 += " " + surname1;
      var name2 = JOptionPane.showInputDialog(null,"Ingrese nombre de la segunda persona");
      var surname2 = JOptionPane.showInputDialog(null,"Ingrese primer apellido segunda persona");
      name2 += " " + surname2;
      var name3 = JOptionPane.showInputDialog(null,"Ingrese nombre de la tercera persona");
      var surname3 = JOptionPane.showInputDialog(null,"Ingrese primer apellido tercera persona");
      name3 += " " + surname3;

      System.out.println(name1);

    
      String [] names = name1.split(" ");
      String [] names2= name2.split(" ");
      String [] names3 = name3.split(" ");
      
      var max = names[0].length() > names2[0].length() ? names : names2;
      max = names3[0].length() > max[0].length() ? names3 : max;

      JOptionPane.showMessageDialog(null, max[0] + " "+ max[1] + " tiene el nombre mas largo" );

    }
    
}