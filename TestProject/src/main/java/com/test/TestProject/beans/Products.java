package com.test.TestProject.beans;

import java.util.Arrays;

public class Products {

	
	 private String productId;
	 private String title;
	 private ColorSwatches[] colorSwatches;
	 private String nowPrice;
	 private String priceLabel;
	 
	 
	public Products(String productId, String title) {
		super();
		this.productId = productId;
		this.title = title;
	}

	public Products(String productId, String title,
			ColorSwatches[] colorSwatches, String nowPrice, String priceLabel) {
		super();
		this.productId = productId;
		this.title = title;
		this.colorSwatches = colorSwatches;
		this.nowPrice = nowPrice;
		this.priceLabel = priceLabel;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ColorSwatches[] getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(ColorSwatches[] colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	public String getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getPriceLabel() {
		return priceLabel;
	}
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}
	@Override
	public String toString() {
		return "ProductResponse [productId=" + productId + ", title=" + title
				+ ", colorSwatches=" + Arrays.toString(colorSwatches)
				+ ", nowPrice=" + nowPrice + ", priceLabel=" + priceLabel + "]";
	}

}
