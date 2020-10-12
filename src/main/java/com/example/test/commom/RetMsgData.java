package com.example.test.commom;

import com.example.test.entity.Worker;

import java.io.Serializable;

/**
 * @author wangjian
 * 返回給前端的消息对象
 *
 */
public class RetMsgData<T> implements Serializable{
	private static final long serialVersionUID = -7383519722033987904L;

	/**
	 * 100以前做全局通用返回码，100之后每个接口自定义，在rap接口管理系统中说明
	 */
	private Integer state;
	/**
	 * 信息
	 */
	private String msg;
	private T data;
	/**
	 * 更新后的对象信息
	 */
	private transient Object newObjectLog;
	/**
	 * 更新前的对象信息
	 */
	private transient Object oldObjectLog;
	/**
	 * 新增或者删除的对象信息
	 */
	private transient Object addOrDeleteObjectLog;

	/**
	 * 修改的对象
	 */
	private transient String operObject;

	public String getOperObject() {
		return operObject;
	}

	public void setOperObject(String operObject) {
		this.operObject = operObject;
	}

	public RetMsgData() {
		this.setState(State.RET_STATE_SUCCESS);
	}

    public RetMsgData(State errorCodeEn) {
        this.state = errorCodeEn.getState();
        this.setMsg(errorCodeEn.getMsg());
    }

	public RetMsgData(State errorCodeEn, T data) {
        this.state =errorCodeEn.getState();
        this.setMsg(errorCodeEn.getMsg());
		this.data = data;
	}

	public Integer getState() {
		return state;
	}

    public void setState(State errorCodeEn) {
        this.state = errorCodeEn.getState();
        this.setMsg(errorCodeEn.getMsg());
    }

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getNewObjectLog() {
		return newObjectLog;
	}

	public void setNewObjectLog(Object newObjectLog) {
		this.newObjectLog = newObjectLog;
	}

	public Object getOldObjectLog() {
		return oldObjectLog;
	}

	public void setOldObjectLog(Object oldObjectLog) {
		this.oldObjectLog = oldObjectLog;
	}

	public Object getAddOrDeleteObjectLog(Worker worker) {
		return addOrDeleteObjectLog;
	}

	public void setAddOrDeleteObjectLog(Object addOrDeleteObjectLog) {
		this.addOrDeleteObjectLog = addOrDeleteObjectLog;
	}

}
