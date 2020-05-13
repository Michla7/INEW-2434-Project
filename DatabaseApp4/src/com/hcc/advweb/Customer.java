package com.hcc.advweb;


	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;

	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="CUSTOMER")
	public class Customer  implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name="id")
		private int id;
		@Column(name="firstName")
		private String firstName;
		@Column(name="lastName")
		private String lastName;
		
		@Column(name="address")
		private String address;
		@Column(name="bookName")
		private String bookName;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		

		public Customer() {
			// TODO Auto-generated constructor stub
		}
		
		public Customer(int id, String fname, String lname) {
			setId(id);
			setFirstName(fname);
			setLastName(lname);		
		}




		public String getFirstName() {
			return firstName;
		} 
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}



		public String getBookName() {
			return bookName;
		} 
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}



		@Override
		public String toString() {
			return "Customer [id=" + id + ", fname=" + firstName + ", lname=" + lastName + ",  bookName="
					+ bookName + ", address=" + address ;
		}
		
		

	}
