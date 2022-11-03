package Ambiente;

public class Ambiente {
    private float area;

    public Ambiente(float area) {
        this.area = area;
    }

    public Ambiente() {
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        if(area > 0)
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ambiente{");
        sb.append("area=").append(area);
        sb.append('}');
        return sb.toString();
    }
    
    
}
