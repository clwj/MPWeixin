package org.albert.menu.main;

import org.apache.log4j.Logger;
import org.albert.menu.pojo.AccessToken;
import org.albert.menu.pojo.Button;
import org.albert.menu.pojo.CommonButton;
import org.albert.menu.pojo.ComplexButton;
import org.albert.menu.pojo.Menu;
import org.albert.menu.pojo.ViewButton;
import org.albert.menu.util.WeixinUtil;

///菜单管理类
//Author  Wenjian Lu
/// Date   2017.10.31

public class MenuManager {
	private static final Logger log = Logger.getLogger(MenuManager.class);
	public static void logError(String strError){
		log.error(strError);
	}
	public static void logInfo(String strInfo){
	    log.info(strInfo);
    }
    public static void logWarning(String strWarn){
	    log.warn(strWarn);
    }
    public static void logDebug(String strDebug){
        log.debug(strDebug);
    }

	public static void main(String[] args) {
		
	   // 第三方用户唯一凭证
	   String appId = "xxxxxxxxxxxxx";
	   // 第三方用户唯一凭证密钥
	   String appSecret = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	// 调用接口获取 access_token
	   AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);
	   if (null != at) {
		// 调用接口创建菜单
		int result = WeixinUtil.createMenu(getMenu(), at.getToken());
		// 判断菜单创建结果
		if (0 == result){
			logInfo("菜单创建成功！");
		}
		else
            logInfo("菜单创建失败，错误码：" + result);
	   }
	}
	
	/**
	* 组装菜单数据
	*
	* @return
	*/
	
	private static Menu getMenu() {
		//第一个  二级菜单创建
		CommonButton btn11 = new CommonButton();
		btn11.setName("找老师");
		btn11.setType("click");
		btn11.setKey("11");
		
		CommonButton btn12 = new CommonButton();
		btn12.setName("找工作");
		btn12.setType("click");
		btn12.setKey("12");
		
		CommonButton btn13 = new CommonButton();
		btn13.setName("找教师");
		btn13.setType("click");
		btn13.setKey("13");
		
		CommonButton btn14 = new CommonButton();
		btn14.setName("北舞教师考级");
		btn14.setType("click");
		btn14.setKey("14");
		
		/// 第二个二级菜单创建
		CommonButton btn21 = new CommonButton();
		btn21.setName("机构信息");
		btn21.setType("click");
		btn21.setKey("21");
		
		CommonButton btn22 = new CommonButton();
		btn22.setName("教师信息");
		btn22.setType("click");
		btn22.setKey("22");
		
		CommonButton btn23 = new CommonButton();
		btn23.setName("信息分享");
		btn23.setType("click");
		btn23.setKey("23");
		
		
		///第三个二级菜单创建
		ViewButton btn31 = new ViewButton();
		btn31.setName("往期精彩");
		btn31.setType("view");
		btn31.setUrl("http://ac8ff88f.ngrok.io/Dance/index.html");
		
		CommonButton btn32 = new CommonButton();
		btn32.setName("联系方式");
		btn32.setType("click");
		btn32.setKey("32");
		
		CommonButton btn33 = new CommonButton();
		btn33.setName("线下教师");
		btn33.setType("click");
		btn33.setKey("33");
		
		CommonButton btn34 = new CommonButton();
		btn34.setName("合作平台");
		btn34.setType("click");
		btn34.setKey("34");
		
		//一级菜单创建
		
		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("共享信息");
		mainBtn1.setSub_button(new CommonButton[] { btn11, btn12,btn13,btn14});
		
		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("建立档案");
	    mainBtn2.setSub_button(new CommonButton[] { btn21, btn22,btn23});
	    
	    ComplexButton mainBtn3 = new ComplexButton();
	    mainBtn3.setName("关于我们");
	    mainBtn3.setSub_button(new Button[] { btn31,btn32,btn33,btn34 });
	    
	    Menu menu = new Menu();
	    menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });
	    
	    return menu;
		
	}
	

}
