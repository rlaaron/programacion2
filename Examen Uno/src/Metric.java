public class Metric {
    private Date date;
    private int weight, height;

    public Metric(Date date, int weight, int height) {
        this.date = date;
        this.weight = weight;
        this.height = height;
    }

    public Metric() {
        this.date = new Date();
        this.weight = 0;
        this.height = 0;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override

    public String toString() {
        return "Metrics [date=" + date + ", height=" + height + ", weight=" + weight + "]";
    }
}
