package week3.day2;

public class Desktop implements DesktopModel,HardWare {

	public void softwareResources() {
	 System.out.println("softwareResources");
		
	}

	public void Desktopmodels() {
		// TODO Auto-generated method stub
		 System.out.println("Desktopmodels");
	}
	
	public static void main(String[] args) {
		
		Desktop de =new Desktop();
		
		de.softwareResources();
		de.Desktopmodels();
				
		
	}
	

}
