package com.carrywei.pattern.bridge;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public abstract class AbstractExport {
    protected Server server;

    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * 导出
     */
    public abstract void export();
}
