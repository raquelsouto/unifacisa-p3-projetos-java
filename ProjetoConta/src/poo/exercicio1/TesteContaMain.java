package poo.exercicio1;

public class TesteContaMain {

    public static void main(String[] args) {

        System.out.println("-=-=-=-==--=-=-=-==- Dados Conta Corrente -=-=-=-==--=-=-=-==-\n");
        Conta contaCorrente = new ContaCorrente(123, 333, "Raquel W", 500, 600, 200);

        System.out.println("Saldo Atual: " + contaCorrente.getSaldo());
        System.out.println("\nAPÓS REALIZAR UM DEPÓSITO DE R$ 120");
        
        try {
            contaCorrente.depositar(-5);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        System.out.println("Seu saldo é R$ " + contaCorrente.getSaldo());
        System.out.println("\n" + contaCorrente);

        System.out.println("COMPARANDO.. Após realizar um saque de R$ 100");
        System.out.println("Saldo Atual: " + contaCorrente.getSaldo());

        System.out.println("\n*** Tentando sacar R$ 1000, mas meu saldo é R$ 320 ***");
        try {
            contaCorrente.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
            System.out.println("Valor adquirido pela exceção: R$ " + e.getValor());
            
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        
        System.out.println("\nSeu saldo é R$ " + contaCorrente.getSaldo());
        System.out.println("\n"+contaCorrente);


        System.out.println("\nFAZENDO UM AJUSTE NO LIMITE.. Para um valor < 0");
        try {
            contaCorrente.setValorLimite(-10);
        } catch (LimiteInvalidoException e1) {
            e1.printStackTrace();
        }

        System.out.println("Seu limite atual é R$ " + contaCorrente.getValorLimite());

        System.out.println("\n-=-=-=-==--=-=-=-==- Dados Conta Poupança -=-=-=-==--=-=-=-==-\n");
        Conta contaPoupanca = new ContaPoupanca(456, 222, "Bruno W", 1500, 890, 1000);

        System.out.println("Saldo Atual: " + contaPoupanca.getSaldo());
        System.out.println("** TENTANDO SACAR R$ 2000 **");
        
        try {
            contaPoupanca.depositar(2000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        System.out.println("Seu saldo é R$ " + contaPoupanca.getSaldo());
        System.out.println("\n" + contaPoupanca);

        System.out.println("COMPARANDO.. Após realizar um saque de R$ 120");
        try {
            contaPoupanca.sacar(120);
        }  catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println("Seu saldo é R$ " + contaPoupanca.getSaldo());
        System.out.println("\n" + contaPoupanca);

        //Como condição para a Classe Conta Poupança é que o cliente tem disponível 3 saques gratuitos ao mês
        //mais do que isso, desconta-se um taxa fixa de R$ 2.5, para cada saque.
        System.out.println("* Realizando o SEGUNDO saque mensal -R$ 50.. *");
        try {
            contaPoupanca.sacar(50);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo Atual R$ " + contaPoupanca.getSaldo());

        System.out.println("\n* Realizando o TERCEIRO saque mensal.. -R$ 80.. *");
        
        System.out.println("\n*********************** AQUI ********************");
        
        try {
            contaPoupanca.sacar(-450);
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        System.out.println("Saldo Atual R$ " + contaPoupanca.getSaldo());

        System.out.println("\n* Realizando o QUARTO saque mensal.. -R$ 100.. *");
        
        try {
            contaPoupanca.sacar(-55);
        } catch (IllegalArgumentException  e) {
            e.printStackTrace();
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        
        System.out.println("*********************** AQUI ********************");

//        System.out.println("Saldo Atual R$ " + contaPoupanca.getSaldo());
//
//        System.out.println("\nFAZENDO UM AJUSTE NO LIMITE..Trocando o limite para R$ 950");
//
//        try {
//            contaPoupanca.setValorLimite(-45);
//        } catch (LimiteInvalidoException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Seu limite atual é R$ " + contaPoupanca.getValorLimite());
    }

}
