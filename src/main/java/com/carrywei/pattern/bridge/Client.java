package com.carrywei.pattern.bridge;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public class Client {
    public static void main(String[] args) {
        Server server = new MySQLServer();
        AbstractExport txtExport = new TxtExport();
        txtExport.setServer(server);
        txtExport.export();
    }
}
