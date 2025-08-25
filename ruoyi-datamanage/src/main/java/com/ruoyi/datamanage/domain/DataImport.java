package com.ruoyi.datamanage.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 数据引接记录对象 dm_data_import
 *
 * @author rds
 * @date 2025-08-25
 */
@Data
public class DataImport extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 数据引接id
     */

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 引接名称
     */
    @Excel(name = "引接名称")
    private String name;

    /**
     * 数据库名称
     */
    @Excel(name = "数据库名称")
    private String dbName;

    /**
     * 数据表名称
     */
    @Excel(name = "数据表名称")
    private String tableName;

    /**
     * 引接类型：1表示实时引接，2表示文件引接，3表示数据库引接
     */
    @Excel(name = "引接类型：1表示实时引接，2表示文件引接，3表示数据库引接")
    private Integer importType;

    /**
     * 数据库类型
     */
    @Excel(name = "数据库类型")
    private String databaseType;

    /**
     * 数据库地址
     */
    @Excel(name = "数据库地址")
    private String databaseSite;

    /**
     * 数据库用户名称
     */
    @Excel(name = "数据库用户名称")
    private String databaseUsername;

    /**
     * 数据库密码
     */
    @Excel(name = "数据库密码")
    private String databasePossword;

    /**
     * 数据库端口号
     */
    @Excel(name = "数据库端口号")
    private String dbPort;

    /**
     * 数据类型：1图片、2音频、3视频、4文本、5结构化数据
     */
    @Excel(name = "数据类型：1图片、2音频、3视频、4文本、5结构化数据")
    private Integer dataType;

    /**
     * 数据量大小
     */
    @Excel(name = "数据量大小")
    private Integer dataSize;

    /**
     * 创建用户
     */
    @Excel(name = "创建用户")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long createUser;

    /**
     * 创建用户名称
     */
    @Excel(name = "创建用户名称")
    private String createUserName;

    /**
     * 更新用户
     */
    @Excel(name = "更新用户")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long updateUser;

    /**
     * 更新用户名称
     */
    @Excel(name = "更新用户名称")
    private String updateUserName;

    /**
     * 引接后在本系统中的表名称
     */
    @Excel(name = "引接后在本系统中的表名称")
    private String copyedTableName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Integer getImportType() {
        return importType;
    }

    public void setImportType(Integer importType) {
        this.importType = importType;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getDatabaseSite() {
        return databaseSite;
    }

    public void setDatabaseSite(String databaseSite) {
        this.databaseSite = databaseSite;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    public String getDatabasePossword() {
        return databasePossword;
    }

    public void setDatabasePossword(String databasePossword) {
        this.databasePossword = databasePossword;
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public String getCopyedTableName() {
        return copyedTableName;
    }

    public void setCopyedTableName(String copyedTableName) {
        this.copyedTableName = copyedTableName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("dbName", getDbName())
                .append("tableName", getTableName())
                .append("importType", getImportType())
                .append("databaseType", getDatabaseType())
                .append("databaseSite", getDatabaseSite())
                .append("databaseUsername", getDatabaseUsername())
                .append("databasePossword", getDatabasePossword())
                .append("dbPort", getDbPort())
                .append("dataType", getDataType())
                .append("dataSize", getDataSize())
                .append("remark", getRemark())
                .append("createTime", getCreateTime())
                .append("createUser", getCreateUser())
                .append("createUserName", getCreateUserName())
                .append("updateTime", getUpdateTime())
                .append("updateUser", getUpdateUser())
                .append("updateUserName", getUpdateUserName())
                .append("copyedTableName", getCopyedTableName())
                .toString();
    }
}
