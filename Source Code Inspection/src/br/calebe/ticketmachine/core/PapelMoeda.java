package br.calebe.ticketmachine.core;

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
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
