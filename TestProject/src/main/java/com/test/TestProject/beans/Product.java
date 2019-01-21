package com.test.TestProject.beans;

import java.util.ArrayList;

public class Product {
		 private String productId;
		 private String type;
		 private String title;
		 private String code;
		 private float averageRating;
		 private float reviews;
		 Price PriceObject;
		 private String image;
		 ArrayList < Object > additionalServices = new ArrayList < Object > ();
		 private String displaySpecialOffer;
		 PromoMessages PromoMessagesObject;
		 private String nonPromoMessage;
		 private String defaultSkuId;
		 ArrayList < ColorSwatches > colorSwatches = new ArrayList < ColorSwatches > ();
		 private float colorSwatchSelected;
		 private String colorWheelMessage;
		 private boolean outOfStock;
		 private boolean emailMeWhenAvailable;
		 private String availabilityMessage;
		 private boolean compare;
		 private String fabric;
		 private boolean swatchAvailable;
		 private boolean categoryQuickViewEnabled;
		 private String swatchCategoryType;
		 private String brand;
		 private float ageRestriction;
		 private boolean isInStoreOnly;
		 private boolean isMadeToMeasure;
		 private boolean isBundle;
		 private boolean isProductSet;
		 ArrayList < Object > promotionalFeatures = new ArrayList < Object > ();
		 ArrayList < Object > features = new ArrayList < Object > ();
		 DynamicAttributes DynamicAttributesObject;
		 private String directorate;
		 private float releaseDateTimestamp;


		 // Getter Methods 

		 public String getProductId() {
		  return productId;
		 }

		 public String getType() {
		  return type;
		 }

		 public String getTitle() {
		  return title;
		 }

		 public String getCode() {
		  return code;
		 }

		 public float getAverageRating() {
		  return averageRating;
		 }

		 public float getReviews() {
		  return reviews;
		 }

		 public Price getPrice() {
		  return PriceObject;
		 }

		 public String getImage() {
		  return image;
		 }

		 public String getDisplaySpecialOffer() {
		  return displaySpecialOffer;
		 }

		 public PromoMessages getPromoMessages() {
		  return PromoMessagesObject;
		 }

		 public String getNonPromoMessage() {
		  return nonPromoMessage;
		 }

		 public String getDefaultSkuId() {
		  return defaultSkuId;
		 }

		 public float getColorSwatchSelected() {
		  return colorSwatchSelected;
		 }

		 public String getColorWheelMessage() {
		  return colorWheelMessage;
		 }

		 public boolean getOutOfStock() {
		  return outOfStock;
		 }

		 public boolean getEmailMeWhenAvailable() {
		  return emailMeWhenAvailable;
		 }

		 public String getAvailabilityMessage() {
		  return availabilityMessage;
		 }

		 public boolean getCompare() {
		  return compare;
		 }

		 public String getFabric() {
		  return fabric;
		 }

		 public boolean getSwatchAvailable() {
		  return swatchAvailable;
		 }

		 public boolean getCategoryQuickViewEnabled() {
		  return categoryQuickViewEnabled;
		 }

		 public String getSwatchCategoryType() {
		  return swatchCategoryType;
		 }

		 public String getBrand() {
		  return brand;
		 }

		 public float getAgeRestriction() {
		  return ageRestriction;
		 }

		 public boolean getIsInStoreOnly() {
		  return isInStoreOnly;
		 }

		 public boolean getIsMadeToMeasure() {
		  return isMadeToMeasure;
		 }

		 public boolean getIsBundle() {
		  return isBundle;
		 }

		 public boolean getIsProductSet() {
		  return isProductSet;
		 }

		 public DynamicAttributes getDynamicAttributes() {
		  return DynamicAttributesObject;
		 }

		 public String getDirectorate() {
		  return directorate;
		 }

		 public float getReleaseDateTimestamp() {
		  return releaseDateTimestamp;
		 }

		 // Setter Methods 

		 public void setProductId(String productId) {
		  this.productId = productId;
		 }

		 public void setType(String type) {
		  this.type = type;
		 }

		 public void setTitle(String title) {
		  this.title = title;
		 }

		 public void setCode(String code) {
		  this.code = code;
		 }

		 public void setAverageRating(float averageRating) {
		  this.averageRating = averageRating;
		 }

		 public void setReviews(float reviews) {
		  this.reviews = reviews;
		 }

		 public void setPrice(Price priceObject) {
		  this.PriceObject = priceObject;
		 }

		 public void setImage(String image) {
		  this.image = image;
		 }

		 public void setDisplaySpecialOffer(String displaySpecialOffer) {
		  this.displaySpecialOffer = displaySpecialOffer;
		 }

		 public void setPromoMessages(PromoMessages promoMessagesObject) {
		  this.PromoMessagesObject = promoMessagesObject;
		 }

		 public void setNonPromoMessage(String nonPromoMessage) {
		  this.nonPromoMessage = nonPromoMessage;
		 }

		 public void setDefaultSkuId(String defaultSkuId) {
		  this.defaultSkuId = defaultSkuId;
		 }

		 public void setColorSwatchSelected(float colorSwatchSelected) {
		  this.colorSwatchSelected = colorSwatchSelected;
		 }

		 public void setColorWheelMessage(String colorWheelMessage) {
		  this.colorWheelMessage = colorWheelMessage;
		 }

		 public void setOutOfStock(boolean outOfStock) {
		  this.outOfStock = outOfStock;
		 }

