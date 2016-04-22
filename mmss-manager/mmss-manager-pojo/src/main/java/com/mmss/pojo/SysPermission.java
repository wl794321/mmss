package com.mmss.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SysPermission implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -232895120132798733L;

	private Long id;

    private String name;

    private String type;

    private String url;

    private String percode;

    private Long parentid;

    private String parentids;

    private String sortstring;

    private String available;
    @JsonProperty("iconCls")
    private String icon;
    

    public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

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
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getParentids() {
        return parentids;
    }

    public void setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
    }

    public String getSortstring() {
        return sortstring;
    }

    public void setSortstring(String sortstring) {
        this.sortstring = sortstring == null ? null : sortstring.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

	@Override
	public String toString() {
		return "SysPermission [id=" + id + ", name=" + name + ", type=" + type + ", url=" + url + ", percode=" + percode
				+ ", parentid=" + parentid + ", parentids=" + parentids + ", sortstring=" + sortstring + ", available="
				+ available + "]";
	}
    
    
}