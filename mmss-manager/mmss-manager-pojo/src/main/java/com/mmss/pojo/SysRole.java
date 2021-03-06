package com.mmss.pojo;

import java.io.Serializable;

public class SysRole implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1389865408116452576L;

	private String id;

    private String name;

    private String available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

	@Override
	public String toString() {
		return "SysRole [id=" + id + ", name=" + name + ", available=" + available + "]";
	}
    
}