		 public void setEmailMeWhenAvailable(boolean emailMeWhenAvailable) {
		  this.emailMeWhenAvailable = emailMeWhenAvailable;
		 }

		 public void setAvailabilityMessage(String availabilityMessage) {
		  this.availabilityMessage = availabilityMessage;
		 }

		 public void setCompare(boolean compare) {
		  this.compare = compare;
		 }

		 public void setFabric(String fabric) {
		  this.fabric = fabric;
		 }

		 public void setSwatchAvailable(boolean swatchAvailable) {
		  this.swatchAvailable = swatchAvailable;
		 }

		 public void setCategoryQuickViewEnabled(boolean categoryQuickViewEnabled) {
		  this.categoryQuickViewEnabled = categoryQuickViewEnabled;
		 }

		 public void setSwatchCategoryType(String swatchCategoryType) {
		  this.swatchCategoryType = swatchCategoryType;
		 }

		 public void setBrand(String brand) {
		  this.brand = brand;
		 }

		 public void setAgeRestriction(float ageRestriction) {
		  this.ageRestriction = ageRestriction;
		 }

		 public void setIsInStoreOnly(boolean isInStoreOnly) {
		  this.isInStoreOnly = isInStoreOnly;
		 }

		 public void setIsMadeToMeasure(boolean isMadeToMeasure) {
		  this.isMadeToMeasure = isMadeToMeasure;
		 }

		 public void setIsBundle(boolean isBundle) {
		  this.isBundle = isBundle;
		 }

		 public void setIsProductSet(boolean isProductSet) {
		  this.isProductSet = isProductSet;
		 }

		 public void setDynamicAttributes(DynamicAttributes dynamicAttributesObject) {
		  this.DynamicAttributesObject = dynamicAttributesObject;
		 }

		 public void setDirectorate(String directorate) {
		  this.directorate = directorate;
		 }

		 public void setReleaseDateTimestamp(float releaseDateTimestamp) {
		  this.releaseDateTimestamp = releaseDateTimestamp;
		 }
		}
		 class DynamicAttributes {
		 private String newinproducttype;
		 private String washinginstructions;
		 private String dressbyoccasion;
		 private String dressshape;
		 private String typeofpattern;


		 // Getter Methods 

		 public String getNewinproducttype() {
		  return newinproducttype;
		 }

		 public String getWashinginstructions() {
		  return washinginstructions;
		 }

		 public String getDressbyoccasion() {
		  return dressbyoccasion;
		 }

		 public String getDressshape() {
		  return dressshape;
		 }

		 public String getTypeofpattern() {
		  return typeofpattern;
		 }

		 // Setter Methods 

		 public void setNewinproducttype(String newinproducttype) {
		  this.newinproducttype = newinproducttype;
		 }

		 public void setWashinginstructions(String washinginstructions) {
		  this.washinginstructions = washinginstructions;
		 }

		 public void setDressbyoccasion(String dressbyoccasion) {
		  this.dressbyoccasion = dressbyoccasion;
		 }

		 public void setDressshape(String dressshape) {
		  this.dressshape = dressshape;
		 }

		 public void setTypeofpattern(String typeofpattern) {
		  this.typeofpattern = typeofpattern;
		 }
		}
		 class PromoMessages {
		 private String priceMatched;
		 private String offer;
		 private String customPromotionalMessage;
		 private String bundleHeadline;
		 CustomSpecialOffer CustomSpecialOfferObject;


		 // Getter Methods 

		 public String getPriceMatched() {
		  return priceMatched;
		 }

		 public String getOffer() {
		  return offer;
		 }

		 public String getCustomPromotionalMessage() {
		  return customPromotionalMessage;
		 }

		 public String getBundleHeadline() {
		  return bundleHeadline;
		 }

		 public CustomSpecialOffer getCustomSpecialOffer() {
		  return CustomSpecialOfferObject;
		 }

		 // Setter Methods 

		 public void setPriceMatched(String priceMatched) {
		  this.priceMatched = priceMatched;
		 }

		 public void setOffer(String offer) {
		  this.offer = offer;
		 }

		 public void setCustomPromotionalMessage(String customPromotionalMessage) {
		  this.customPromotionalMessage = customPromotionalMessage;
		 }

		 public void setBundleHeadline(String bundleHeadline) {
		  this.bundleHeadline = bundleHeadline;
		 }

		 public void setCustomSpecialOffer(CustomSpecialOffer customSpecialOfferObject) {
		  this.CustomSpecialOfferObject = customSpecialOfferObject;
		 }
		}
		 class CustomSpecialOffer {


		 // Getter Methods 



		 // Setter Methods 


		}
		 class Price {
		 private String was;
		 private String then1;
		 private String then2;
		 private String now;
		 private String uom;
		 private String currency;


		 // Getter Methods 

		 public String getWas() {
		  return was;
		 }

		 public String getThen1() {
		  return then1;
		 }

		 public String getThen2() {
		  return then2;
		 }

		 public String getNow() {
		  return now;
		 }

		 public String getUom() {
		  return uom;
		 }

		 public String getCurrency() {
		  return currency;
		 }

		 // Setter Methods 

		 public void setWas(String was) {
		  this.was = was;
		 }

		 public void setThen1(String then1) {
		  this.then1 = then1;
		 }

		 public void setThen2(String then2) {
		  this.then2 = then2;
		 }

		 public void setNow(String now) {
		  this.now = now;
		 }

		 public void setUom(String uom) {
		  this.uom = uom;
		 }

		 public void setCurrency(String currency) {
		  this.currency = currency;
		 }
		}

