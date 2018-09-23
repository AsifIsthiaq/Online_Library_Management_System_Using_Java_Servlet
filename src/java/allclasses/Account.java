/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allclasses;

/**
 *
 * @author Asif
 */
public class Account {
    private String name;
    private String username;
    private String password;
    private String sec_q;
    private String answer;
    
    public Account(String name,String username,String password,String sec_q,String answer){
        this.name = name;
        this.username = username;
        this.password = password;
        this.sec_q = sec_q;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSec_q() {
        return sec_q;
    }

    public void setSec_q(String sec_q) {
        this.sec_q = sec_q;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
    
}
