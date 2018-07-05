package agregacao;

import java.util.ArrayList;

public class Time {
	private String nomeAtleta;
	private ArrayList<Atleta> atleta;
	
	public Time() {
		atleta = new ArrayList<Atleta>();
	}
	
	public void add(Atleta umAtleta) {
		atleta.add(umAtleta);
	}
}
