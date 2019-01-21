package com.test.TestProject.beans;

public class ColorSwatches {
	 private String color;
	 private String basicColor;
	 private String skuId;


	 // Getter Methods 

	 public ColorSwatches(String color, String basicColor, String skuId) {
		super();
		this.color = color;
		this.basicColor = basicColor;
		this.skuId = skuId;
	}

	public String getColor() {
	  return color;
	 }

	 public String getBasicColor() {
	  return basicColor;
	 }

	 public String getSkuId() {
	  return skuId;
	 }

	 // Setter Methods 

	 public void setColor(String color) {
	  this.color = color;
	 }

	 public void setBasicColor(String basicColor) {
	  this.basicColor = basicColor;
	 }

	 public void setSkuId(String skuId) {
	  this.skuId = skuId;
	 }

	@Override
	public String toString() {
		return "ColorSwatches [color=" + color + ", basicColor=" + basicColor
				+ ", skuId=" + skuId + "]";
	}
	 
	 
	}

