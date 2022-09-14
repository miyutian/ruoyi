package com.ruoyi.source.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 参数配置表 source_list
 * 
 * @author ruoyi
 */
public class SouStateList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 参数主键 */
    @Excel(name = "参数主键", cellType = ColumnType.NUMERIC)
    private Long id;

    /** 参数名称 */
    @Excel(name = "参数名称")
    private String state;

    /** 参数键名 */
    @Excel(name = "参数键名")
    private String price;

    public Long getId() { return id; }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String State)
    {
        this.state = State;

    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SouStateList{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}