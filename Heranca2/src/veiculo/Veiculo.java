package veiculo;

public class Veiculo {
    private boolean motor;

    public Veiculo(boolean motor) {
        this.motor = motor;
    }

    public Veiculo() {
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veiculo{");
        sb.append("motor=").append(motor);
        sb.append('}');
        return sb.toString();
    }
    
    
}
