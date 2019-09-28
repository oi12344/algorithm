package com.ylwl.batchRegisteration.domain;

import java.io.Serializable;
import java.util.Date;

public class GameUser implements Serializable {


    private static final long serialVersionUID = 3127687940839003040L;
    /**
     * 油菜花
     */
    private String companyId;

    /**
     * 子油菜花
     */
    private String subCompanyId;
    /**
     * 业务平台
     */
    private Integer ywId;
    /**
     * 平台ID
     */
    private  Integer platId;
    /**
     * 游戏平台
     */
    private Integer gameId;
    /**
     * 游戏
     */
    private String gameName;
    /**
     * 申请账号
     */
    private String acount;
    /**
     * 审核状态
     */
    private Integer examineStatus;
    /**
     * 审核账号数量
     */
    private Integer applyCount;
    /**
     * 申请时间
     */
    private Date applyTime;
    /**
     * B账号
     */
    private String buserAcount;
    /**
     * B-账号
     */
    private String bbuserAcount;
    /**
     * c账号
     */
    private String cuserAcount;
    /**
     * 对接人
     */
    private String bandAuser;
    /**
     * 用户序列
     */
    private Integer autoIndex;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 修改者
     */
    private String modifyBy;
    /**
     * 备注
     */
    private String remark;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getSubCompanyId() {
        return subCompanyId;
    }

    public void setSubCompanyId(String subCompanyId) {
        this.subCompanyId = subCompanyId;
    }

    public Integer getYwId() {
        return ywId;
    }

    public void setYwId(Integer ywId) {
        this.ywId = ywId;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public Integer getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(Integer examineStatus) {
        this.examineStatus = examineStatus;
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getBuserAcount() {
        return buserAcount;
    }

    public void setBuserAcount(String buserAcount) {
        this.buserAcount = buserAcount;
    }

    public String getBbuserAcount() {
        return bbuserAcount;
    }

    public void setBbuserAcount(String bbuserAcount) {
        this.bbuserAcount = bbuserAcount;
    }

    public String getCuserAcount() {
        return cuserAcount;
    }

    public void setCuserAcount(String cuserAcount) {
        this.cuserAcount = cuserAcount;
    }

    public String getBandAuser() {
        return bandAuser;
    }

    public void setBandAuser(String bandAuser) {
        this.bandAuser = bandAuser;
    }

    public Integer getAutoIndex() {
        return autoIndex;
    }

    public void setAutoIndex(Integer autoIndex) {
        this.autoIndex = autoIndex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
