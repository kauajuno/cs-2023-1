package br.ufg;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void addContato(String nome, String email){
        contatos.add(new Contato(nome, email));
    }

    public Contato getContato(String metodo, String valor) throws Exception{
        if(metodo == "nome"){
            for(Contato c : contatos){
                if(c.getNome() == valor)
                    return c;
            }
        }else{
            for(Contato c : contatos){
                if(c.getEmail() == valor)
                    return c;
            }
        }
        throw new Exception("Contato não encontrado");
    }

    public void printContatos(){
        if(this.contatos.size() == 0)
            System.out.println("A lista de contatos está vazia no momento");
        else{
            for(Contato c : contatos){
                System.out.println(c);
            }
        }
    }

    public void removeContato(String nome){
        int i = 0;
        for(Contato c : contatos){
            if(c.getNome() == nome){
                contatos.remove(i);
                System.out.println("Contato removido com sucesso!");
                return;
            }
            i++;
        }
        System.out.println("Contato não encontrado!");
    }


}
