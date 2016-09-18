package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 *         ----------------------------
 *         ------- Alterado por -------
 * 
 *         Cassiano Moura Leão
 *         Maxwell de Souza Freitas
 *         ----------------------------
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(){
        System.out.println("### --- O saldo é insuficiente --- ###");
    }
}
