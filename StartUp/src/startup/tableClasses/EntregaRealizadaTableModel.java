/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup.tableClasses;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import startup.EntregaR;

/**
 *
 * @author firmi
 */
public class EntregaRealizadaTableModel extends AbstractTableModel {

        //aqui transformei em coluna cada propriedade de Funcionario
        //que eu quero que seja exibida na tabela  
        private String colunas[] = {"ID", "Cliente", "Produto", "Preço", "Quantidade", "Distancia", "Brinde"};
        private ArrayList<EntregaR> entregaR;

        private final int COLUNA_ID = 0;
        private final int COLUNA_CLIENTE = 1;
        private final int COLUNA_PRODUTO = 2;
        private final int COLUNA_PRECO = 3;
        private final int COLUNA_QTD = 4;
        private final int COLUNA_DISTANCIA = 5;
        private final int COLUNA_BRINDE = 6;

        public EntregaRealizadaTableModel(ArrayList<EntregaR> entregaR) {
            this.entregaR = entregaR;
        }

        //retorna se a célula é editável ou não
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        //retorna o total de itens(que virarão linhas) da nossa lista
        @Override
        public int getRowCount() {
            return entregaR.size();
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
                case COLUNA_DISTANCIA:
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

                EntregaR entregaR = this.entregaR.get(rowIndex);

                switch (columnIndex) {
                    case COLUNA_ID:
                        return entregaR.getId();
                    case COLUNA_CLIENTE:
                        return entregaR.getNomeCliente();
                    case COLUNA_PRODUTO :
                        return entregaR.getNomeProduto();
                    case COLUNA_PRECO:
                        return entregaR.getPrecoProduto();
                    case COLUNA_QTD:
                        return entregaR.getQtdProduto();
                    case COLUNA_DISTANCIA:
                        return entregaR.getDistancia();
                    case COLUNA_BRINDE:
                        return entregaR.getBrinde();
                }
                return null;
            }
            //altera o valor do objeto de acordo com a célula editada
            //e notifica a alteração da tabela, para que ela seja atualizada na tela
            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                //o argumento recebido pelo método é do tipo Object
                //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
                EntregaR entregaR = this.entregaR.get(rowIndex);
                //de acordo com a coluna, ele preenche a célula com o valor
                //respectivo do objeto de mesmo indice na lista
                switch (columnIndex) {
                    case COLUNA_ID:
                        entregaR.setId((int) aValue);
                        break;
                    case COLUNA_CLIENTE:
                        entregaR.setNomeCliente(String.valueOf(aValue));
                        break;
                    case COLUNA_PRODUTO:
                        entregaR.setNomeProduto(String.valueOf(aValue));
                        break;
                    case COLUNA_PRECO:
                        entregaR.setPrecoProduto((double) aValue);
                        break;
                    case COLUNA_QTD:
                        entregaR.setQtdProduto((int) aValue);
                        break;
                    case COLUNA_DISTANCIA:
                        entregaR.setDistancia((double) aValue);
                        break;
                    case COLUNA_BRINDE:
                        entregaR.setBrinde(String.valueOf(aValue));
                        break;            
                }
                //este método é que notifica a tabela que houve alteração de dados
                fireTableDataChanged();
            }
        }

    
