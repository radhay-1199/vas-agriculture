package com.gl.agriculture.model;

public class PanelContentModal 
{
	private int cnt_id;
	private String  content_name;
	private String  image_name;
	private String  base_format;
	private String  content_type;
	private int  status;
	private String  language;
	private String  video_type;
	private String  publisher;
	private String categoryname;
	public int getCnt_id() {
		return cnt_id;
	}
	public void setCnt_id(int cnt_id) {
		this.cnt_id = cnt_id;
	}
	public String getContent_name() {
		return content_name;
	}
	public void setContent_name(String content_name) {
		this.content_name = content_name;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public String getBase_format() {
		return base_format;
	}
	public void setBase_format(String base_format) {
		this.base_format = base_format;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getVideo_type() {
		return video_type;
	}
	public void setVideo_type(String video_type) {
		this.video_type = video_type;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public String toString() {
		return "PanelContentModal [cnt_id=" + cnt_id + ", content_name=" + content_name + ", image_name=" + image_name
				+ ", base_format=" + base_format + ", content_type=" + content_type + ", status=" + status
				+ ", language=" + language + ", video_type=" + video_type + ", publisher=" + publisher
				+ ", categoryname=" + categoryname + "]";
	}
	
	
	
	
	

}
