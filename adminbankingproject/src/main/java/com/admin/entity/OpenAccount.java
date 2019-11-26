package com.admin.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name= "OpenAccounts")
public class OpenAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "ac_sequence")
	@SequenceGenerator(name="ac_sequence" , sequenceName= "acno_seq",allocationSize =1)
	
	private long accNo;
	private String title;
	private String fName;
	private String mName;
	private String lName;
	private String faName;
	private long phno;
	private String email;
	private long aadharNo;
	
	private String dob;
	private String resaddrline1;
	private String resaddrline2;
	private String reslandmark;
	private String rescity;
	private String resstate;
	private long respincode;
	
	private String addrline1;
	private String addrline2;
	private String landmark;
	private String city;
	private String state;
	private long pincode;
	
	private String occtype;
	private String sourceofincome;
	private String gaincome;
	
	
	
	public OpenAccount() {
		
	}



	public long getAccNo() {
		return accNo;
	}



	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getmName() {
		return mName;
	}



	public void setmName(String mName) {
		this.mName = mName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getFaName() {
		return faName;
	}



	public void setFaName(String faName) {
		this.faName = faName;
	}



	public long getPhno() {
		return phno;
	}



	public void setPhno(long phno) {
		this.phno = phno;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getAadharNo() {
		return aadharNo;
	}



	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getResaddrline1() {
		return resaddrline1;
	}



	public void setResaddrline1(String resaddrline1) {
		this.resaddrline1 = resaddrline1;
	}



	public String getResaddrline2() {
		return resaddrline2;
	}



	public void setResaddrline2(String resaddrline2) {
		this.resaddrline2 = resaddrline2;
	}



	public String getReslandmark() {
		return reslandmark;
	}



	public void setReslandmark(String reslandmark) {
		this.reslandmark = reslandmark;
	}



	public String getRescity() {
		return rescity;
	}



	public void setRescity(String rescity) {
		this.rescity = rescity;
	}



	public String getResstate() {
		return resstate;
	}



	public void setResstate(String resstate) {
		this.resstate = resstate;
	}



	public long getRespincode() {
		return respincode;
	}



	public void setRespincode(long respincode) {
		this.respincode = respincode;
	}



	public String getAddrline1() {
		return addrline1;
	}



	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}



	public String getAddrline2() {
		return addrline2;
	}



	public void setAddrline2(String addrline2) {
		this.addrline2 = addrline2;
	}



	public String getLandmark() {
		return landmark;
	}



	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public long getPincode() {
		return pincode;
	}



	public void setPincode(long pincode) {
		this.pincode = pincode;
	}



	public String getOcctype() {
		return occtype;
	}



	public void setOcctype(String occtype) {
		this.occtype = occtype;
	}



	public String getSourceofincome() {
		return sourceofincome;
	}



	public void setSourceofincome(String sourceofincome) {
		this.sourceofincome = sourceofincome;
	}



	public String getGaincome() {
		return gaincome;
	}



	public void setGaincome(String gaincome) {
		this.gaincome = gaincome;
	}



	@Override
	public String toString() {
		return "OpenAccount [accNo=" + accNo + ", title=" + title + ", fName=" + fName + ", mName=" + mName + ", lName="
				+ lName + ", faName=" + faName + ", phno=" + phno + ", email=" + email + ", aadharNo=" + aadharNo
				+ ", dob=" + dob + ", resaddrline1=" + resaddrline1 + ", resaddrline2=" + resaddrline2
				+ ", reslandmark=" + reslandmark + ", rescity=" + rescity + ", resstate=" + resstate + ", respincode="
				+ respincode + ", addrline1=" + addrline1 + ", addrline2=" + addrline2 + ", landmark=" + landmark
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", occtype=" + occtype
				+ ", sourceofincome=" + sourceofincome + ", gaincome=" + gaincome + "]";
	}
	
	
	
}