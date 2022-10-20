package AulaJava;

import java.util.Date;

import AulaJava.Entidades.Agencia;
import AulaJava.Entidades.Cliente;
import AulaJava.Entidades.Conta;

// classe que vai dá inicio ao projeto Sistema Bancário
public class Principal {
    public static void main(String[] args) {
       // System.out.println("Oi Mundo");
      
       Agencia agFacSenac = new Agencia ( 0031, "81983396522", "pedro@hotmail.com" );
       Cliente clienteluis = new Cliente("Luis Pedro", "123.456.789.00", "Luispedro@hotmail.com", "8192233331" , new Date(1965, 5, 10));
       Conta contaluis = new Conta(022, clienteluis, agFacSenac, 128.9, 1000.00, false);
        System.out.println(contaluis.getSaldo());
    }
}
