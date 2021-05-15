package controledecomputadores;
import java.util.Scanner;
/**
 *
 * @author Jonatas Eleoterio Silva
 */
public class Servidor extends Computador {
    
    // Atributos
    private int numeroHD, capacidadeMemoria;
    private String tipoGabinete, marcaGabinete;
   
    // Métodos Públicos
    // Entrada de Dados
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Servidor--------");
        this.compEntradaDados();
        System.out.print("Tipo Gabinete: ");
        setTipoGabinete(sc.nextLine());
        
        System.out.print("Tipo HD: ");
        setMarcaGabinete(sc.nextLine());
        
        System.out.print("Numero HD: ");
        setNumeroHD(sc.nextInt());
        
        System.out.print("Capacidade Memoria: ");
        setCapacidadeMemoria(sc.nextInt());
      
    }
    
    public void mudarTipoGabinete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Tipo Gabinete--------");
        System.out.print("Tipo Gabinete: ");
        setTipoGabinete(sc.nextLine());
    }
    
    public void mudarMarcaGabinete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca Gabinete--------");
        System.out.print("Marca Gabinete: ");
        setMarcaGabinete(sc.nextLine());
    }
    
    public void mudarNumeroHD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Numero HD--------");
        System.out.print("Numero HD: ");
        setNumeroHD(sc.nextInt());
    }
    
    public void mudarCapacidadeMemoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Capacidade Memoria--------");
        System.out.print("Capacidade Memoria: ");
        setCapacidadeMemoria(sc.nextInt());
    }
    
    
    // Imprimir
    public void imprimir() {
        
        System.out.println("----------------------------------");
        this.compImprimir();
        System.out.println("Numero HD....: " + getNumeroHD());
        System.out.println("Capacidade Memoria....: " + getCapacidadeMemoria());
        System.out.println("Tipo Gabinete....: " + getTipoGabinete());
        System.out.println("Marca Gabinete....: " + getMarcaGabinete());
        System.out.println("----------------------------------");  
    }
    // Métodos Construtores
    
    public Servidor() {
        
    }

    public Servidor(int numeroHD, int capacidadeMemoria, String tipoGabinete, String marcaGabinete, String compMarca, String compTipoMemoria, String compMarcaMemoria, String compTipoHD, String compMarcaHD, String compCapacidadeHD, String compTipoFonte, String compMarcaFonte, float compPreco, int compQuantidade, int compSlotsMemoria, int compPotenciaFonte) {
        super(compMarca, compTipoMemoria, compMarcaMemoria, compTipoHD, compMarcaHD, compCapacidadeHD, compTipoFonte, compMarcaFonte, compPreco, compQuantidade, compSlotsMemoria, compPotenciaFonte);
        this.numeroHD = numeroHD;
        this.capacidadeMemoria = capacidadeMemoria;
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
    }
    

    public Servidor(int numeroHD, int capacidadeMemoria, String tipoGabinete, String marcaGabinete) {
        this.numeroHD = numeroHD;
        this.capacidadeMemoria = capacidadeMemoria;
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
    }
    
    // Getters e Setters
    public int getNumeroHD() {
        return numeroHD;
    }

    public void setNumeroHD(int numeroHD) {
        this.numeroHD = numeroHD;
    }

    public int getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public String getMarcaGabinete() {
        return marcaGabinete;
    }

    public void setMarcaGabinete(String marcaGabinete) {
        this.marcaGabinete = marcaGabinete;
    }
 
}
