public class ArmaCorta extends Arma{
    private boolean esAutomatica;

    // Methods
    public boolean tieneAlcance200Mts(){
        if(this.alcence > 200.0){
            return true;
        } else {
            return false;
        }
    }

    // Constructor
    public ArmaCorta(int cantMunicionesMax, double alcence, String marca, double calibre, String estado, boolean esAutomatica) {
        super(cantMunicionesMax, alcence, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }
}
