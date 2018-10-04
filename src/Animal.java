public class Animal {
    private String type;
    public String continent;
    private double weight;
    private int age;
 //   private String [] continents;
   // private String continentsString = continents.toString();

   // for(int i = 0; i < continents.length; i++){
    //continents[i] += continent;}

   public String continentsString(String[] continents){

       String result = "[";
       for (int i = 0; i < continents.length; i++) {
               result = result + ",";

           String item = continents[i];
           result = result + item;
       }
       result = result + "]";
       return result; }

    Animal() {
        this.type = "No Type Specified";
        //this.continent = null;
        this.weight = 0.0;
        this.age = 0;
        this.continent = null;
    }

    Animal(String type, String continent, double weight, int age) {
        setType(type);
        setContinent(continent);
        setWeight(weight);
        setAge(age);
       // this.continents = continentsString;
       // setContinentsString(continentsString);
        this.type = type;
        this.continent = continent;
        this.weight = weight;
        this.age = age;
        //this.continentsString = setContinentsString();
        //continents = new String[]{"Europe", "Africa", "Asia"};
    }






    private String getType() {
        return type;
    }

   private String getContinent() {
       return continent;
   }

    private double getWeight() {
        return weight;
    }

    private int getAge() {
        return age;
    }

   // private String getContinentsString(){
     //   return continentsString;
    //}





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

   // private void setContinentsString(String continentsString) {
    //    this.continentsString = continentsString;
   // }


    @Override
    public String toString() {
       /* return "Type: " + type + "\nContinent: " + continent +
                "\nWeight: " + weight + "\nAge: " + age;*/

        return "Type: " + getType()  + "\nContinent: " + getContinent()+
                "\nWeight: " + getWeight() + "\nAge: " + getAge() /*+ "\nContinents: " +continentsString/*.continents*/;


    }
}

