import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeradorSenhas {
    private JPanel panelInicial;
    private JLabel txtGeradorDeSenhas;
    private JButton btnGerador;
    private JTextField txtSenhaGerada;
    private JTextField txtNumeroCarac;

    SenhaAleatoria aleatoria = new SenhaAleatoria();
    String numeroAleatorio = "";


    public GeradorSenhas() {

        btnGerador.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {

                try{
                    txtSenhaGerada.setText("");
                    numeroAleatorio = (aleatoria.gerarSenha(Integer.valueOf((txtNumeroCarac.getText()))));
                    txtSenhaGerada.setText(numeroAleatorio);

                }catch (Exception ex){
                    txtSenhaGerada.setText("Informe um valor numérico");
                }

             }

        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Meu gerador de senhas");
        frame.setContentPane(new GeradorSenhas().panelInicial);
        frame.setSize(300,220);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
