package br.com.thiengo.pagamentosapp.domain;
/************   Roberto Eugenio ************************ */
/************   Projeto elaborado ********************** */
/************   Projeto Integrador ********************* */
/***************Dispositivos Moveis********************* */
public class Product {
    private String id;
    private String name;
    private String description;
    private int stock;
    private double price;
    private int img;

   /*construtor */
    public Product( String ident, String n, String d, int s, double p, int i ){
        id = ident;
        name = n;
        description = d;
        stock = s;
        price = p;
        img = i;
    }
    /*getters e setters */
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    /* mensagem para o prestador */
    public String getStockString() {
        return "Divido em  "+String.valueOf(stock)+" vezes.";
    }

    public double getPrice() {
        return price;
    }

    public String getPriceString() {
        return "R$ "+String.valueOf(price).replace('.', ',');
    }

    public int getImg() {
        return img;
    }
}
