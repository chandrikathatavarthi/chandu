package com.test.TestProject.beans;

import java.util.ArrayList;

public class ProductService {
	ArrayList < Product > products = new ArrayList < Product > ();
	 ArrayList < Object > facets = new ArrayList < Object > ();
	 private String categoryTitle;
	 private float childCategoriesCount;
	 SeoInformation SeoInformationObject;
	 private float results;
	 private float pagesAvailable;
	 ArrayList < Object > crumbs = new ArrayList < Object > ();
	 private String dynamicBannerId;
	 private String seoBannerId;
	 private String redirectUrl;
	 ArrayList < Object > staticLinks = new ArrayList < Object > ();
	 private String selectedDept;
	 private String multiCatSelected;
	 private String endecaCanonical;


	 // Getter Methods 
	 

	 public String getCategoryTitle() {
	  return categoryTitle;
	 }

	 public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public float getChildCategoriesCount() {
	  return childCategoriesCount;
	 }

	 public SeoInformation getSeoInformation() {
	  return SeoInformationObject;
	 }

	 public float getResults() {
	  return results;
	 }

	 public float getPagesAvailable() {
	  return pagesAvailable;
	 }

	 public String getDynamicBannerId() {
	  return dynamicBannerId;
	 }

	 public String getSeoBannerId() {
	  return seoBannerId;
	 }

	 public String getRedirectUrl() {
	  return redirectUrl;
	 }

	 public String getSelectedDept() {
	  return selectedDept;
	 }

	 public String getMultiCatSelected() {
	  return multiCatSelected;
	 }

	 public String getEndecaCanonical() {
	  return endecaCanonical;
	 }

	 // Setter Methods 

	 public void setCategoryTitle(String categoryTitle) {
	  this.categoryTitle = categoryTitle;
	 }

	 public void setChildCategoriesCount(float childCategoriesCount) {
	  this.childCategoriesCount = childCategoriesCount;
	 }

	 public void setSeoInformation(SeoInformation seoInformationObject) {
	  this.SeoInformationObject = seoInformationObject;
	 }

	 public void setResults(float results) {
	  this.results = results;
	 }

	 public void setPagesAvailable(float pagesAvailable) {
	  this.pagesAvailable = pagesAvailable;
	 }

	 public void setDynamicBannerId(String dynamicBannerId) {
	  this.dynamicBannerId = dynamicBannerId;
	 }

	 public void setSeoBannerId(String seoBannerId) {
	  this.seoBannerId = seoBannerId;
	 }

	 public void setRedirectUrl(String redirectUrl) {
	  this.redirectUrl = redirectUrl;
	 }

	 public void setSelectedDept(String selectedDept) {
	  this.selectedDept = selectedDept;
	 }

	 public void setMultiCatSelected(String multiCatSelected) {
	  this.multiCatSelected = multiCatSelected;
	 }

	 public void setEndecaCanonical(String endecaCanonical) {
	  this.endecaCanonical = endecaCanonical;
	 }
	}
	 class SeoInformation {
	 private String title;
	 private String description;


	 // Getter Methods 

	 public String getTitle() {
	  return title;
	 }

	 public String getDescription() {
	  return description;
	 }

	 // Setter Methods 

	 public void setTitle(String title) {
	  this.title = title;
	 }

	 public void setDescription(String description) {
	  this.description = description;
	 }
	}