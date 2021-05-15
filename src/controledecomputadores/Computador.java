package controledecomputadores;
import java.util.Scanner;
/**
 *
 * @author Jonatas Eleoterio Silva
 */
public abstract class Computador {
    // Atributos
    private String compMarca, compTipoMemoria, compMarcaMemoria, compTipoHD, compMarcaHD, compCapacidadeHD, compTipoFonte, compMarcaFonte;
    private float compPreco;
    private int compQuantidade, compSlotsMemoria, compPotenciaFonte;

    // Métodos Públicos
    // Entrada de Dados
    public void compEntradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Computador--------");
        System.out.print("Marca: ");
        setCompMarca(sc.nextLine());
        
        System.out.print("Marca Memória: ");
        setCompMarcaMemoria(sc.nextLine());
        
        System.out.print("Tipo Memória: ");
        setCompTipoMemoria(sc.nextLine());
        
        System.out.print("Tipo HD: ");
        setCompTipoHD(sc.nextLine());
        
        System.out.print("Marca HD: ");
        setCompMarcaHD(sc.nextLine());
        
        System.out.print("Capacidade HD: ");
        setCompCapacidadeHD(sc.nextLine());
        
        System.out.print("Tipo Fonte: ");
        setCompTipoFonte(sc.nextLine());
        
        System.out.print("Marca Fonte: ");
        setCompMarcaFonte(sc.nextLine());
        
        System.out.print("Preço: ");
        setCompPreco(sc.nextFloat());
        
        System.out.print("Potência Fonte: ");
        setCompPotenciaFonte(sc.nextInt());
        
        System.out.print("Quantidade: ");
        setCompQuantidade(sc.nextInt());
        
