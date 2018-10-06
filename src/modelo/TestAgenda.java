package modelo;

import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        agenda.armazenarPessoa("Lucas Silva Guimarães", 19, 1.81);
        agenda.armazenarPessoa("Franciele dos Santos Schinaider", 19, 1.74);
        
        agenda.imprimeAgenda();
        
        agenda.imprimePessoa(0);
        
        System.out.println(agenda.buscarPessoa("Lucas Silva Guimarães"));
        
        agenda.removerPessoa("Lucas Silva Guimarães");
        
        agenda.imprimeAgenda();   
    }
}
