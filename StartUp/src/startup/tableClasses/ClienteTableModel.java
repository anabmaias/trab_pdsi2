/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup.tableClasses;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import startup.Cliente;

/**
 *
 * @author firmi
 */
public class ClienteTableModel extends AbstractTableModel {

        //aqui transformei em coluna cada propriedade de Funcionario
        //que eu quero que seja exibida na tabela  
        private String colunas[] = {"ID", "Nome", "Bairro", "Número", "Lat", "Long", "Vip"};
        private ArrayList<Cliente> cliente;

        private final int COLUNA_ID = 0;
        private final int COLUNA_NOME = 1;
        private final int COLUNA_BAIRRO = 2;
        private final int COLUNA_NUMERO = 3;
        private final int COLUNA_LAT = 4;
        private final int COLUNA_LONG = 5;
        private final int COLUNA_VIP = 6;

        public ClienteTableModel(ArrayList<Cliente> cliente) {
            this.cliente = cliente;
        }

        //retorna se a célula é editável ou não
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        //retorna o total de itens(que virarão linhas) da nossa lista
        @Override
        public int getRowCount() {
            return cliente.size();
        }
        //retorna o total de colunas da tabela
        @Override
        public int getColumnCount() {
            return colunas.length;
        }
        //retorna o nome da coluna de acordo com seu indice
        @Override
        public String getColumnName(int indice) {
            return colunas[indice];
        }

        //determina o tipo de dado da coluna conforme seu indice
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex) {
                case COLUNA_ID:
                    return Integer.class;
                case COLUNA_NOME:
                    return String.class;
                case COLUNA_BAIRRO:
                    return String.class;
                case COLUNA_NUMERO:
                    return Integer.class;
                case COLUNA_LAT:
                    return Double.class;
                case COLUNA_LONG:
                    return Double.class;
                case COLUNA_VIP:
                    return Boolean.class;
                default:
                    return String.class;
            }
        }

            //preenche cada célula da tabela
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {

                Cliente cliente = this.cliente.get(rowIndex);

                switch (columnIndex) {
                    case COLUNA_ID:
                        return cliente.getId();
                    case COLUNA_NOME:
                        return cliente.getNome();
                    case COLUNA_BAIRRO:
                        return cliente.getBairro();
                    case COLUNA_NUMERO:
                        return cliente.getNumero();
                    case COLUNA_LAT:
                        return cliente.getLatitude_cliente();
                    case COLUNA_LONG:
                        return cliente.getLongitude_cliente();
                    case COLUNA_VIP:
                        return cliente.isVip();
                }
                return null;
            }
            //altera o valor do objeto de acordo com a célula editada
            //e notifica a alteração da tabela, para que ela seja atualizada na tela
            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                //o argumento recebido pelo método é do tipo Object
                //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
                Cliente cliente = this.cliente.get(rowIndex);
                //de acordo com a coluna, ele preenche a célula com o valor
                //respectivo do objeto de mesmo indice na lista
                switch (columnIndex) {
                    case COLUNA_ID:
                        cliente.setId((int) aValue);
                        break;
                    case COLUNA_NOME:
                        cliente.setNome(String.valueOf(aValue));
                        break;
                    case COLUNA_BAIRRO:
                        cliente.setBairro(String.valueOf(aValue));
                        break;
                    case COLUNA_NUMERO:
                        cliente.setNumero((int) aValue);
                        break;
                    case COLUNA_LAT:
                        cliente.setLatitude_cliente((double) aValue);
                        break;
                    case COLUNA_LONG:
                        cliente.setLatitude_cliente((double) aValue);
                        break;
                    case COLUNA_VIP:
                        cliente.setVip((boolean) aValue);
                }
                //este método é que notifica a tabela que houve alteração de dados
                fireTableDataChanged();
            }
        }