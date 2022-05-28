package Utils;
import java.util.InputMismatchException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class validadorClientes {
   public  static boolean validarC(JTextField nome, JTextField cpf, JTextField email, JTextField telefone, String sexo,JTextField dataN, JComboBox estadoC){
       if(nome.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o campo nome para prosseguir.");
           return false;
       }
       if(cpf.getText().replaceAll("\\D", "").length() < 8){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o campo CPF para prosseguir.");
           return false;
       }
       else if(email.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o campo E-mail para prosseguir.");
           return false;
       }
       else if(telefone.getText().replaceAll("\\D", "").length() < 8){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o campo telefone para prosseguir.");
           return false;
       }
       else if(sexo.trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, escolha as opções de genero para prosseguir.");
           return false;
       }
       else if(dataN.getText().replaceAll("\\D", "").length() < 5){
           JOptionPane.showMessageDialog(null, "Por favor, preencha a data para prosseguir.");
           return false;
       }
       else if(estadoC.getSelectedItem().equals("Informar..")){
           JOptionPane.showMessageDialog(null, "Por favor, informe seu estado civil para prosseguir.");
           return false;
       }
       else return true;
}
   
   public static boolean validarE(JTextField CEP, JTextField Endereco, JTextField Numero, JTextField Complemento, JTextField Bairro, JTextField Cidade, JTextField Estado ){
     if(CEP.getText().replaceAll("\\D", "").length() < 5){
           JOptionPane.showMessageDialog(null, "Por favor, preencha seu CEP para prosseguir.");
           return false;
       }
     else if(Endereco.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha seu endereço para prosseguir.");
           return false;
       }
     else if(Numero.getText().replaceAll("\\D", "").length() < 1){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o numero de sua residencia para prosseguir.");
           return false;
       }
       else if(Complemento.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o complemento para prosseguir.");
           return false;
       }
       else if(Bairro.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha o seu bairro para prosseguir.");
           return false;
       }
      else if(Cidade.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha sua cidade para prosseguir.");
           return false;
       }
      else if(Estado.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Por favor, preencha seu estado para prosseguir.");
           return false;
       }
      else return true;
   }
     
   
   
}

