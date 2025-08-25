package com.ruoyi.datamanage.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * data_manage模块的etl节点结构对象 dm_etl_task_node
 *
 * @author rds
 * @date 2025-08-25
 */
@Data
public class DmEtlTaskNode extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 节点参数的json字符串
     */
    @Excel(name = "节点参数的json字符串")
    private String nodeParam;

    /**
     * 前驱节点id列表，使用英文,分割
     */
    @Excel(name = "前驱节点id列表，使用英文,分割")
    private String parentIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeParam() {
        return nodeParam;
    }

    public void setNodeParam(String nodeParam) {
        this.nodeParam = nodeParam;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("nodeParam", getNodeParam())
                .append("parentIds", getParentIds())
                .toString();
    }
}
