package b32;

import java.util.Objects;

public class myDate {
	private int ngay=1,thang=1,nam=1;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() { 
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public myDate(int ngay, int thang, int nam) {
		if(ngay<=31) {this.ngay = ngay;}
		if(thang<=12) {this.thang = thang;}
		if(nam>0) {this.nam = nam;}
	}
	
	@Override
	public String toString() {
		return this.ngay+"/"+this.thang+"/"+this.nam;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nam, ngay, thang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myDate other = (myDate) obj;
		return nam == other.nam && ngay == other.ngay && thang == other.thang;
	}
	
}
