public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height ;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;


    public Patient(int id ,String name,int birthYear,double height , double weight ,String bloodGroup , String phoneNumber){
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        if(birthYear <=0){
            System.out.println("invalid");
        }else {
            this.birthYear = birthYear;
        }
        if(height <= 0){
            System.out.println("invalid");
        }else {
            this.height = height;
        }
        if(weight <=0){
            System.out.println("invalid");
        }else {
            this.weight = weight;
        }
    }

    public int getAge(int currentYear){
        if(currentYear > birthYear) {
            return currentYear - birthYear;
        }else{
            return 0;
        }
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getBloodGroup(){
        return this.bloodGroup;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public  double getBMI(){
        double BMI = weight/((height/100.0)*(height/100.0));
        if(height > 0 && weight >0){
            return BMI;
        }else{
            return 0.0;
        }
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood: " + bloodGroup);
        System.out.println("Patient Phone: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
    }

}

