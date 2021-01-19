/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class Sale {
 int Bill_No;
 String Sale_Date;
 int Item_ID;
 float Item_Sale_Price;
 int Item_Sale_Qty,Employee_ID;

    public Sale(int Bill_No, String Sale_Date, int Item_ID, float Item_Sale_Price, int Item_Sale_Qty, int Employee_ID) {
        this.Bill_No = Bill_No;
        this.Sale_Date = Sale_Date;
        this.Item_ID = Item_ID;
        this.Item_Sale_Price = Item_Sale_Price;
        this.Item_Sale_Qty = Item_Sale_Qty;
        this.Employee_ID = Employee_ID;
    }

    public void setBill_No(int Bill_No) {
        this.Bill_No = Bill_No;
    }

    public void setSale_Date(String Sale_Date) {
        this.Sale_Date = Sale_Date;
    }

    public void setItem_ID(int Item_ID) {
        this.Item_ID = Item_ID;
    }

    public void setItem_Sale_Price(float Item_Sale_Price) {
        this.Item_Sale_Price = Item_Sale_Price;
    }

    public void setItem_Sale_Qty(int Item_Sale_Qty) {
        this.Item_Sale_Qty = Item_Sale_Qty;
    }

    public void setEmployee_ID(int Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public int getBill_No() {
        return Bill_No;
    }

    public String getSale_Date() {
        return Sale_Date;
    }

    public int getItem_ID() {
        return Item_ID;
    }

    public float getItem_Sale_Price() {
        return Item_Sale_Price;
    }

    public int getItem_Sale_Qty() {
        return Item_Sale_Qty;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }
 
 
         
}
