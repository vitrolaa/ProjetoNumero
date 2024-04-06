package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numero {

    public ArrayList numero;

    public Numero() {
        numero = new ArrayList();
    }

    //create--add
    public void salvar(int num) {
        numero.add(num);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }

    //read--Listar
    public String listar() {
        String res = "";
        if (!numero.isEmpty()) {
            for (int i = 0; i < numero.size(); i++) {
                res += (i + 1) + "- " + numero.get(i) + "\n";
            }
        } else {
            res = "Lista vazia!";

        }
        return res;

    }

    //delete--Deletar
    public void excluir(int indice) {
        if (!numero.isEmpty()) {
            if (indice > 0 && indice <= numero.size()) {
                numero.remove(indice - 1);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "O codigo não existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel excluir, a lista está vazia!");
        }
    }

    //edit--editar
    public void alterar(int indice, int elemento) {
        if (!numero.isEmpty()) {
            if (indice > 0 && indice <= numero.size()) {
                numero.set(indice - 1, elemento);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel excluir, a lista está vazia!");
        }

    }

    //verify--verificar
    public boolean verificarNumero(int num) {
        return numero.contains(num);
    }

    //calculation--calcular
    public double calcularMediaNum() {
        if (!numero.isEmpty()) {
            int soma = 0;
            for (int i = 0; i < numero.size(); i++) {
                soma = soma + (int) numero.get(i);
            }
            return (double) soma / numero.size();
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel calcular, a lista está vazia!");
        }
        return 0;
        
    }

    //Find biggest number--encontrar maior numero (precisamos da ajuda do chat nesse metodo)
    
     public int encontrarMaiorNumero() {
        if (!numero.isEmpty()) {
            int maior = (int) numero.get(0);
            for (int i = 1; i < numero.size(); i++) {
                int atual = (int) numero.get(i);
                if (atual > maior) {
                    maior = atual;
                }
            }
            return maior;
        } else {
            return 0;
        }
    }
    
    
    
    
}
