class Car{
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;

  public void setModel(String something){
    String valModel=something.toLowerCase();
    if (valModel.equals("tata")){
      this.model=something;
    }else{
      this.model="unknown";
    }
  }
  public String getModel(){
    return this.model;
  }


}