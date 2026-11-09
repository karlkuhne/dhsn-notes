package vectorlib;

public class Test {
	   public static void main(String[] args) {
	        Vector v1 = new Vector(1,2,3);
	        System.out.println("v1:"+v1);
	        
	        Vector v2 = new Vector(4,5,6);
	        System.out.println("v2:"+v2);

			//Test (a)
			Vector result = v1.plus(v2);
			System.out.println("Ergebnis der Addition:"+result);
			
			//Test (b)
 			result = v1.scale(2.0d);
			System.out.println("Ergebnis der Skalierung:"+result);
			
			//Test (c)
			double length = v1.length(v1);
			System.out.println("Laenge von v1:"+length);
			
			//Test (d)
			System.out.println("Skalarprodukt von v1 und v2:"+v1.dot(v2)); 
			
			//Test (e)
			System.out.println("v1 normalisiert:"+v1.normalized());
			
			//Test (f) und (g)
			System.out.println("Winkel zwischen Kreuzprodukt v1xv2 und v1:"+
				v1.cross(v2).angleInDeg(v1)
			);
						
			System.out.println("Winkel zwischen Kreuzprodukt v1xv2 und v2:"+
				v1.cross(v2).angleInDeg(v2)
			);
			
			//Test (h) und (i)
			System.out.println("Abstand von v1 und v2:"+v1.distance(v2)); 
	    }
}
