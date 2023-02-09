package cn.tedu.csmall.commons.pojo.cart.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: sweeterjava@163.com
 * @Date: 2023/2/8
 * @Time: 18:25
 */

@Data
// 声明使用在Knife4j测试中
@ApiModel
public class CartAddDTO implements Serializable {
    @ApiModelProperty(value = "商品编号",name = "commodityCode",example = "PC001")
    private String commodityCode;
    @ApiModelProperty(value = "价格",name = "price",example = "20")
    private Integer price;
    @ApiModelProperty(value = "数量",name = "count",example = "5")
    private Integer count;
    @ApiModelProperty(value = "用户Id",name = "userId",example = "UU001")
    private String userId;

}