        System.out.print("Slots Memória: ");
        setCompSlotsMemoria(sc.nextInt());
    }
    
    public void mudarCompMarca() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca--------");
        System.out.print("Marca: ");
        setCompMarca(sc.nextLine());
    }
    
    public void mudarCompPreco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Preço--------");
        System.out.print("Preço: ");
        setCompPreco(sc.nextFloat());
    }
 
    public void mudarCompQuantidade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Quantidade--------");
        System.out.print("Quantidade: ");
        setCompQuantidade(sc.nextInt());
    }
    
    public void mudarCompSlotsMemoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Slots Memória--------");
        System.out.print("Slots Memória: ");
        setCompSlotsMemoria(sc.nextInt());
    }
    
    public void mudarCompTipoMemoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Tipo Memória--------");
        System.out.print("Tipo Memória: ");
        setCompTipoMemoria(sc.nextLine());
    }   
    
    public void mudarCompMarcaMemoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca Memória--------");
        System.out.print("Marca Memória: ");
        setCompMarcaMemoria(sc.nextLine());
    }
    
    public void mudarCompTipoHD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Tipo HD--------");
        System.out.print("Tipo HD: ");
        setCompTipoHD(sc.nextLine());
    }
    
    public void mudarCompMarcaHD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca HD--------");
        System.out.print("Marca HD: ");
        setCompMarcaHD(sc.nextLine());
    }
    
    public void mudarCompCapacidadeHD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Capacidade HD--------");
        System.out.print("Capacidade HD: ");
        setCompCapacidadeHD(sc.nextLine());
    }
    
    public void mudarCompTipoFonte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Tipo Fonte--------");
        System.out.print("Tipo Fonte: ");
        setCompTipoFonte(sc.nextLine());
    }
    
    public void mudarCompMarcaFonte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Marca Fonte--------");
        System.out.print("Marca Fonte: ");
        setCompMarcaFonte(sc.nextLine());
    }
    
    public void mudarCompPotenciaFonte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Potência Fonte--------");
        System.out.print("Potência Fonte: ");
        setCompPotenciaFonte(sc.nextInt());
    }
    
    // Imprimir
    public void compImprimir() {
        System.out.println("----------------------------------");
        System.out.println("Marca....: " + getCompMarca());
        System.out.println("Preço....: " + getCompPreco());
        System.out.println("Quantidade....: " + getCompQuantidade());
        System.out.println("Slots Memória....: " + getCompSlotsMemoria());
        System.out.println("Tipo Memória....: " + getCompTipoMemoria());
        System.out.println("Marca Memória....: " + getCompMarcaMemoria());
        System.out.println("Tipo HD....: " + getCompTipoHD());
        System.out.println("Marca HD....: " + getCompMarcaHD());
        System.out.println("Capacidade HD....: " + getCompCapacidadeHD());
        System.out.println("Tipo Fonte....: " + getCompTipoFonte());
        System.out.println("Marca Fonte....: " + getCompMarcaFonte());
        System.out.println("Potência Fonte....: " + getCompPotenciaFonte());
        System.out.println("----------------------------------");  
    }
       
    // Métodos Construtores
    
    public Computador(){ }
    
    public Computador(String compMarca, String compTipoMemoria, String compMarcaMemoria, String compTipoHD, String compMarcaHD, String compCapacidadeHD, String compTipoFonte, String compMarcaFonte, float compPreco, int compQuantidade, int compSlotsMemoria, int compPotenciaFonte) {
        this.compMarca = compMarca;
        this.compTipoMemoria = compTipoMemoria;
        this.compMarcaMemoria = compMarcaMemoria;
        this.compTipoHD = compTipoHD;
        this.compMarcaHD = compMarcaHD;
        this.compCapacidadeHD = compCapacidadeHD;
        this.compTipoFonte = compTipoFonte;
        this.compMarcaFonte = compMarcaFonte;
        this.compPreco = compPreco;
        this.compQuantidade = compQuantidade;
        this.compSlotsMemoria = compSlotsMemoria;
        this.compPotenciaFonte = compPotenciaFonte;
    }

    public Computador(String compMarca, float compPreco, int compQuantidade) {
        this.compMarca = compMarca;
        this.compPreco = compPreco;
        this.compQuantidade = compQuantidade;
    }

    public Computador(String compMarca, String compMarcaMemoria, String compMarcaHD, String compMarcaFonte) {
        this.compMarca = compMarca;
        this.compMarcaMemoria = compMarcaMemoria;
        this.compMarcaHD = compMarcaHD;
        this.compMarcaFonte = compMarcaFonte;
    }

    public Computador(String compTipoMemoria, String compTipoHD, String compTipoFonte) {
        this.compTipoMemoria = compTipoMemoria;
        this.compTipoHD = compTipoHD;
        this.compTipoFonte = compTipoFonte;
    }
    
    // Setters e Getters
    public String getCompMarca() {
        return compMarca;
    }

    public void setCompMarca(String compMarca) {
        this.compMarca = compMarca;
    }

    public String getCompTipoMemoria() {
        return compTipoMemoria;
    }

    public void setCompTipoMemoria(String compTipoMemoria) {
        this.compTipoMemoria = compTipoMemoria;
    }

    public String getCompMarcaMemoria() {
        return compMarcaMemoria;
    }

    public void setCompMarcaMemoria(String compMarcaMemoria) {
        this.compMarcaMemoria = compMarcaMemoria;
    }

    public String getCompTipoHD() {
        return compTipoHD;
    }

    public void setCompTipoHD(String compTipoHD) {
        this.compTipoHD = compTipoHD;
    }

    public String getCompMarcaHD() {
        return compMarcaHD;
    }

    public void setCompMarcaHD(String compMarcaHD) {
        this.compMarcaHD = compMarcaHD;
    }

    public String getCompCapacidadeHD() {
        return compCapacidadeHD;
    }

    public void setCompCapacidadeHD(String compCapacidadeHD) {
        this.compCapacidadeHD = compCapacidadeHD;
    }

    public String getCompTipoFonte() {
        return compTipoFonte;
    }

    public void setCompTipoFonte(String compTipoFonte) {
        this.compTipoFonte = compTipoFonte;
    }

    public String getCompMarcaFonte() {
        return compMarcaFonte;
    }

    public void setCompMarcaFonte(String compMarcaFonte) {
        this.compMarcaFonte = compMarcaFonte;
    }

    public float getCompPreco() {
        return compPreco;
    }

    public void setCompPreco(float compPreco) {
        this.compPreco = compPreco;
    }

    public int getCompQuantidade() {
        return compQuantidade;
    }

    public void setCompQuantidade(int compQuantidade) {
        this.compQuantidade = compQuantidade;
    }

    public int getCompSlotsMemoria() {
        return compSlotsMemoria;
    }

    public void setCompSlotsMemoria(int compSlotsMemoria) {
        this.compSlotsMemoria = compSlotsMemoria;
    }

    public int getCompPotenciaFonte() {
        return compPotenciaFonte;
    }

    public void setCompPotenciaFonte(int compPotenciaFonte) {
        this.compPotenciaFonte = compPotenciaFonte;
    }
    
}
