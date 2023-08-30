
package lotestrabajo;

public class Registro {
    private float coefAvaluoEdificio;
    String municipio;
    private float tasa;
    
    public Registro() {
        
}
    public float valuar () {
        return getTasa();
}
    public void registrar(){

        
    }
    public void emitirBoletos (){
        
    }

    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public void setCoefAvaluoEdificio(float coefAvaluoEdificio) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
}
