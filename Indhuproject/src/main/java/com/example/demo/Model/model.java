package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Grocerylist")
public class model {
 
		@Id
		private int sno;
		private String itemname;
		private String category;
		private int quantity;
		private float price;
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		
		public String getItemname() {
			return itemname;
		}
		public void setItemname(String itemname) {
			this.itemname = itemname;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		public model(int sno, String itemname, String category, int quantity, float price) {
			super();
			this.sno = sno;
			this.itemname = itemname;
			this.category = category;
			this.quantity = quantity;
			this.price = price;
		}
		public model() {
			
		}
		public String toString() {
			return "SerialNo="+sno+"ItemName="+itemname+"Category="+category+"Quantity="+quantity+"Price="+price;
		}	
}
