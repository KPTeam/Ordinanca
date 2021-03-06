/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "Kontrolla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kontrolla.findAll", query = "SELECT k FROM Kontrolla k"),
    @NamedQuery(name = "Kontrolla.findByKontrollaid", query = "SELECT k FROM Kontrolla k WHERE k.kontrollaid = :kontrollaid"),
    @NamedQuery(name = "Kontrolla.findByDatakontrolles", query = "SELECT k FROM Kontrolla k WHERE k.datakontrolles = :datakontrolles"),
    @NamedQuery(name = "Kontrolla.findByOrakontrolles", query = "SELECT k FROM Kontrolla k WHERE k.orakontrolles = :orakontrolles"),
    @NamedQuery(name = "Kontrolla.findByLlojikontrolles", query = "SELECT k FROM Kontrolla k WHERE k.llojikontrolles = :llojikontrolles")})
public class Kontrolla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "Kontrolla_id")
    private Integer kontrollaid;
    @Basic(optional = false)
    @Column(name = "Data_kontrolles")
    @Temporal(TemporalType.DATE)
    private Date datakontrolles;
    @Basic(optional = false)
    @Column(name = "Ora_kontrolles")
    private String orakontrolles;
    @Basic(optional = false)
    @Column(name = "Lloji_kontrolles")
    private String llojikontrolles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kontrollaid")
    private Collection<Dhembi> dhembiCollection;
    @JoinColumn(name = "Pacienti_id", referencedColumnName = "Nr_personal")
    @ManyToOne(optional = false)
    private Pacienti pacientiid;
    @JoinColumn(name = "Punetori_id", referencedColumnName = "Nr_personal")
    @ManyToOne(optional = false)
    private Punetori punetoriid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kontrollaID")
    private Collection<Tretmani> tretmaniCollection;

    public Kontrolla() {
    }

    public Kontrolla(Integer kontrollaid) {
        this.kontrollaid = kontrollaid;
    }

    public Kontrolla(Integer kontrollaid, Date datakontrolles, String orakontrolles, String llojikontrolles) {
        this.kontrollaid = kontrollaid;
        this.datakontrolles = datakontrolles;
        this.orakontrolles = orakontrolles;
        this.llojikontrolles = llojikontrolles;
    }

    public Integer getKontrollaid() {
        return kontrollaid;
    }

    public void setKontrollaid(Integer kontrollaid) {
        this.kontrollaid = kontrollaid;
    }

    public Date getDatakontrolles() {
        return datakontrolles;
    }

    public void setDatakontrolles(Date datakontrolles) {
        this.datakontrolles = datakontrolles;
    }

    public String getOrakontrolles() {
        return orakontrolles;
    }

    public void setOrakontrolles(String orakontrolles) {
        this.orakontrolles = orakontrolles;
    }

    public String getLlojikontrolles() {
        return llojikontrolles;
    }

    public void setLlojikontrolles(String llojikontrolles) {
        this.llojikontrolles = llojikontrolles;
    }

    @XmlTransient
    public Collection<Dhembi> getDhembiCollection() {
        return dhembiCollection;
    }

    public void setDhembiCollection(Collection<Dhembi> dhembiCollection) {
        this.dhembiCollection = dhembiCollection;
    }

    public Pacienti getPacientiid() {
        return pacientiid;
    }

    public void setPacientiid(Pacienti pacientiid) {
        this.pacientiid = pacientiid;
    }

    public Punetori getPunetoriid() {
        return punetoriid;
    }

    public void setPunetoriid(Punetori punetoriid) {
        this.punetoriid = punetoriid;
    }

    @XmlTransient
    public Collection<Tretmani> getTretmaniCollection() {
        return tretmaniCollection;
    }

    public void setTretmaniCollection(Collection<Tretmani> tretmaniCollection) {
        this.tretmaniCollection = tretmaniCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kontrollaid != null ? kontrollaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kontrolla)) {
            return false;
        }
        Kontrolla other = (Kontrolla) object;
        if ((this.kontrollaid == null && other.kontrollaid != null) || (this.kontrollaid != null && !this.kontrollaid.equals(other.kontrollaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pacientiid.getEmri() + " "+ pacientiid.getMbiemri()+ " "+getDate();
    }
    
    public String getDate() {
       String [] data = datakontrolles.toString().split(" ");
       if(data[1].equals("Jan"))
           data[1]="Janar";
       if(data[1].equals("Feb"))
           data[1]="Shkurt";
       if(data[1].equals("Mar"))
           data[1]="Mars";
       if(data[1].equals("Apr"))
           data[1]="Prill";
       if(data[1].equals("May"))
           data[1]="Maj";
       if(data[1].equals("Jun"))
           data[1]="Qershor";
       if(data[1].equals("Jul"))
           data[1]="Korrik";
       if(data[1].equals("Aug"))
           data[1]="Gusht";
       if(data[1].equals("Sep"))
           data[1]="Shtator";
       if(data[1].equals("Oct"))
           data[1]="Tetor";
       if(data[1].equals("Nov"))
           data[1]="Nentor";
       if(data[1].equals("Dec"))
           data[1]="Dhjetor";
       String date = data[2] + " "+data[1]+" "+ data[5];
         
        return date;
    }
    
}
