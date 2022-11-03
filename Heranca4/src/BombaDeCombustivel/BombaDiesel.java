package BombaDeCombustivel;

public class BombaDiesel extends Bomba {

    public BombaDiesel(double totLitro, float valorLitro) {
        super(totLitro, valorLitro);
    }

    public BombaDiesel() {
    }

    @Override
    public boolean abastecerValor(double valor) {
        return super.abastecerValor(valor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean abastecerLitro(int litros) {
        return super.abastecerLitro(litros); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
