package Utils;
import java.util.InputMismatchException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class validadorProdutos {
   public  static boolean novoProduto(JTextField Codigo, JTextField Produto, JTextField Quantidade, JTextField valorC, JTextField valorV, JComboBox Fornecedor){
       if(Codigo.getText().replaceAll("\\D", "").length() < 8){
           JOptionPane.showMessageDialog(null, "Informe o codigo do produto.");
           return false;
       }
       if(Produto.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Informe o nome do Produto.");
           return false;
       }
       else if(Quantidade.getText().replaceAll("\\D", "").length() < 0){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o campo E-mail para prosseguir.");
           return false;
       }
       else if(valorC.getText().replaceAll("\\D", "").length() < 2){
           JOptionPane.showMessageDialog(null, "informe o valor de venda.");
           return false;
       }
       else if(valorV.getText().replaceAll("\\D", "").length() < 2){
           JOptionPane.showMessageDialog(null, "informe o valor da venda.");
           return false;
       }
       else if(Fornecedor.getSelectedItem().equals("Informar..")){
           JOptionPane.showMessageDialog(null, "Escolha um fornecedor.");
           return false;
       }
       else return true;
}
}

