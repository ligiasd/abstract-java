package entities;

import java.util.regex.Pattern;

public class Senha {

    private String senha;

    public Senha() {
    }

    public Senha(String senha) {
        if (!Pattern.compile("^(?=.*[0-9])").matcher(senha).find()){
            System.out.println("Deve conter numeros");

        }
        if (!Pattern.compile("(?=.*[A-Z])").matcher(senha).find()){
            System.out.println("Deve conter letras maiusculas");
        }
        if (!Pattern.compile("(?=.*[a-z])").matcher(senha).find()) {
            System.out.println("Deve conter letras minusculas");
        }
        if (!Pattern.compile("(?=.*[@#$%^&+=])").matcher(senha).find()){
            System.out.println("Deve conter caracteres especiais");
        }
        if (!Pattern.compile("(?=\\S+$).{6}$").matcher(senha).find()) {
            System.out.println("Deve conter minimo de 6 caracteres para senha forte");
        }
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}

