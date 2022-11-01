package gectinKaldınMini;

public class Hesapla {
	private float vize ;
	private float sonSınav;
	private float ortalama;

	public float ortalama() {
		this.ortalama=(this.vize*100/40)+(this.sonSınav*100/60);
		return(ortalama);
	}
	
	
	public float getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(float ortalama) {
		this.ortalama = ortalama;
	}
	Hesapla(float vize , float sonSınav){
		this.vize = vize;
		this.sonSınav = sonSınav;
	}
	
	public float getVize() {
		return vize;
	}

	public void setVize(float vize) {
		this.vize = vize;
	}

	public float getSonSınav() {
		return sonSınav;
	}

	public void setSonSınav(float sonSınav) {
		this.sonSınav = sonSınav;
	}

	
}
