package org.albert.course.message.resp;

public class Article {
	// ͼ����Ϣ����
	private String Title;
	// ͼ����Ϣ����
	private String Description;
	// ͼƬ���ӣ�֧�� JPG��PNG ��ʽ���Ϻõ�Ч��Ϊ��ͼ 640*320��Сͼ 80*80������ͼƬ
	//���ӵ�������Ҫ�뿪������д�Ļ��������е� Url һ��
	private String PicUrl;
	// ���ͼ����Ϣ��ת����
	private String Url;
	
	public String getTitle() {
	  return Title;
	}
	
	public void setTitle(String title) {
	   Title = title;
	}
	
	public String getDescription() {
	   return null == Description ? "" : Description;
	}
	
	public void setDescription(String description) {
	    Description = description;
	}
	
	public String getPicUrl() {
	    return null == PicUrl ? "" : PicUrl;
	}
	
	public void setPicUrl(String picUrl) {
	    PicUrl = picUrl;
	}
	
	public String getUrl() {
	    return null == Url ? "" : Url;
	}
	
	public void setUrl(String url) {
	   Url = url;
	}

}
