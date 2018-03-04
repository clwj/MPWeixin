package org.albert.course.message.resp;

//����ͼ�������  ��������Ϣ�ķ�װ

public class NewsInfo {
	//����
	private String Article;
	//��Ϣ��Դ
	private String Source;
	//ͼ���ַ
	private String Icon;
	//��ϸ��ַ
	private String DetailUrl;
	
	//����
	public String getArticle(){
		return Article;
	}
	
	public void setArticle(String article){
		 this.Article = article;
	 }
	//��Ϣ��Դ
	public String getSource(){
		return Source;
	}
	public void setSource(String source){
		this.Source = source;
	}
	//ͼƬ��ַ
	
	public String getIcon(){
		return Icon;
	}
	public void setIcon(String icon){
		this.Icon = icon;
	}
	
	//��ϸ��ַ
    public String getDetailUrl(){
    	return DetailUrl;
    }
    public void setDetailUrl(String detialurl){
    	this.DetailUrl = detialurl;
    }
	
	 
	

}
