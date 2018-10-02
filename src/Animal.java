public class Animal {
    private String type;
    private String continent;
    private double weight;
    private int age;


    Animal() {
        this.type = "No Type Specified";
        this.continent = null;
        this.weight = 0.0;
        this.age = 0;
    }

    Animal(String type, String continent, double weight, int age) {
        setType(type);
        setContinent(continent);
        setWeight(weight);
        setAge(age);
        this.type = type;
        this.continent = continent;
        this.weight = weight;
        this.age = age;
    }


    private String getType() {
        return type;
    }

    private String getContinent() {
        return continent;
    }

    private double getWeigth() {
        return weight;
    }

    private int getAge() {
        return age;
    }


    private void setType(String type) {
        this.type = type;
    }

    private void setContinent(String continent) {
        this.continent = continent;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
       /* return "Type: " + type + "\nContinent: " + continent +
                "\nWeight: " + weight + "\nAge: " + age;*/

        return "Type: " + getType() + "\nContinent: " + getContinent() +
                "\nWeight: " + getWeigth() + "\nAge: " + getAge();


    }
}

