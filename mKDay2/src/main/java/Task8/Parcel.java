package Task8;

public class Parcel {
    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean express;

    public Parcel(int xLenght, int yLenght, int zLenght, float weight, boolean express) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.express = express;

    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLenght=" + xLenght +
                ", yLenght=" + yLenght +
                ", zLenght=" + zLenght +
                ", weight=" + weight +
                ", express=" + express +
                '}';
    }

    public int getxLenght() {
        return xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return express;
    }
}
