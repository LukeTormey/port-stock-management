package model;

public class Boat {
		
	// Required parameters
    private String boatName;
    private String inboundAddress;
    private String outboundAddress;
    // Optional parameters
    private String stockName;
    private int stockCount;
    private String timeReceived;
    private String timeSent;
    private double stockHeight;
    private double stockWeight;
    
    public Boat(Builder builder) {
        this.boatName = builder.boatName;
        this.inboundAddress = builder.inboundAddress;
        this.outboundAddress = builder.outboundAddress;
        this.stockName = builder.stockName;
        this.stockCount = builder.stockCount;
        this.timeReceived = builder.timeReceived;
        this.timeSent = builder.timeSent;
        this.stockHeight = builder.stockHeight;
        this.stockWeight = builder.stockWeight;
    }
    
    public void display(){
        System.out.println("\nBoat name: " + boatName + "\n" + "Inbound Address: " + inboundAddress + "\n" + "Outbound Address: " + outboundAddress + "\n" + "Type of Stock: " + stockName + "\n" + "Quantity of Stock: " +
        		stockCount + "\n" + "Time Received: " + timeReceived + "\n" + "Time Sent: " + timeSent + "\n" + "Stock Height: " + stockHeight + "m\n" + "Stock Weight: " + stockWeight + "kg");
    }
    public String toString(){
        return "\nBoat name: " + boatName + "\n" + "Inbound Address: " + inboundAddress + "\n" + "Outbound Address: " + outboundAddress + "\n" + "Type of Stock: " + stockName + "\n" + "Quantity of Stock: " +
        		stockCount + "\n" + "Time Received: " + timeReceived + "\n" + "Time Sent: " + timeSent + "\n" + "Stock Height: " + stockHeight + "m\n" + "Stock Weight: " + stockWeight + "kg";
    }
    public String getBoatName() {
    	return boatName;
    }
    public String getInboundAddress() {
    	return boatName;
    }
    public String getOutboundAddress() {
    	return boatName;
    }
    public String getStockName() {
    	return stockName;
    }
    public Integer getStockCount() {
    	return stockCount;
    }
    public String getTimeReceived() {
    	return timeReceived;
    }
    public String getTimeSent() {
    	return timeSent;
    }
    public Integer getStockHeight() {
    	return (int) stockHeight;
    }
    public Integer getStockWeight() {
    	return (int) stockWeight;
    }
    
    public static class Builder {
        private String boatName;
        private String inboundAddress;
        private String outboundAddress;
        private String stockName;
        private int stockCount;
        private String timeReceived;
        private String timeSent;
        private double stockHeight;
        private double stockWeight;
        public Builder(String boatName, String inboundAddress, String outboundAddress){
            this.boatName = boatName;
            this.inboundAddress = inboundAddress;
            this.outboundAddress = outboundAddress;
        }
        public Builder setBoatName(String boatName) {
            this.boatName = boatName;
            return this;
        }
        public Builder setInboundAddress(String inboundAddress) {
            this.inboundAddress = inboundAddress;
            return this;
        }
        public Builder setOutboundAddress(String outboundAddress) {
            this.outboundAddress = outboundAddress;
            return this;
        }
        public Builder setStockName(String stockName) {
            this.stockName = stockName;
            return this;
        }
        public Builder setStockCount(int stockCount) {
            this.stockCount = stockCount;
            return this;
        }
        public Builder setTimeReceived(String timeReceived) {
            this.timeReceived = timeReceived;
            return this;
        }
        public Builder setTimeSent(String timeSent) {
            this.timeSent = timeSent;
            return this;
        }
        public Builder setStockHeight(double stockHeight) {
            this.stockHeight = stockHeight;
            return this;
        }
        public Builder setStockWeight(double stockWeight) {
            this.stockWeight = stockWeight;
            return this;
        }
        public Boat build() {
            return new Boat(this);
        }
    }
}
