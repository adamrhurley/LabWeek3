public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public Animal() {
        this.type = "No Type Specified";
        this.weight = 0.0;
        this.age = 0;
        this.continents = null;
    }

    public Animal(String type, String[] continents, double weight, int age) {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);

    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

       String conts="";

       if(continents==null)
       {
           conts = "No continents specified";
       }
       else
       {
           for (int i = 0; i < continents.length; i++) {

               conts += continents[i] + " ";
           }

       }

        return "Type: " + getType()  + "\nContinent: " + conts +
                "\nWeight: " + getWeight() + "\nAge: " + getAge() /*+ "\nContinents: " +continentsString/*.continents*/;


    }
}