package NickBank;

import java.util.Random;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Bem-vindo a NickBank.");
        System.out.println("Conta digital prática e sem custos.\n");

        System.out.println("Crie já um conta na NickBank");

        try {
            Thread.sleep(2000);    
        } catch (InterruptedException ignore) {}

        System.out.print("Nome: ");
        String nome = read.nextLine();

        System.out.print("Endereço: ");
        String endereco = read.nextLine();

        System.out.print("CPF: ");
        String CPF = read.nextLine();

        System.out.print("Idade: ");
        int idade = read.nextInt();

        System.out.print("Saldo Inicial: ");
        float saldo = read.nextFloat();

        Random numeroDeContas = new Random();

        boolean isContaBloqueada = false;
        int numeroConta = numeroDeContas.nextInt(100000);

        Cliente person = new Cliente(nome, endereco, CPF, idade);
        ContaNick personNick = new ContaNick(nome, numeroConta, saldo, isContaBloqueada);

        System.out.println("Menu:");
        System.out.println("[1] Configurações\n[2] Saque\n[3] Deposito\n[4] Sair");
        System.out.println("Opção: ");
        int option = read.nextInt();
        switch (option) {
            case 1:
                System.out.println("Informações:");
                System.out.println("CPF: " + person.getCPF());
                System.out.println("Idade: " + person.getIdade());
                System.out.println("Numero da Conta Nick: " + personNick.getNumeroConta());
                System.out.println("Titular: " + personNick.getTitular());
                System.out.println("Saldo: " + personNick.getSaldo());
                System.out.println("Total de Contas: " + personNick.getTotalDeContas());
                System.out.println("ContaBloqueada: " + personNick.getIsContaBloqueada());                
                break;

            case 2:
                System.out.println("Valor de Saque: ");
                float valorSaque = read.nextFloat();
                String statusSaque = (personNick.saca(valorSaque) ? "Saque Sucedido" : "Saldo insuficiente");
                System.out.println(statusSaque);
                break;

            case 3:
                System.out.println("Valor de Deposito? ");
                float valorDeposito = read.nextFloat();
                personNick.deposito(valorDeposito);
                System.out.println("Deposito Sucedido");
                break;

            case 4:
                System.exit(1);
                break;
        }
    }
}
