package co.edu.utp.maffuonline.payment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nit")
	private int nit;

	@Column(name = "namecompany")
	private String namecompany;

	@Column(name = "typecompany")
	private String typecompany;

	@Column(name = "invoicereference")
	private int invoicereference;

	public Payment() {

	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public String getNamecompany() {
		return namecompany;
	}

	public void setNamecompany(String namecompany) {
		this.namecompany = namecompany;
	}

	public String getTypecompany() {
		return typecompany;
	}

	public void setTypecompany(String typecompany) {
		this.typecompany = typecompany;
	}

	public int getInvoicereference() {
		return invoicereference;
	}

	public void setInvoicereference(int invoicereference) {
		this.invoicereference = invoicereference;
	}

}
