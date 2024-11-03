import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class SenhaAleatoria {

    private ArrayList<String> resposta = new ArrayList<>() ;
    private String respostaFinal = "";
    Random gerador = new Random();

    String[] letrasMaiusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[] letrasMinusculas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] caracteresEspeciais = {".", "@", "!", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "{", "}", "[", "]", "|", ":", ";", "'", "<", ">", ",", ".", "?", "/", "~", "`"};
    String[] numerosGerados = {"1","2","3","4","5","6","7","8","9","0"};



    public String gerarSenha (Integer numero) {

        if(numero < 5){
            return "Informe um numero maior que 4 caracteres";
        } else {

            this.respostaFinal = "";
            this.respostaFinal = this.respostaFinal + this.letrasMaiusculas[gerador.nextInt(24)];
            this.respostaFinal = this.respostaFinal + this.letrasMinusculas[gerador.nextInt(24)];
            this.respostaFinal = this.respostaFinal + this.caracteresEspeciais[gerador.nextInt(30)];
            this.respostaFinal = this.respostaFinal + this.numerosGerados[gerador.nextInt(9)];
            this.respostaFinal = this.respostaFinal + this.letrasMaiusculas[gerador.nextInt(24)];

            return this.respostaFinal.toString();


        }


    }



}
