/**
 * Motherboard
 */
public class Motherboard {

  private String model;
  private String manufacturer;
  private int ramslots;
  private int cardslots;
  private String bios;

  public Motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramslots = ramslots;
    this.cardslots = cardslots;
    this.bios = bios;
  }
  public void loadProgram(String programName){
    System.out.println("Program "+programName+" is now loading");
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getRamslots() {
    return ramslots;
  }

  public int getCardslots() {
    return cardslots;
  }

  public String getBios() {
    return bios;
  }
}