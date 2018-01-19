package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tcs_info_rcv")
public class TcsInfoRcv {
    @Id
    @Column(name = "req_code")
    private String reqCode;

    @Column(name = "task_id")
    private String taskId;

    @Column(name = "task_type")
    private String taskType;

    @Column(name = "way_bill_no")
    private String wayBillNo;

    private BigDecimal weight;

    @Column(name = "camer_ip")
    private String camerIp;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "switch_code")
    private String switchCode;

    @Column(name = "agv_no")
    private String agvNo;

    @Column(name = "req_msg")
    private String reqMsg;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "msg_from")
    private String msgFrom;

    /**
     * 执行时间
     */
    @Column(name = "run_time")
    private Integer runTime;

    /**
     * 单据异常标识（0-正常 1-异常）
     */
    @Column(name = "ind_exp")
    private Integer indExp;

    /**
     * 异常类型
     */
    @Column(name = "exp_type")
    private String expType;

    /**
     * 异常详情
     */
    @Column(name = "exp_detail")
    private String expDetail;

    /**
     * 目标点x坐标
     */
    @Column(name = "dst_x")
    private BigDecimal dstX;

    /**
     * 目标点y坐标
     */
    @Column(name = "dst_y")
    private BigDecimal dstY;

    /**
     * 图片剪切地址
     */
    @Column(name = "image_cut_url")
    private String imageCutUrl;

    /**
     * 小车到达拣货口时间戳
     */
    @Column(name = "arrive_time")
    private Long arriveTime;

    /**
     * 小车离开拣货口时间戳
     */
    @Column(name = "leave_time")
    private Long leaveTime;

    /**
     * 小车在拣货口停留的时间（leave_time-arrive_time）
     */
    @Column(name = "stay_time")
    private Long stayTime;

    /**
     * 小车转弯耗时
     */
    @Column(name = "turn_time")
    private Long turnTime;

    @Column(name = "transit_pack_id")
    private String transitPackId;

    private Integer count;

    @Column(name = "map_code")
    private String mapCode;

    /**
     * @return req_code
     */
    public String getReqCode() {
        return reqCode;
    }

    /**
     * @param reqCode
     */
    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    /**
     * @return task_id
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return task_type
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * @return way_bill_no
     */
    public String getWayBillNo() {
        return wayBillNo;
    }

    /**
     * @param wayBillNo
     */
    public void setWayBillNo(String wayBillNo) {
        this.wayBillNo = wayBillNo;
    }

    /**
     * @return weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * @return camer_ip
     */
    public String getCamerIp() {
        return camerIp;
    }

    /**
     * @param camerIp
     */
    public void setCamerIp(String camerIp) {
        this.camerIp = camerIp;
    }

    /**
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return switch_code
     */
    public String getSwitchCode() {
        return switchCode;
    }

    /**
     * @param switchCode
     */
    public void setSwitchCode(String switchCode) {
        this.switchCode = switchCode;
    }

    /**
     * @return agv_no
     */
    public String getAgvNo() {
        return agvNo;
    }

    /**
     * @param agvNo
     */
    public void setAgvNo(String agvNo) {
        this.agvNo = agvNo;
    }

    /**
     * @return req_msg
     */
    public String getReqMsg() {
        return reqMsg;
    }

    /**
     * @param reqMsg
     */
    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return msg_from
     */
    public String getMsgFrom() {
        return msgFrom;
    }

    /**
     * @param msgFrom
     */
    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }

    /**
     * 获取执行时间
     *
     * @return run_time - 执行时间
     */
    public Integer getRunTime() {
        return runTime;
    }

    /**
     * 设置执行时间
     *
     * @param runTime 执行时间
     */
    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    /**
     * 获取单据异常标识（0-正常 1-异常）
     *
     * @return ind_exp - 单据异常标识（0-正常 1-异常）
     */
    public Integer getIndExp() {
        return indExp;
    }

    /**
     * 设置单据异常标识（0-正常 1-异常）
     *
     * @param indExp 单据异常标识（0-正常 1-异常）
     */
    public void setIndExp(Integer indExp) {
        this.indExp = indExp;
    }

    /**
     * 获取异常类型
     *
     * @return exp_type - 异常类型
     */
    public String getExpType() {
        return expType;
    }

    /**
     * 设置异常类型
     *
     * @param expType 异常类型
     */
    public void setExpType(String expType) {
        this.expType = expType;
    }

    /**
     * 获取异常详情
     *
     * @return exp_detail - 异常详情
     */
    public String getExpDetail() {
        return expDetail;
    }

    /**
     * 设置异常详情
     *
     * @param expDetail 异常详情
     */
    public void setExpDetail(String expDetail) {
        this.expDetail = expDetail;
    }

    /**
     * 获取目标点x坐标
     *
     * @return dst_x - 目标点x坐标
     */
    public BigDecimal getDstX() {
        return dstX;
    }

    /**
     * 设置目标点x坐标
     *
     * @param dstX 目标点x坐标
     */
    public void setDstX(BigDecimal dstX) {
        this.dstX = dstX;
    }

    /**
     * 获取目标点y坐标
     *
     * @return dst_y - 目标点y坐标
     */
    public BigDecimal getDstY() {
        return dstY;
    }

    /**
     * 设置目标点y坐标
     *
     * @param dstY 目标点y坐标
     */
    public void setDstY(BigDecimal dstY) {
        this.dstY = dstY;
    }

    /**
     * 获取图片剪切地址
     *
     * @return image_cut_url - 图片剪切地址
     */
    public String getImageCutUrl() {
        return imageCutUrl;
    }

    /**
     * 设置图片剪切地址
     *
     * @param imageCutUrl 图片剪切地址
     */
    public void setImageCutUrl(String imageCutUrl) {
        this.imageCutUrl = imageCutUrl;
    }

    /**
     * 获取小车到达拣货口时间戳
     *
     * @return arrive_time - 小车到达拣货口时间戳
     */
    public Long getArriveTime() {
        return arriveTime;
    }

    /**
     * 设置小车到达拣货口时间戳
     *
     * @param arriveTime 小车到达拣货口时间戳
     */
    public void setArriveTime(Long arriveTime) {
        this.arriveTime = arriveTime;
    }

    /**
     * 获取小车离开拣货口时间戳
     *
     * @return leave_time - 小车离开拣货口时间戳
     */
    public Long getLeaveTime() {
        return leaveTime;
    }

    /**
     * 设置小车离开拣货口时间戳
     *
     * @param leaveTime 小车离开拣货口时间戳
     */
    public void setLeaveTime(Long leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * 获取小车在拣货口停留的时间（leave_time-arrive_time）
     *
     * @return stay_time - 小车在拣货口停留的时间（leave_time-arrive_time）
     */
    public Long getStayTime() {
        return stayTime;
    }

    /**
     * 设置小车在拣货口停留的时间（leave_time-arrive_time）
     *
     * @param stayTime 小车在拣货口停留的时间（leave_time-arrive_time）
     */
    public void setStayTime(Long stayTime) {
        this.stayTime = stayTime;
    }

    /**
     * 获取小车转弯耗时
     *
     * @return turn_time - 小车转弯耗时
     */
    public Long getTurnTime() {
        return turnTime;
    }

    /**
     * 设置小车转弯耗时
     *
     * @param turnTime 小车转弯耗时
     */
    public void setTurnTime(Long turnTime) {
        this.turnTime = turnTime;
    }

    /**
     * @return transit_pack_id
     */
    public String getTransitPackId() {
        return transitPackId;
    }

    /**
     * @param transitPackId
     */
    public void setTransitPackId(String transitPackId) {
        this.transitPackId = transitPackId;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return map_code
     */
    public String getMapCode() {
        return mapCode;
    }

    /**
     * @param mapCode
     */
    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }
}