package com.example.carteiradeclientes.database;

public class ScriptDLL {

    public static String getCreateTableCliente() {

        StringBuffer sql  = new StringBuffer();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE ( ");
        sql.append("        CODIGO INTEGER                  PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("        NOME VARCHAR(250)               NOT NULL DEFAULT(''),");
        sql.append("        ENDERECO VARCHAR(255)           NOT NULL DEFAULT(''),");
        sql.append("        EMAIL                           VARCHAR(200) NOT NULL DEFAULT(''),");
        sql.append("        TELEFONE                        VARCHAR(200) NOT NULL  DEFAULT('') ) ");

       return sql.toString();

    }

}
