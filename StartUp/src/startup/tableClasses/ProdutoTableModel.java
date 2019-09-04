/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup.tableClasses;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import startup.Produto;

/**
 *
 * @author firmi
 */
public class ProdutoTableModel extends AbstractTableModel {

        //aqui transformei em coluna cada propriedade de Funcionario
        //que eu quero que seja exibida na tabela  
        private String colunas[] = {"ID", "Nome", "Preço", "Quantidade"};
        private ArrayList<Produto> produto;

        private final int COLUNA_ID = 0;
        private final int COLUNA_NOME = 1;
        private final int COLUNA_PRECO = 2;
        private final int COLUNA_QTD = 3;

        public ProdutoTableModel(ArrayList<Produto> produto) {
            this.produto = produto;
        }

        //retorna se a célula é editável ou não
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        //retorna o total de itens(que virarão linhas) da nossa lista
        @Override
        public int getRowCount() {
            return produto.size();
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
                case COLUNA_PRECO:
                    return Double.class;
                case COLUNA_QTD:
                    return Double.class;
                default:
                    return String.class;
            }
        }

            //preenche cada célula da tabela
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {

                Produto produto = this.produto.get(rowIndex);

                switch (columnIndex) {
                    case COLUNA_ID:
                        return produto.getId();
                    case COLUNA_NOME:
                        return produto.getNome();
                    case COLUNA_PRECO:
                        return produto.getPrice();
                    case COLUNA_QTD:
                        return produto.getQuantidade();
                }
                return null;
            }
            //altera o valor do objeto de acordo com a célula editada
            //e notifica a alteração da tabela, para que ela seja atualizada na tela
            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                //o argumento recebido pelo método é do tipo Object
                //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
                Produto produto = this.produto.get(rowIndex);
                //de acordo com a coluna, ele preenche a célula com o valor
                //respectivo do objeto de mesmo indice na lista
                switch (columnIndex) {
                    case COLUNA_ID:
                        produto.setId((int) aValue);
                        break;
                    case COLUNA_NOME:
                        produto.setNome(String.valueOf(aValue));
                        break;
                    case COLUNA_PRECO:
                        produto.setPrice((double) aValue);
                        break;
                    case COLUNA_QTD:
                        produto.setQuantidade((int) aValue);
                        break;
                }
                //este método é que notifica a tabela que houve alteração de dados
                fireTableDataChanged();
            }
        }