package lesson3.hw3;

abstract class Fruit {

    private float weight;

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}
