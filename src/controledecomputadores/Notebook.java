package controledecomputadores;

import java.util.Scanner;

/**
 *
 * @author Jonatas Eleoterio Silva
 */
public class Notebook extends Computador {
    // Atributos
    private Monitor monitor;
    
    // Métodos Públicos
    // Entrada de Dados
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Notebook--------");
        this.compEntradaDados();
    }
    
    // Imprimir
    public void imprimir() {
        System.out.println("----------------------------------");
        this.compImprimir();
        this.monitor.monImprimir();
        System.out.println("----------------------------------");  
    }
    // Métodos Construtores

    public Notebook(Monitor monitor) {
        this.monitor = monitor;
    }

    public Notebook(Monitor monitor, String compMarca, float compPreco, int compQuantidade) {
        super(compMarca, compPreco, compQuantidade);
        this.monitor = monitor;
    }

    public Notebook(Monitor monitor, String compMarca, String compTipoMemoria, String compMarcaMemoria, String compTipoHD, String compMarcaHD, String compCapacidadeHD, String compTipoFonte, String compMarcaFonte, float compPreco, int compQuantidade, int compSlotsMemoria, int compPotenciaFonte) {
        super(compMarca, compTipoMemoria, compMarcaMemoria, compTipoHD, compMarcaHD, compCapacidadeHD, compTipoFonte, compMarcaFonte, compPreco, compQuantidade, compSlotsMemoria, compPotenciaFonte);
        this.monitor = monitor;
    }
    
    // Getters e Setters
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
}
