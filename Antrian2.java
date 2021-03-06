package queue;

public class Antrian2 {
    
    static int ekor = -1;
    static int maxEkor = 5;
    public static void addQueue(String antrian[], String data) {
        
        if(ekor >= maxEkor)
            System.out.println("add Queue: " + data);
        else {
            //System.out.println("add Queue: " + data);
            ekor++;
            antrian[ekor] = data;
        }
    }
    public static String deQueue(String antrian[]){
        String hasil = "";
        
        if(ekor < 0)
            hasil = "Maaf, antian kosong";
        else{
            hasil = antrian[0];
            antrian[0] = null;
            
            for(int i = 1; i <= ekor; i++){
                antrian[i-1] = antrian[i];
                antrian[i] = null;
            }
            ekor--;
        }
        return(hasil);
    }
    
    public static void bacaAntrian(String antrian[]){
        System.out.println("Kondisi Antrian : ");
        
        for(int i = 0; i <= maxEkor; i++){
            if(i == ekor)
                System.out.println(i + "." + antrian[i] + " ekor");
            else if(antrian[i] == null)
                System.out.println(i + ".");
            else
                System.out.println(i + "." + antrian[i]);
        }
    }
    
    public static void main(String []wawan){
        String antrian[] = new String[16];
        System.out.println("Antrian Mobil");
        
        addQueue(antrian, "Mobil A");
        addQueue(antrian, "Mobil B");
        addQueue(antrian, "Mobil C");
        addQueue(antrian, "Mobil D");
        addQueue(antrian, "Mobil E");
        addQueue(antrian, "Mobil F");
        
        System.out.println("\n");
        System.out.println(" ");
        
        bacaAntrian(antrian);
        
        System.out.println("\n\nURUTAN KELUAR\nQueue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("\n\n Sedangkan Mobil F masih mengantri");
    }
    
}
