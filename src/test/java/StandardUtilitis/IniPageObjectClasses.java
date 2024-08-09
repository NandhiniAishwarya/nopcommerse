package StandardUtilitis;



import Pages.AddCustomerPageObjects;
import Pages.ProductsPage;


public class IniPageObjectClasses {

	
	public AddCustomerPageObjects customerPageObjects() {
		  
        
		  return new AddCustomerPageObjects();
	   }

	  
	  public ProductsPage productPageObjects() {
		  
		  return new ProductsPage();
	  }
	  
	  
	  
}
