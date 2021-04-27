package com.hendev;

public class Product {

   //Constructor
   public Product(){
      System.out.println("Constructor calıstı.");
   }

   //Attributes
   private int id;
   private String name;
   private String description;
   private double price;
   private int stock;
   private String color;
   private String code;

   //Getter & Setters
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getStock() {
      return stock;
   }

   public void setStock(int stock) {
      this.stock = stock;
   }

   public String getCode() {
      return this.name.substring(0,1) + this.id;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
}
