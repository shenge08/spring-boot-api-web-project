package com.company.project.vo;

/**
 * @author chenhuishen
 * @desc
 * @date 2018/1/19
 */
public class BasePageVO {
    //分页页数
    private Integer page ;

    //每页大小
    private Integer size;

    public BasePageVO() {
        this.page = 1;
        this.size = 10;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
