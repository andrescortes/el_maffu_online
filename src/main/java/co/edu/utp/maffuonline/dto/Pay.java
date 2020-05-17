package co.edu.utp.maffuonline.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class Pay implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4446488657878594079L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nit")
	private int nit;

	@Column(name = "namecompany")
	private String namecompany;

	@Column(name = "typecompany")
	private String typecompany;

	@Column(name = "invoicereference")
	private int invoicereference;

	public Pay(int nit, String namecompany, String typecompany, int invoicereference) {

		this.nit = nit;
		this.namecompany = namecompany;
		this.typecompany = typecompany;
		this.invoicereference = invoicereference;
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

	@Override
	public String toString() {
		return "Pay [id=" + id + ", nit=" + nit + ", namecompany=" + namecompany + ", typecompany=" + typecompany
				+ ", invoicereference=" + invoicereference + "]";
	}

}
