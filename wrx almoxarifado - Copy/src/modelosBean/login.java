/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

/**
 *
 * @author guidi
 */
public class login {
    private int cod;
    private String login;
    private String senha;
    private int funcao;

    public login(String login, String senha, int funcao) {
        this.login = login;
        this.senha = senha;
        this.funcao = funcao;
    }

    public login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
    
    
    
}
