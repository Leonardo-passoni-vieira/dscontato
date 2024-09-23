/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.etecriopardo.contatos;

/**
 *
 * @author Etec
 */
public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String categoria;
    
    public Contato (String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override 
    public String toString(){
        return "Nome:"+this.getNome()+"\t Sobrenome:"+this.getSobrenome()+"\n"
                +"Telefone:"+this.getTelefone()+"\t E-mail:"+this.getEmail()+"\n"+
                "Categoria:"+this.getCategoria();
    }
    
}