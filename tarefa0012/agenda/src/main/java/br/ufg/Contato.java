package br.ufg;

public class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Email: " + email;
    }

}
