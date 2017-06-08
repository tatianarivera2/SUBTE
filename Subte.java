public class Subte {
public static void main(String[] args) {
	String[] Estaciones = {"Las Heras", "Santa Fe", "Cordoba", "Corrientes", "Once", "Venezuela", "Humberto 1", "Inclan", "Caseros", "Parque Patricios", "Hospitales"};
	String dayOfWeekArg = null;
	String estacionFinal = null;
	int i;
	ObjetoRobot robot = new ObjetoRobot();
	
	boolean error;
	int k;
	
	do {
		i=99;
		System.out.println("¿En què estaciòn està?");
		dayOfWeekArg =robot.LeerTexto();
		error = false;
		switch (dayOfWeekArg) {
	         case "Las Heras":
	             i=0;	             
	             break;
	         case "Santa Fe":
	        	 i=1;
	         case "Cordoba":
	        	 i=2;
	        	 break;
	         case "Corrientes":
	        	 i=3;
	             break;
	         case "Once":
	        	 i=4;
	             break;
	         case "Venezuela":
	        	 i=5;
	        	 break;
	         case "Humberto 1":
	        	 i=6;
	        	 break;
	         case "Inclan":
	        	 i=7;
	        	 break;
	         case "Caseros":
	        	 i=8;
	        	 break;
	         case "Parque Patricios":
	        	 i=9;
	        	 break;
	         case "Hospitales":
	        	 i=10;
	         break;
	         default:
	            System.out.println("Ingrese estaciòn vàlida");
	        	 error=true;
	            
	
	}
	} while (error);
	
		
		
		do {
			error=false;  
			k=0;
			System.out.println("¿En què estaciòn baja?");
			estacionFinal =robot.LeerTexto();
		
		   
			switch (estacionFinal) {
		         case "Las Heras":
		             k=0;	             
		             break;
		         case "Santa Fe":
		        	 k=1;
		         case "Cordoba":
		        	 k=2;
		        	 break;
		         case "Corrientes":
		        	 k=3;
		             break;
		         case "Once":
		        	 k=4;
		             break;
		         case "Venezuela":
		        	 k=5;
		        	 break;
		         case "Humberto 1":
		        	 k=6;
		        	 break;
		         case "Inclan":
		        	 k=7;
		        	 break;
		         case "Caseros":
		        	 k=8;
		        	 break;
		         case "Parque Patricios":
		        	 k=9;
		        	 break;
		         case "Hospitales":
		        	 k=10;
		         break;
		         default:
		        	 System.out.println("Ingrese estaciòn vàlida");
		             error=true;
			}
		    }while(error);
		    
		for (int j = i; j < k; j++) {
			System.out.println("Abriendo Puerta..");
			System.out.println("Usted se encuentra en "+ Estaciones[j]);
			System.out.println("Cerrando Puerta..");
			
		}
		System.out.println("Ha llegado a destino");
	}
	

}
