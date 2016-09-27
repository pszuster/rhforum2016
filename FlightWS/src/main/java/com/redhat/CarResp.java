package com.redhat;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CarResp implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String carResCode;
   private java.lang.Double carPrice;
   private java.lang.String carResStatus;

   private Integer carDisc;

   private java.lang.String carRentalCo;

   private java.lang.String carType;

   private java.lang.String carCity;
   private java.lang.String carStartDate;
   private java.lang.Integer carDays;


   public CarResp()
   {
   }

   public java.lang.String getCarResCode()
   {
      return this.carResCode;
   }

   public void setCarResCode(java.lang.String carResCode)
   {
      this.carResCode = carResCode;
   }

   public java.lang.Double getCarPrice()
   {
      return this.carPrice;
   }

   public void setCarPrice(java.lang.Double carPrice)
   {
      this.carPrice = carPrice;
   }

   public java.lang.String getCarResStatus()
   {
      return this.carResStatus;
   }

   public void setCarResStatus(java.lang.String carResStatus)
   {
      this.carResStatus = carResStatus;
   }

   public java.lang.String getCarRentalCo()
   {
      return this.carRentalCo;
   }

   public void setCarRentalCo(java.lang.String carRentalCo)
   {
      this.carRentalCo = carRentalCo;
   }

   public java.lang.String getCarType()
   {
      return this.carType;
   }

   public void setCarType(java.lang.String carType)
   {
      this.carType = carType;
   }

   public java.lang.String getCarCity()
   {
      return this.carCity;
   }

   public void setCarCity(java.lang.String carCity)
   {
      this.carCity = carCity;
   }

   public void addDisc(java.lang.Integer amount)
   {
      this.carDisc = this.carDisc + amount;
   }

   public java.lang.Integer getCarDisc()
   {
      return this.carDisc;
   }

   public void setCarDisc(java.lang.Integer carDisc)
   {
      this.carDisc = carDisc;
   }

   public CarResp(java.lang.String carResCode, java.lang.Double carPrice,
         java.lang.String carResStatus, java.lang.Integer carDisc,
         java.lang.String carRentalCo, java.lang.String carType,
         java.lang.String carCity)
   {
      this.carResCode = carResCode;
      this.carPrice = carPrice;
      this.carResStatus = carResStatus;
      this.carDisc = carDisc;
      this.carRentalCo = carRentalCo;
      this.carType = carType;
      this.carCity = carCity;
   }

public java.lang.String getCarStartDate() {
	return carStartDate;
}

public void setCarStartDate(java.lang.String carStartDate) {
	this.carStartDate = carStartDate;
}

public java.lang.Integer getCarDays() {
	return carDays;
}

public void setCarDays(java.lang.Integer carDays) {
	this.carDays = carDays;
}

}