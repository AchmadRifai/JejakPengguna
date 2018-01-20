package entity;

@javax.persistence.Entity
@javax.persistence.Table(name="pengguna")
public class Pengguna {
	@javax.persistence.Id
	@javax.persistence.Column(name="kode")
	private String kode;
	@javax.persistence.Column(name="nama")
	private String nama;
	@javax.persistence.Column(name="pass")
	private String pass;
	@javax.persistence.Column(name="loggedin")
	private Boolean loggedin;
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Boolean getLoggedin() {
		return loggedin;
	}
	public void setLoggedin(Boolean loggedin) {
		this.loggedin = loggedin;
	}
}
