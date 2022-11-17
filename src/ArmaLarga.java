public class ArmaLarga extends Arma implements Comparable<ArmaLarga>{
    private boolean tieneSelloDelRENAR;
    private String descripcionDelUso;
    private int nivel;


    // Constructor


    public ArmaLarga(int cantMunicionesMax, double alcence, String marca, double calibre, String estado, boolean tieneSelloDelRENAR, String descripcionDelUso, int nivel) {
        super(cantMunicionesMax, alcence, marca, calibre, estado);
        this.tieneSelloDelRENAR = tieneSelloDelRENAR;
        this.descripcionDelUso = descripcionDelUso;
        this.nivel = nivel;
    }

    // Interfaz

    @Override
    public int compareTo(ArmaLarga arma) {
        if (this.nivel > arma.nivel) {
            return 1;
        } else if (this.nivel < arma.nivel) {
            return -1;
        } else {
            return 0;
        }
    }
}


