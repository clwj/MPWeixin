package org.albert.menu.pojo;

//复杂菜单的封装（一级菜单）
//Author Wenjian Lu
//Date   2017.10.31

public class ComplexButton extends Button {
	
	private Button[]  sub_button;
	 
	public Button[]  getSub_button()
	{
		return sub_button;
	}
	
	public void setSub_button(Button[] sub_button){
		this.sub_button = sub_button;
	}

}
