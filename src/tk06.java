import javax.swing.JOptionPane;

public class tk06 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Coloque seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá "+nome);

        int anos = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade: "));
        JOptionPane.showMessageDialog(null, "Você tem "+anos+" anos");

        Double alt = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua altura em cm: "));
        alt = alt / 100;
        JOptionPane.showMessageDialog(null, "Você tem "+alt+"m");
        
    }
}
