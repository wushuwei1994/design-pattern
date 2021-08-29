package com.carrywei.pattern.bridge.simple;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public class Main {
    public static void main(String[] args) {
        Export mySQLTxtExport = new MySQLTxtExport();
        mySQLTxtExport.export();

        Export oracleTxtExport = new OracleTxtExport();
        oracleTxtExport.export();
    }
}
