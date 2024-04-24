import model.Account;
import model.CreditCard;
import model.Product;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da sua conta: ");
        int id = sc.nextInt();
        System.out.println("Digite o seu nome: ");
        sc.next();
        String nome = sc.nextLine();
        System.out.println("Digite o limite do cartão de Crédito: ");
        Double limit = sc.nextDouble();
        CreditCard creditCard = new CreditCard(limit);

        Account account = new Account(id, nome, creditCard);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite o nome do produto:");
            String name = sc.next();

            System.out.println("Digite o valor da compra:");
            double price = sc.nextDouble();

            Product product = new Product(name, price);
            boolean approvedPurchase = creditCard.approvedPurchase(product);

            if (approvedPurchase) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(creditCard.getList());
        for (Product p : creditCard.getList()) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + creditCard.getBalance());


    }
}