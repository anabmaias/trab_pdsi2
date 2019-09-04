/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

/**
 *
 * @author firmi
 */
  public class Entrega {
    
    public int id;
    public int idCliente;
    public int numeroCliente;
    public String nomeCliente;
    public String bairroCliente;
    public double latitude_cliente;
    public double longitude_cliente;
    public boolean vip;
    public int idProduto;
    public String nomeProduto;
    public int qtdProduto;
    public double precoProduto;    
    public String Brinde;

    public Entrega(int id, int idCliente, int numeroCliente, String nomeCliente, String bairroCliente, double latitude_cliente, double longitude_cliente, boolean vip, int idProduto, String nomeProduto, int qtdProduto, double precoProduto, String Brinde) {
        this.id = id;
        this.idCliente = idCliente;
        this.numeroCliente = numeroCliente;
        this.nomeCliente = nomeCliente;
        this.bairroCliente = bairroCliente;
        this.latitude_cliente = latitude_cliente;
        this.longitude_cliente = longitude_cliente;
        this.vip = vip;
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.precoProduto = precoProduto;
        this.Brinde = Brinde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public double getLatitude_cliente() {
        return latitude_cliente;
    }

    public void setLatitude_cliente(double latitude_cliente) {
        this.latitude_cliente = latitude_cliente;
    }

    public double getLongitude_cliente() {
        return longitude_cliente;
    }

    public void setLongitude_cliente(double longitude_cliente) {
        this.longitude_cliente = longitude_cliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getBrinde() {
        return Brinde;
    }

    public void setBrinde(String Brinde) {
        this.Brinde = Brinde;
    }
    
}
