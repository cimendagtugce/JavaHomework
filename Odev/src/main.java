
public class main {

	public static void main(String[] args) {
       Camp camp1= new Camp(100,"C#+Angular","Engin Demiro�");
       
       Camp camp2= new Camp();
       camp2.id=200;
       camp2.name="Java+React";
       camp2.instructor="Engin Demiro�";
       
       Camp [] camps= {camp1,camp2};
        for (Camp camp : camps) {
        	 System.out.println(camp.name);
        	 System.out.println(camp.instructor); 
        	 System.out.println(camp.id); 
			
		}
        System.out.println(camps.length);
        
        Category category1= new Category();
        category1.id=101;
        category1.name="T�m�";
        
        Category category2= new Category();
        category2.id=102;
        category1.name="Programlama";
        
        CampManager campManager= new CampManager();
        campManager.addCamp(camp1);
        campManager.addCamp(camp2);
        
         
       
        
       
	}

}