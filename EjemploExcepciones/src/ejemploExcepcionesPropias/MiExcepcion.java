package ejemploExcepcionesPropias;

public class MiExcepcion extends Exception{

    public MiExcepcion () {
        super();
    }

    public MiExcepcion(String infoAdicional) {
        super(infoAdicional);
    }

    public MiExcepcion(Long id){
        super();
    }

}
