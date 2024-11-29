package com.study.practice.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CheckoutSystem {
    private static final int APPLE_PRICE = 60;   // price in pence
    private static final int ORANGE_PRICE = 25;  // price in pence

    private Map<String, Integer> basket;

    public CheckoutSystem() {
        basket = new HashMap<>();
    }

    // Add an item to the basket
    public void addItem(String item) {
        basket.put(item, basket.getOrDefault(item, 0) + 1);
    }

    // Calculate total with promotions applied
    public int calculateTotal() {
        int total = 0;
        List<Integer> itemPrices = new ArrayList<>();

        // Add items to list with prices
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            int itemPrice = getItemPrice(item);

            if (quantity > 0) {
                List<Integer> promoAppliedPrices = applyPromotions(itemPrice, quantity, "BOGOF");
                itemPrices.addAll(promoAppliedPrices);
            }
        }

        // Sort prices so the cheapest items are given free first
        Collections.sort(itemPrices);

        // Sum up the prices
        for (int price : itemPrices) {
            total += price;
        }

        return total;
    }

    // Apply promotion rules to items
    private List<Integer> applyPromotions(int price, int quantity, String promoType) {
        List<Integer> prices = new ArrayList<>();

        switch (promoType) {
            case "BOGOF":
                for (int i = 0; i < quantity; i++) {
                    if (i % 2 == 0) { // Pay for every second item
                        prices.add(price);
                    }
                }
                break;

            case "3FOR2":
                for (int i = 0; i < quantity; i++) {
                    if ((i + 1) % 3 != 0) { // Pay for two items out of every three
                        prices.add(price);
                    }
                }
                break;

            default:
                for (int i = 0; i < quantity; i++) {
                    prices.add(price); // No promo, pay full price
                }
        }
        return prices;
    }

    // Get item price based on item name
    private int getItemPrice(String item) {
        switch (item.toLowerCase()) {
            case "apple":
                return APPLE_PRICE;
            case "orange":
                return ORANGE_PRICE;
            default:
                throw new IllegalArgumentException("Unknown item: " + item);
        }
    }

    public static void main(String[] args) {
        CheckoutSystem checkout = new CheckoutSystem();

        // Adding items to basket
        checkout.addItem("apple");
        checkout.addItem("apple");
        checkout.addItem("apple");
        checkout.addItem("orange");
        checkout.addItem("orange");
        checkout.addItem("orange");

        // Calculate total with promotions
        int total = checkout.calculateTotal();
        System.out.println("Total: " + total + " pence"); // Expected output in pence
    }
}
