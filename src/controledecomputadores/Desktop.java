package controledecomputadores;

import java.util.Scanner;

/**
 *
 * @author Jonatas Eleoterio Silva
 */
public class Desktop extends Computador {
    private Monitor monitor;
    private String marcaPlacaVideo;
    private int placasVideo;

   
    // Métodos Públicos
    // Entrada de Dados
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Desktop--------");
        this.compEntradaDados();

        System.out.print("Marca PlacaVideo: ");
        setMarcaPlacaVideo(sc.nextLine());
        
        System.out.print("Placas Video: ");
        setPlacasVideo(sc.nextInt());
    }
    
    public void mudarMarcaPlacaVideo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca PlacaVideo--------");
        System.out.print("Marca PlacaVideo: ");
        setMarcaPlacaVideo(sc.nextLine());
    }
    
    public void mudarPlacasVideo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Placas Video--------");
        System.out.print("Placas Video: ");
        setPlacasVideo(sc.nextInt());
    }
    
    // Imprimir
    public void imprimir() {
        System.out.println("----------------------------------");
        this.compImprimir();
        System.out.println("Marca PlacaVideo....: " + getMarcaPlacaVideo());
        System.out.println("placas Video....: " + getPlacasVideo());
        this.monitor.monImprimir();
        System.out.println("----------------------------------");  
    }
    
    // Métodos Construtores
    public Desktop(Monitor monitor) {
        this.monitor = monitor;
    }

    public Desktop(Monitor monitor, String marcaPlacaVideo, int placasVideo) {
        this.monitor = monitor;
        this.marcaPlacaVideo = marcaPlacaVideo;
        this.placasVideo = placasVideo;
    }

    public Desktop(Monitor monitor, String marcaPlacaVideo, int placasVideo, String compMarca, String compTipoMemoria, String compMarcaMemoria, String compTipoHD, String compMarcaHD, String compCapacidadeHD, String compTipoFonte, String compMarcaFonte, float compPreco, int compQuantidade, int compSlotsMemoria, int compPotenciaFonte) {
        super(compMarca, compTipoMemoria, compMarcaMemoria, compTipoHD, compMarcaHD, compCapacidadeHD, compTipoFonte, compMarcaFonte, compPreco, compQuantidade, compSlotsMemoria, compPotenciaFonte);
        this.monitor = monitor;
        this.marcaPlacaVideo = marcaPlacaVideo;
        this.placasVideo = placasVideo;
    }
    
    

    // Getters e Setters
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public void setMarcaPlacaVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    public int getPlacasVideo() {
        return placasVideo;
    }

    public void setPlacasVideo(int placasVideo) {
        this.placasVideo = placasVideo;
    }
   
   
}
