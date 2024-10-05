package com.collegePredictor.java;

public class ConditionalStats {
    public static void main(String[] args) {
        // discounts on a product based on membership type
        /*Employee membership:
        Diamond 20%, Gold 15%, Silver 10%,  others 0% */
        int productPrice;
        productPrice = 4500;
        int discount;
        int discountPercentage;
        char membership;
        membership = 'O';
        if (membership == 'D') {
            discountPercentage = 20;
        } else if (membership == 'G') {
            discountPercentage = 15;
        } else if (membership == 'S') {
            discountPercentage = 10;
        } else discountPercentage = 0;
        discount = productPrice * discountPercentage/100;
        System.out.println("Discount " + discount);
    }
}
