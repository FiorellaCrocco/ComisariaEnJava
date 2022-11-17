public abstract class Arma {
    protected int cantMunicionesMax;
    protected double alcence;
    protected String marca;
    protected double calibre;
    protected String estado;

    // Constructor

    public Arma(int cantMunicionesMax, double alcence, String marca, double calibre, String estado) {
        this.cantMunicionesMax = cantMunicionesMax;
        this.alcence = alcence;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    // Methods
    public boolean poderSerUsada(){
        if (this.estado.equals("EN USO") && this.calibre >= 9){
            return true;
        } else{
            return false;
        }
    }

    // Getters
    public int getCantMunicionesMax() {
        return cantMunicionesMax;
    }

    public double getAlcence() {
        return alcence;
    }

    public String getMarca() {
        return marca;
    }

    public double getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    // Setter
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
