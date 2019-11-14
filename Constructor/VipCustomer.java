class VipCustomer{
  private String name;
  private double credit_limit;
  private String email_address;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCredit_limit() {
		return this.credit_limit;
	}

	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}

	public String getEmail_address() {
		return this.email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

  
  
  public VipCustomer() {
  }

  public function VipCustomer(){
    this("defaultvalue",999,"defaultemail");
  }

  public function VipCustomer(String name,String email_address){
    this(name,0.00,email_address);
    this.name=name;
    this.email_address=email_address;
  }
}