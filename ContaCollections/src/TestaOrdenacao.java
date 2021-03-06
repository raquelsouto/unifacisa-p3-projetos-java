import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacao {
    
    public static void main(String[] args) {
        
        List<ContaPoupanca> listaContas = new ArrayList<ContaPoupanca>();
        //LinkedList<ContaPoupanca> listaContas = new LinkedList<ContaPoupanca>();
        
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(12345, "Maria Souto", 2500);
        listaContas.add(contaPoupanca1);
        
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(44531, "Julio Junior", 3500);
        listaContas.add(contaPoupanca2);
        
        ContaPoupanca contaPoupanca3 = new ContaPoupanca(22243, "Maria Alice", 1600);
        listaContas.add(contaPoupanca3);
        
        System.out.println("Número da conta em ordem crescente");
        Collections.sort(listaContas);
        
        for (int i = 0; i < listaContas.size(); i++) {
            System.out.println(listaContas.get(i).getNumeroConta());
        }
        
        System.out.println("\nNúmero da conta em ordem decrescente");
        Collections.reverse(listaContas);
        
        for (int i = 0; i < listaContas.size(); i++) {
            System.out.println(listaContas.get(i).getNumeroConta());
            
        }
        
        System.out.println("\nOrdenação crescente pelo nome do titular");
        TitularComparator compTitular = new TitularComparator();
        Collections.sort(listaContas, compTitular);
        
        for (int i = 0; i < listaContas.size(); i++) {
            System.out.println(listaContas.get(i).getTitular());
        }
        
        System.out.println("\nOrdenação crescente pelo saldo");
        SaldoComparator saldo = new SaldoComparator();
        Collections.sort(listaContas, saldo);
        
        for (int i = 0; i < listaContas.size(); i++) {
            System.out.println("R$ " + listaContas.get(i).getSaldo());
        }
    }
    
    
    
    

}
