package main.java.com.lab.fruits;

abstract public class Fruit {
    private double weight;
    private double water_content;
    private double sugar_content;
    private Color color;


    public double getSugar_content() {
        return sugar_content;
    }

    public void setSugar_content(double sugar_content) {
        this.sugar_content = sugar_content;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWater_content() {
        return water_content;
    }

    public void setWater_content(double water_content) {
        this.water_content = water_content;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static double computeWeight(Fruit[] fruits) {
        double totalWeight = 0;
        for(Fruit f: fruits){
            totalWeight += f.getWeight();
        }
        return totalWeight;
    }

    public static double computeSugarContent(Fruit[] fruits) {
        double totalSugarContent = 0;
        for(Fruit f: fruits){
            totalSugarContent += f.getSugar_content();
        }
        return totalSugarContent;
    }

    public static void prepareFruit(Fruit[] fruits) {
        for (Fruit f: fruits){
            if(f instanceof Peelable){
                ((Peelable) f).peelOff();
            }
            if(f instanceof SeedRemovable){
                ((SeedRemovable) f).removeSeeds();
            }
        }
    }

    public enum Color {
        RED,
        YELLOW,
        PURPLE,
        GREEN
    }
}
