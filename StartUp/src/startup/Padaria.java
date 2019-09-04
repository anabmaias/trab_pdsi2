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
public class Padaria {
        
        public String nome;
        public double latitude_padaria;
        public double longitude_padaria;

        public Padaria(String nome, double latitude_padaria, double longitude_padaria) {
            this.nome = nome;
            this.latitude_padaria = latitude_padaria;
            this.longitude_padaria = longitude_padaria;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getLatitude_padaria() {
            return latitude_padaria;
        }

        public void setLatitude_padaria(double latitude_padaria) {
            this.latitude_padaria = latitude_padaria;
        }

        public double getLongitude_padaria() {
            return longitude_padaria;
        }

        public void setLongitude_padaria(double longitude_padaria) {
            this.longitude_padaria = longitude_padaria;
        }
    }
