package modelo;

import java.time.LocalDate;

public class TestPessoa {
    static Pessoa pessoa = new Pessoa();
    public static void main(String[] args) {
        pessoa.setNome("Lucas Silva Guimarães");
        pessoa.setDataNascimento(LocalDate.of(1998,12,14));
        pessoa.setAltura(1.81);
        System.out.println(pessoa);
        
    }
}
