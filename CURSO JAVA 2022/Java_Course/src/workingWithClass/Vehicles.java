package workingWithClass;

public class Vehicles{

    private String branch = "Honda";
    private String model = "Civic";
    private String color ="White";
    private int motor= 2000;

  public String getColor() {
      return color;
  }
  public String getBranch() {
      return branch;
  }
  public String getModel() {
      return model;
  }
  public int getMotor() {
      return motor;
  }
  public void setBranch(String branch) {
      this.branch = branch;
  }
  public void setColor(String color) {
      this.color = color;
  }
  public void setModel(String model) {
      this.model = model;
  }
  public void setMotor(int motor) {
      this.motor = motor;
  }

public String details(){     

 String det = "Branch: " + this.branch + "\n"+ "Modelo: " + this.model + "\n" + "Color: " + this.color + "\n" + "Motor: " + this.motor;

 return det;
}

public String speed (int v ){
    return "es capaz de alcanzar: " + v + " Km/h";
} 
}
