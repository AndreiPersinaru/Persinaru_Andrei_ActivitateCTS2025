package RESTAURANT.B14.clase;

public abstract class Template {
    public void ocupaMasa(){
        curataMasa();
        puneServetele();
        aseazaTacamuri();
        cheamaClientii();
    }

    protected abstract void curataMasa();
    protected abstract void puneServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void cheamaClientii();
}
