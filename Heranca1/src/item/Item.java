package item;

public class Item {

    private int cod;
    private String desc;

    public Item(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public Item() {

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        if(desc.length() > 0);
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item{");
        sb.append("cod=").append(cod);
        sb.append(", desc=").append(desc);
        sb.append('}');
        return sb.toString();
    }
    
    
}
