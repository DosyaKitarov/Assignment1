public class Phone{

    private String number;
    private String model;
    private double weight;



    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber(){
        return number;
    }



    public void receiveCall(String caller)
    {
        System.out.println(caller + " is ringing");
    }

    Phone(String number, String model, double weight)// constructor with 3 parameters
    {
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    Phone(String number, String model)// constructor wth 2 parameters
    {
        this(number, model, 0.0);
    }
    Phone()// no parameters
    {
        this.number="";
        this.model = "";
        this.weight=0.0;
    }

    public void receiveCall(String callerName, String callerNumber) //Overload
    {
        System.out.println(callerName + " (" + callerNumber + ") is ringing");
    }

    public void sendMessage(String... numbers) {
        System.out.println("Sending message to: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "This phone properties:\n" +
                "Number: " + number + "\n" +
                "Model: " + model + '\n' +
                "Weight: " + weight + "\n";
    }
}