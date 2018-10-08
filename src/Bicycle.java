public class Bicycle {

    private String name;
    private  double value;
    private String make;

    public Bicycle() {
        this.name = "No Name";
        this.value = 000.00;
        this.make = "No Make";
    }

    public Bicycle(String name, double value, String make) {
        setName(name);
        setValue(value);
        setMake(make);
    }

        public void setName(String name) {
            this.name = name;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public void setMake(String make) {
            this.make = make;
        }

    @Override
    public String toString() {
        return "Owner's Name: " + name + "\nValue: " + value + "\nMake: " + make;
    }
    }

