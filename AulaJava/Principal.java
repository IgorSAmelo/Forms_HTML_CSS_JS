package AulaJava;
import java.util.Date;

import AulaJava.Entidades.Agencia;
import AulaJava.Entidades.Cliente;
import AulaJava.Entidades.Conta;
import AulaJava.Entidades.Endereco;

// classe que vai dá inicio ao projeto Sistema Bancário
public class Principal {
    public static void main(String[] args) {
        // System.out.println("Oi Mundo");
        Endereco endAgSenac = new Endereco("PE", "Recife", "Santo Amaro", "Pombal", 55, "Sala 201", "50050-050");
        Endereco endCliente = new Endereco("PE", "Recife", "Santo Amaro", "Manoel Carvalho", 70, "casa", ")50050-110");
        Agencia agFacSenac = new Agencia(0034, "8198877-2211", "agencia@hotmail.com", endAgSenac);
        Cliente clienteluis = new Cliente("Pedro Augusto", "117.471.264-38", "pedro@hotmail.com", "81998256149", new Date(1965, 5, 10), endCliente);
        Conta contaluis = new Conta(022, clienteluis, agFacSenac, 128.9, 1000.00, false);
        System.out.println(contaluis.getSaldo());
    }
}
