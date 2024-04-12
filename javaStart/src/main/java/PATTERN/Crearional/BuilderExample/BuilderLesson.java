package PATTERN.Crearional.BuilderExample;

import javaCore.generic.B;

public class BuilderLesson {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("Green").setSpeed(255).build();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getSpeed());
        System.out.println(sportCar.getColor());


    }
}
class SportCar{
    private String name;
    private String color;
    private int speed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color = "white";
        this.speed = builder.speed = 0;
    }
    static class Builder{
        private String name;
        private String color;
        private int speed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }
        public SportCar build(){
            return new SportCar(this);
        }
    }
}

