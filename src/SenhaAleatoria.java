import javax.swing.*;
import java.util.*;

public class SenhaAleatoria {

    Random gerador = new Random();
    private List<String> respostaFinal = new ArrayList<String>();
    private String resposta = "";

    String[] letrasMaiusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[] letrasMinusculas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] caracteresEspeciais = {".", "@", "!", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "{", "}", "[", "]", "|", ":", ";", "'", "<", ">", ",", ".", "?", "/", "~", "`"};
    String[] numerosGerados = {"1","2","3","4","5","6","7","8","9","0"};

    public String gerarSenha (Integer numero) {

        if(numero < 5){
            return "Informe um número maior que 4 caracteres";
        } else {

            resposta = "";

            String[] todasOsCaracteres = {letrasMaiusculas[gerador.nextInt(letrasMaiusculas.length)], letrasMinusculas[gerador.nextInt(letrasMinusculas.length)], caracteresEspeciais[gerador.nextInt(caracteresEspeciais.length)],numerosGerados[gerador.nextInt(numerosGerados.length)]};

            for (int i = 0; i < 4; i++) {

                respostaFinal.add(todasOsCaracteres[i]);

            }

            respostaFinal.add(todasOsCaracteres[gerador.nextInt(3)]);

            for (int i = 0; i < numero-5; i++) {

                respostaFinal.add(todasOsCaracteres[gerador.nextInt(3)]);

            }

            Collections.shuffle(respostaFinal);

            for (int i = 0; i < respostaFinal.size(); i++) {
                resposta = resposta + respostaFinal.get(i);
            }
            respostaFinal.clear();

            return String.join("", resposta);


        }


    }



}
