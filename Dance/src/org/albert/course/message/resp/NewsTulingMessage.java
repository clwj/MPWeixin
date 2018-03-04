package org.albert.course.message.resp;

import java.util.List;


///���ڷ�װͼ�������������Ϣ

public class NewsTulingMessage extends BaseMessage {
	   // ������Ϣ����������Ϊ 10 ������
		private int NewsCount;
		// ����ͼ����Ϣ��Ϣ��Ĭ�ϵ�һ�� item Ϊ��ͼ
		private List<NewsInfo> News;
		
		public int getArticleCount() {
		   return NewsCount;
		}

	    public void setNewsCount(int newsCount) {
	    	NewsCount = newsCount;
		}
		
		public List<NewsInfo> getNews() {
		    return News;
		}
		
		public void setNews(List<NewsInfo> news) {
			News = news;
		}
	

}
