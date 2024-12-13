package com.study.practice.snippets;

public class Generic<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Generic<String> stringBox = new Generic<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println(stringBox.getContent()); // Output: Hello, Generics!

        Generic<Integer> intBox = new Generic<>();
        intBox.setContent(123);
        System.out.println(intBox.getContent()); // Output: 123
    }
}
