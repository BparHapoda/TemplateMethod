package org.example;

public class Main {
    public static void main(String[] args) {
        WebSite abcNews = new WebSite.NewsSite("READ ABC NEWS ","Thanks for reading THE ABC NEWS");
        WebSite zaycevNet = new WebSite.MusicSite("MUSIC FOR EVERYBODY","Thanks for listening our Music");
        abcNews.print();
        System.out.println("=========================") ;
        zaycevNet.print();
    }
}