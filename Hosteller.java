package com.tnsifDAY4;

class Hosteller extends Student {
    private int roomNumber;
    private char blockName;
    private String roomType;
    
    

    // Parameterized constructor
    public Hosteller(int studentId, String studentName, String department, String gender,
                     String category, double collegeFee, int roomNumber, char blockName,
                     String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }

    // Getters and setters for Hosteller-specific attributes
    public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
	@Override
	public double calculateTotalFee() {
	    double fee = super.getCollegeFee();
	    double hostelFee;
	    
	    // Define hostel fees based on block name
	    if (blockName == 'A') {
	        hostelFee = 60000.0;
	    } else if (blockName == 'B') {
	        hostelFee = 50000.0;
	    } else {
	        hostelFee = 40000.0;
	    }

	    // Add AC room fee if applicable
	    if (roomType.equals("AC")) {
	        return fee + hostelFee + 8000.0;
	    } else {
	        return fee + hostelFee + 5000.0;
	    }
	}

	@Override
	public String toString() {
	    return "Hosteller [Total Fee=" + calculateTotalFee() + "]";
	}


}
