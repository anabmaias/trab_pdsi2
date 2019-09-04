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

    public class Cliente {

        public int id;
        public int numero;
        public String nome;
        public String bairro;
        public double latitude_cliente;
        public double longitude_cliente;
        public boolean vip;

        public Cliente(int id, String nome, int numero, String bairro, double latitude_cliente, double longitude_cliente, boolean vip) {
            this.id = id;
            this.nome = nome;
            this.numero = numero;
            this.bairro = bairro;
            this.latitude_cliente = latitude_cliente;
            this.longitude_cliente = longitude_cliente;
            this.vip = vip;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
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


    }