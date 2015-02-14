package net.surfm.pojokv;

public class Main {

	public static void main(String[] args) {
		Prototype p = new Prototype() ;
		for(AttributeKey ak: p.listKeys()){
			Object o =p.get(ak);
			p.put(ak, o);
		}
		
		int i =p.get(Prototype.ID);
	}

}
