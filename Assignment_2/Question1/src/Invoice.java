
public class Invoice {
	private String part_number;
	private String description;
	private int qty_item;
	private double price;

		public Invoice(){
			setPartNumber(part_number);
			setDescription(description);
			setQuntity(qty_item);
			setPrice(price);
		}
		public void setPartNumber(String part_number) {
			this.part_number=part_number;
		}
		public void setQuntity(int qty_item) {
			if(qty_item>0) {
				this.qty_item=qty_item;
			}else {
				this.qty_item=0;
			}
		}
		public void setPrice(double price) {
			if(price>0) {
			this.price=price;
			}else {
				this.price=0.0;
			}
		}
		public void setDescription(String description) {
			this.description=description;
		}
		
		public int getQuntity() {
			return qty_item;
		}
		public double getPrice() {
			return price;
		}
		public String getPart() {
			return part_number;
		}
		public String getDescription() {
			return description;
		}
}