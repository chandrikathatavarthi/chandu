package com.test.TestProject.beans;

import java.util.ArrayList;

public class ProductService {
	ArrayList < Object > products = new ArrayList < Object > ();
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

	@Override
	public String toString() {
		return "ProductService [products=" + products + ", facets=" + facets
				+ ", categoryTitle=" + categoryTitle
				+ ", childCategoriesCount=" + childCategoriesCount
				+ ", SeoInformationObject=" + SeoInformationObject
				+ ", results=" + results + ", pagesAvailable=" + pagesAvailable
				+ ", crumbs=" + crumbs + ", dynamicBannerId=" + dynamicBannerId
				+ ", seoBannerId=" + seoBannerId + ", redirectUrl="
				+ redirectUrl + ", staticLinks=" + staticLinks
				+ ", selectedDept=" + selectedDept + ", multiCatSelected="
				+ multiCatSelected + ", endecaCanonical=" + endecaCanonical
				+ "]";
	}
	 
	 
}
