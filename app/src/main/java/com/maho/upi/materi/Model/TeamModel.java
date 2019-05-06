package com.maho.upi.materi.Model;

public class TeamModel {
	private String nama;
	private String deskripsi;
	private String ikon;
	private String image;

	public TeamModel(String nama, String deskripsi, String ikon, String image) {
		this.nama = nama;
		this.deskripsi = deskripsi;
		this.ikon = ikon;
		this.image = image;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public String getIkon() {
		return ikon;
	}

	public void setIkon(String ikon) {
		this.ikon = ikon;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
