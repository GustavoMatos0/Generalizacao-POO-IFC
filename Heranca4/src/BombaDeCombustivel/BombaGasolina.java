package BombaDeCombustivel;

public class BombaGasolina extends Bomba {

    public BombaGasolina(double totLitro, float valorLitro) {
        super(totLitro, valorLitro);
    }

    public BombaGasolina() {
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
