package poo.p3.deques.sequenciais;

public class TesteDequeSequencial {
    
    public static void main(String[] args) {
        
        Conta c = new Conta(1234, 44998, "Maria Flor", 7510);
        Conta c1 = new Conta(111, 77845, "Maria Madalena", 1500);
        Conta c2 = new Conta(787, 996874, "Junior", 985);
        
        DequeSequencial ds = new DequeSequencial();
        
        ds.insertFirst(c);
        ds.insertFirst(c1);
        ds.insertFirst(c2);
        
        for (int i = 0; i < ds.getLength(); i++) {
            System.out.println();
        } 
    }

}