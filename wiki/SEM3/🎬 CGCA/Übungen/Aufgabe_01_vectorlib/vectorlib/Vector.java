/**
 *
 * @author vitzthum
 */
package vectorlib;

public class Vector {
    private final double x,y,z;

    
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //a.	Eine Funktion, die zwei dreidimensionale Vektoren addiert    
    public Vector plus(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    
    //b.	Eine Funktion, die einen dreidimensionalen Vektor mit einem Skalar multipliziert
    public Vector scale(double s) {
        return new Vector(this.x * s, this.y * s, this.z * s);
    }
    
    //c.	Eine Funktion, die die Laenge eines Vektors errechnet
    public double length(Vector v) {
        double l = Math.sqrt(v.x * v.x + v.y * v.y + v.z * v.z);
        return l;
    }
    
    //d.	Eine Funktion, die das Skalarprodukt  zweier Vektoren bildet
    public double dot(Vector v) {
        double s = this.x * v.x + this.y * v.y + this.z * v.z;
        return s;
    }
    
    //e.	Eine Funktion, die einen Vektor normiert
    public Vector normalized() {
        double l = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        return new Vector(1/l * this.x , 1/l * this.y ,1/l * this.z );
    }
    
    //f.	Eine Funktion, die den Winkel zwischen zwei Vektoren errechnet (in Gruppe 2 schon erledigt)
    public double angleInDeg (Vector v) {
        double dotp = this.dot(v);
        double lt = this.length(this);
        double lv = length(v);
        double w = Math.acos(dotp/(lt * lv));
        return Math.toDegrees(w);
        
    }
    
    //g.	Eine Funktion, die das Kreuzprodukt zwischen zwei dreidimensionalen Vektoren errechnet
    public Vector cross(Vector v) {
        return new Vector(this.y * v.z - this.z * v.y, this.z * v.x - this.x * v.z , this.x * v.y - this.y * v.x);
    }
    
    //h.	Eine Funktion, die die Differenz (einen Vektor) zwischen zwei Punkten (d.h. Ortsvektoren) bildet
    public Vector minus(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }
    
    //i.	Eine Funktion, die den Abstand zwischen zwei Punkten (d.h. Ortsvektoren) berechnet
    public double distance(Vector v) {
        Vector diff = this.minus(v);
        double dis = Math.sqrt(diff.dot(diff));
        return dis;
    }
    
    //Die Klasse soll zudem �ber Get-Methoden f�r den Zugriff auf die Komponenten x,y,z eines Vektors verf�gen (z.B. getX() f�r die Abfrage der x-Komponente eines Vektors)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }    
    
    @Override
    public String toString() {
        return x+","+y+","+z;
    }

}
