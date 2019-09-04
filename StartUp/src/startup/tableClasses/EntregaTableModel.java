/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup.tableClasses;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import startup.Entrega;

/**
 *
 * @author firmi
 */
public class EntregaTableModel extends AbstractTableModel {

        //aqui transformei em coluna cada propriedade de Funcionario
        //que eu quero que seja exibida na tabela  
        private String colunas[] = {"ID", "Cliente", "Produto", "Preço", "Quantidade", "Lat", "Long", "Brinde"};
        private ArrayList<Entrega> entrega;

        private final int COLUNA_ID = 0;
        private final int COLUNA_CLIENTE = 1;
        private final int COLUNA_PRODUTO = 2;
        private final int COLUNA_PRECO = 3;
        private final int COLUNA_QTD = 4;
        private final int COLUNA_LAT = 5;
        private final int COLUNA_LONG = 6;
        private final int COLUNA_BRINDE = 7;

        public EntregaTableModel(ArrayList<Entrega> entrega) {
            this.entrega = entrega;
        }

        //retorna se a célula é editável ou não
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        //retorna o total de itens(que virarão linhas) da nossa lista
        @Override
        public int getRowCount() {
            return entrega.size();
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
                case COLUNA_CLIENTE:
                    return String.class;
                case COLUNA_PRODUTO:
                    return String.class;
                case COLUNA_PRECO:
                    return Double.class;
                case COLUNA_QTD:
                    return Double.class;
                case COLUNA_LAT:
                    return Double.class;
                case COLUNA_LONG:
                    return Double.class;
                case COLUNA_BRINDE:
                    return String.class;
                default:
                    return String.class;
            }
        }

            //preenche cada célula da tabela
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {

                Entrega entrega = this.entrega.get(rowIndex);

                switch (columnIndex) {
                    case COLUNA_ID:
                        return entrega.getId();
                    case COLUNA_CLIENTE:
                        return entrega.getNomeCliente();
                    case COLUNA_PRODUTO :
                        return entrega.getNomeProduto();
                    case COLUNA_PRECO:
                        return entrega.getPrecoProduto();
                    case COLUNA_QTD:
                        return entrega.getQtdProduto();
                    case COLUNA_LAT:
                        return entrega.getLatitude_cliente();
                    case COLUNA_LONG:
                        return entrega.getLongitude_cliente();
                    case COLUNA_BRINDE:
                        return entrega.getBrinde();
                }
                return null;
            }
            //altera o valor do objeto de acordo com a célula editada
            //e notifica a alteração da tabela, para que ela seja atualizada na tela
            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                //o argumento recebido pelo método é do tipo Object
                //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
                Entrega entrega = this.entrega.get(rowIndex);
                //de acordo com a coluna, ele preenche a célula com o valor
                //respectivo do objeto de mesmo indice na lista
                switch (columnIndex) {
                    case COLUNA_ID:
                        entrega.setId((int) aValue);
                        break;
                    case COLUNA_CLIENTE:
                        entrega.setNomeCliente(String.valueOf(aValue));
                        break;
                    case COLUNA_PRODUTO:
                        entrega.setNomeProduto(String.valueOf(aValue));
                        break;
                    case COLUNA_PRECO:
                        entrega.setPrecoProduto((double) aValue);
                        break;
                    case COLUNA_QTD:
                        entrega.setQtdProduto((int) aValue);
                        break;
                    case COLUNA_LAT:
                        entrega.setLatitude_cliente((double) aValue);
                        break;                    
                    case COLUNA_LONG:
                        entrega.setLongitude_cliente((double) aValue);
                        break;            
                    case COLUNA_BRINDE:
                        entrega.setBrinde(String.valueOf(aValue));
                        break;            
                }
                //este método é que notifica a tabela que houve alteração de dados
                fireTableDataChanged();
            }
        }
