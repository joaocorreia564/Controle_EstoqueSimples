package br.edu.fema.app;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("Entrada de produto : ");
        System.out.print("Nome: ");
        produto.nome = tc.nextLine();
        System.out.print("Preço: ");
        produto.preco = tc.nextDouble();
        System.out.print("Quantidade em estoque :");
        produto.quantidade = tc.nextInt();

        System.out.println();
        System.out.println("Entrada de produtos : " + produto);

        System.out.println();
        System.out.println("Entre com um numero de produtos para ser adicionado ao Estoque: ");
        int quantidade = tc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Entrada de produtos : " + produto);

        System.out.println();
        System.out.println("Entre com um numero de produtos para ser removidos do Estoque: ");
        quantidade = tc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Entrada de produtos : " + produto);

        tc.close();
    }
}
