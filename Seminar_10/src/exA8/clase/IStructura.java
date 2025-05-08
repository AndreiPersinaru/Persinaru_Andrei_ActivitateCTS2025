package exA8.clase;

public interface IStructura {
    void descriereStructura();

    void adaugaNod(IStructura iStructura) throws Exception;
    void stergeNod(IStructura iStructura) throws Exception;
    IStructura getNodCopil(int index) throws Exception;


}
