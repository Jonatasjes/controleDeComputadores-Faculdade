package controledecomputadores;
/**
 *
 * @author Jonatas Eleoterio Silva
 */
public class ControleDeComputadores {

    public static void main(String[] args) {
        
        Monitor mon[] = new Monitor[4];
        mon[0] = new Monitor("UltraWide", "LG", 1080 );
        mon[1] = new Monitor("LCD", "Acer", 768);
        mon[2] = new Monitor("UHD", "Samsung" ,2160);
        mon[3] = new Monitor();

        Servidor serv[] = new Servidor[2];
        serv[0] = new Servidor(4, 16, "Torre", "DELL EMC", "DELL", "DDR4", "DELL Snpmgy", "SATA", "DELL 1TB", "1TB", "AC", 
                "Dell PowerEdge", 9500, 2, 2, 1200 );  
        serv[1] = new Servidor(1, 16, "Torre", "Intel");

        Notebook note[] = new Notebook[2];
        note[0] = new Notebook(mon[3], "Lenovo", "DDR4", "Kingston", "SATA", "Samsung", "1TB", "AC", "Lenovo", 2300, 1, 2, 400);       
        note[1] = new Notebook(mon[1], "Acer", 2500, 2);
        
        Desktop desk[] = new Desktop[2];
        
        desk[0] = new Desktop(mon[2], "GTX 1060", 1, "Generica", "DDR4", "RyperX", "SSD", "Kingston", "1TB", "AC", "Corser",
                            4500, 1, 4, 750);
        desk[1] = new Desktop(mon[0], "GEFORCE", 2);   
        
        System.out.println("---------Controle de Computadores---------"); 
        
        System.out.println("Servidor 1");  
        serv[1].imprimir();
        
        serv[1].setCompPotenciaFonte(750);
        System.out.println(serv[1].getCompPotenciaFonte());
        serv[1].setCompMarcaMemoria("Kingston");
        System.out.println(serv[1].getCompMarcaMemoria());
        
        System.out.println("Servidor 1 Após os setters");  
        serv[1].imprimir();
        
        serv[1].mudarCapacidadeMemoria();
        serv[1].mudarCompSlotsMemoria();
        
        System.out.println("------------------------------------");  
        System.out.println("Servidor 1 Após as entradas de dados");  
        serv[1].imprimir();
        
        System.out.println("Notebook 1");  ;
        note[1].imprimir();
        
        note[1].setCompCapacidadeHD("5TB");
        System.out.println(note[1].getCompCapacidadeHD());
        note[1].setCompTipoMemoria("DDR4");
        System.out.println(note[1].getCompTipoMemoria());
        
        System.out.println("Notebook 1 Após os setters");  
        note[1].imprimir();
        
        note[1].mudarCompMarcaFonte();
        note[1].mudarCompPreco();
        
        System.out.println("------------------------------------");  
        System.out.println("Notebook 1 Após as entradas de dados");  
        note[1].imprimir();
        
        System.out.println("Desktop 1");  
        note[1].imprimir();
        
        note[1].setCompMarcaHD("Samsung");
        System.out.println(note[1].getCompMarcaHD());
        note[1].setCompSlotsMemoria(4);
        System.out.println(note[1].getCompSlotsMemoria());
        
        System.out.println("Desktop 1 Após os setters");  
        note[1].imprimir();
        
        note[1].mudarCompMarcaHD();
        note[1].mudarCompTipoFonte();
        
        System.out.println("------------------------------------");  
        System.out.println("Desktop 1 Após as entradas de dados");  
        note[1].imprimir();

    }
    
}
