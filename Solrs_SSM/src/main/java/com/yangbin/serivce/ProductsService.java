package com.yangbin.serivce;


import com.yangbin.utils.PageUtils;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;


/**
 * Created by
 *
 * @author 風起雲落乀
 * @Date 2020/5/26/026
 * @Time 8:55
 */
public interface ProductsService {

    /**
     * 电商主页 京东
     * @param keyword   关键字
     * @param catalogName   商品名
     * @param priceStr  价格
     * @param psort 排序方式
     * @param currtPage 当前页
     * @param pageSize 每页大小
     * @return
     */
    public PageUtils search(String keyword, String catalogName, String priceStr, String psort,
                            Integer currtPage, Integer pageSize) throws IOException, SolrServerException;
}






