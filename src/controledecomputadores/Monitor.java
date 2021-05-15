package controledecomputadores;

import java.util.Scanner;

/**
 *
 * @author Jonatas Eleoterio Silva
 */
public class Monitor {
    // Atributos
    private String tipoMonitor, marcaMonitor;
    private int resolucaoMonitor;
    
    // Métodos Públicos
    // Entrada de Dados
    public void monEntradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Monitor--------");
        System.out.print("Tipo Monitor: ");
        setTipoMonitor(sc.nextLine());
        
        System.out.print("Marca Monitor: ");
        setMarcaMonitor(sc.nextLine());
        
        System.out.print("Resolução Monitor: ");
        setResolucaoMonitor(sc.nextInt());
    }
    
    public void mudarTipoMonitor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Tipo Monitor--------");
        System.out.print("Tipo Monitor: ");
        setTipoMonitor(sc.nextLine());
    }
    
    public void mudarMarcaMonitor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca Monitor--------");
        System.out.print("Marca Monitor: ");
        setMarcaMonitor(sc.nextLine());
    }
    
    public void mudarResolucaoMonitor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Resolução Monitor--------");
        System.out.print("Resolução Monitor: ");
        setResolucaoMonitor(sc.nextInt());
    }
    
    // Imprimir
    public void monImprimir() {
        System.out.println("----------------------------------");
        System.out.println("Marca Monitor....: " + getMarcaMonitor());
        System.out.println("Tipo Monitor....: " + getTipoMonitor());
        System.out.println("Resolução Monitor....: " + getResolucaoMonitor());
        System.out.println("----------------------------------");  
    }
    
    // Métodos Construtores
    public Monitor() {
    }
    
    public Monitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }
    
    public Monitor(String tipoMonitor, String marcaMonitor, int resolucaoMonitor) {
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
    }
    
    // Getters e Setters
    public String getTipoMonitor() {
        return tipoMonitor;
    }

    public void setTipoMonitor(String tipoMonitor) {
        this.tipoMonitor = tipoMonitor;
    }

    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    public int getResolucaoMonitor() {
        return resolucaoMonitor;
    }

    public void setResolucaoMonitor(int resolucaoMonitor) {
        this.resolucaoMonitor = resolucaoMonitor;
    }
    
    
    
}
