import javax.swing.JOptionPane;

public class Main4 {
	
	public static void main(String[] args) {
		

		String name = JOptionPane.showInputDialog("Cual es tu nombre?");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tiene?"));
        JOptionPane.showMessageDialog(null,"Tu tienes "+age+" años");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Dime tu altura"));
        JOptionPane.showMessageDialog(null,"Mides "+height+" cm");
        
	}
}


