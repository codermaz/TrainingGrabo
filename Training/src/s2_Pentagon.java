import java.awt.Polygon;

//Die Klasse Polygon implementiert das Interface Shape
public class s2_Pentagon extends Polygon {

	s2_Pentagon() {
		super();
		this.addPoint(0, 0);
		this.addPoint(100, 0);
		this.addPoint(150, 100);
		this.addPoint(100, 200);
		this.addPoint(0, 200);
		//this.addPoint(-100, 100);
	}

}
