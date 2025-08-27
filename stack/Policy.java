package com.policymanagement;

class Policy {
	private int id;
	private String type;
	private double premium;
	private String expiry;

	public Policy(int id, String type, double premium, String expiry) {
		this.id = id;
		this.type = type;
		this.premium = premium;
		this.expiry = expiry;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getPremium() {
		return premium;
	}

	public String getExpiry() {
		return expiry;
	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", type=" + type + ", premium=" + premium + ", expiry=" + expiry + "]";
	}

}
